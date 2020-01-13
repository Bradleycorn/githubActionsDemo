const core = require('@actions/core');

try {
  const input = core.getInput('input');
  const replace = core.getInput('replace');
  const with = core.getInput('with');
  const caseSensitive = core.getInput('case-sensitive');
  
  var pattern = "g";
  if (!caseSensitive) {
    pattern += "i";
  }
  
  const regex = RegExp(replace, pattern);
  
  core.setOutput('result', input.replace(regex, with))
} catch (error) {
  core.setFailed(error.message);
}
