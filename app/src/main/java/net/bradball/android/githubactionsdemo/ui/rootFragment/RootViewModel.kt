package net.bradball.android.githubactionsdemo.ui.rootFragment

import android.app.Application
import android.content.Context
import android.content.pm.PackageManager
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class RootViewModel @Inject constructor(app: Application) : AndroidViewModel(app) {
    val version: String
        get() {
            val application = getApplication<Application>()
            return application.packageManager.getPackageInfo(application.packageName, 0).versionName
        }
}
