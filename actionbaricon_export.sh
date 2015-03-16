#!/bin/bash

DRAWABLE_PATH="app/src/main/res"
EXPORT_FILE="exported_actionbar_icons_values.txt"
FILE_NAME="" # used to hold onto drawable file name once assigned. 
DIRECTORY_EXT="" # used to get the directory extension (example: hdpi) from each directory.

cd holo_light

for directory in *; do
    cd "$directory"

    # copy over all the icons to a directory for me to add to app easily.
    for drawabledir in *; do
        cd "$drawabledir"
        for file in *; do
            FILE_NAME="$file"
            DIRECTORY_EXT=${drawabledir#*-}
            cp * ../../../"$DRAWABLE_PATH"/"mipmap-$DIRECTORY_EXT"/"$file"
        done
        cd ../
    done
    cd ../
    file_no_ext=${FILE_NAME%.*}
    echo "actionBarIcons.add(new ActionBarIconVo(R.mipmap.$file_no_ext, \"$directory\"));" >> "../$EXPORT_FILE"
done

