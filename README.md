AndroidDevBuddy
===============

Android app designed to help Android developers find resources, colors, icons quickly and easily to save time.

Plan is to create app with [Google's action bar icons](https://developer.android.com/design/downloads/index.html) and then release app to Play Store.

### Contribute

Have any ideas on how to make this app even better for Android devs? Awesome! Pull requests are always welcome. Have feature ideas? Create an [issue](https://github.com/levibostian/AndroidDevBuddy/issues) and we can get working on it.

AndroidDevBuddy is created using [Android Studio](https://developer.android.com/tools/studio/index.html). Just pull down this code and open it with Studio. Should be that easy to get started contributing. 

##### Action bar icons generator (updating actionbar icon assets)

To get all of those awesome actionbar icons in the app, I made to make a script to do so because Google put all of the actionbar icons all in separate directories.

*Before you run the script to generate new, you should go through the mipmap drawable directories first and delete the old ones as this script does not remove old.*

The script is located in the root of the project named `actionbaricon_export.sh`. Follow these steps to get the script to work:
1. [Go here and download the action bar icon pack](https://developer.android.com/design/downloads/index.html)
2. Open up the zip file you downloaded. In the zip, browse to: `Android Design - Icons 20131120 > Action Bar Icons` and extract the `holo_light` directory into the root of the source code.
3. Run the script.

The script has now generated new icons in the mipmap directories. 

Also, open up the file: `exported_actionbar_icons_values.txt` and copy all of the code found in there into the file: `app/src/main/java/com/levibostian/androiddevbuddy/vo/ActionBarIconVo.java`. 
