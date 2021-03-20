# Android Template

[![CI Results](https://github.com/sindrenm/android-template/actions/workflows/ci.yml/badge.svg)][ci-results]

Template for new Android apps. Includes two modules, _:app_ and _:dna_. Dependencies and versions are declared centrally
in a Gradle _buildSrc_ directory, to keep them in sync between modules.

Continuous integration with GitHub Actions is enabled for pushes to all branches. The checks involve linting Kotlin
code, linting Android, running unit and instrumented tests, and building a debug APK.

This template also includes an _.editorconfig_ file, as well as some IDEA code style configuration. You may wish to
tweak some of those settings to suit your style.

## Using this template

To use this template, click the “Use this template” button in the GitHub UI above. This will set you up with a new
repository. After you've created your repo, you'll likely want to change a few things, like the application ID, the
app's name, etc. These things will be named with the word “template” (in the appropriate casing), such as:

| What                     | Template repo value         |
| :----------------------- | :-------------------------- |
| Application ID           | dev.sindrenm.template.app   |
| Theme                    | Theme.Template              |
| Application name         | Android App Template        |
| Gradle root project name | android-template            |
| …                        | …                           |

A simple project-wide case-insensitive search for the word “template” should get you pretty far.

[ci-results]: https://github.com/sindrenm/android-template/actions/workflows/ci.yml
