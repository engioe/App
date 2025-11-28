# GroupMaster Android App

This is the Android app project for GroupMaster, a secure group messaging app with admin-controlled groups.

## Build Instructions (Codemagic)

1. Connect this repository to [Codemagic](https://codemagic.io)
2. Set environment variables for signing (keystore, alias, passwords)
3. Trigger a build:
   - APK: `./gradlew assembleRelease`
   - AAB: `./gradlew bundleRelease`
4. Download the generated APK/AAB directly from Codemagic

## Requirements

- Android SDK 34
- Kotlin 1.9
- Gradle 8.2+
