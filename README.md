# GroupMaster Android App

This project is ready for Codemagic online builds.

## Features
- Login and Dashboard screens
- Group creation & admin-controlled restrictions
- CSV bulk contact import
- Messaging placeholders with WebSocket support
- Members cannot leave groups

## Codemagic Setup
1. Connect this repository to [Codemagic](https://codemagic.io)
2. Set signing environment variables:
   - CM_KEYSTORE_PASSWORD
   - CM_KEY_PASSWORD
   - CM_KEY_ALIAS
3. Build commands:
   - APK: `./gradlew assembleRelease`
   - AAB: `./gradlew bundleRelease`
4. Download your APK/AAB directly from Codemagic

## CSV Format
- Columns: `Name,PhoneNumber`
