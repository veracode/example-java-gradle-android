
# [:] Example Android Project

An example Android project to demonstrate [SourceClear](https://www.sourceclear.com) scans.

## Try me!

Clone this project:

```sh
git@github.com:srcclr/example-java-gradle-android.git
cd example-java-gradle-android
```

Specify the location of the Android SDK in `local.properties`:

```sh
echo 'sdk.dir=/path/to/Android/sdk' > local.properties
```

[Specify your API token](https://www.sourceclear.com/docs/gradle-plugin/), then invoke the plugin:

```sh
./gradlew srcclr
```
