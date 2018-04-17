
# [:] Example Android Project

An example Android project to demonstrate [SourceClear](https://www.sourceclear.com) scans.

## Try me!

Start by [installing the agent](https://www.sourceclear.com/docs/command-line-interface/).

Clone this project:

```sh
git clone git@github.com:srcclr/example-java-gradle-android.git
cd example-java-gradle-android
```

Specify the location of the Android SDK in `local.properties`:

```sh
echo 'sdk.dir=/path/to/Android/sdk' > local.properties
```

Kick off a scan:

```sh
srcclr scan
```

## Using the [Gradle plugin](https://plugins.gradle.org/plugin/com.srcclr.gradle)

Check out this [branch](https://github.com/srcclr/example-java-gradle-android/tree/plugin).
