package net.bradball.android.githubactionsdemo.ui.rootFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import dagger.android.support.DaggerFragment

import net.bradball.android.githubactionsdemo.R
import net.bradball.android.githubactionsdemo.di.ViewModelFactory
import javax.inject.Inject

class RootFragment : DaggerFragment() {

    @Inject
    protected lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by viewModels<RootViewModel> { viewModelFactory }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)

        view.findViewById<TextView>(R.id.version_info).text = getString(R.string.app_version, viewModel.version)

        return view
    }

}
