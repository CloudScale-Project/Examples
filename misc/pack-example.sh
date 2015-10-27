#!/bin/bash

EXAMPLE_DIR=$1
TARGET_DIR=$2

if ! [[ -d $EXAMPLE_DIR ]] ; then
	echo "Example and Target dir required."
	exit 1
fi

if ! [[ -d $TARGET_DIR ]] ; then
	echo "Example and Target dir required."
	exit 1
fi

pushd $EXAMPLE_DIR

project_name=${PWD##*/}  

pandoc -s README.md -o README-$project_name.html

for f in *; do
    if [[ -d $f ]]; then
    	pushd $f
    	zip_file="$project_name-$f.zip"
    	zip -r "$zip_file" * .project .classpath
    	mv "$zip_file" ../
    	pandoc -s README.md -o ../README-$project_name-$f.html
    	popd
    fi
done

popd

mv $EXAMPLE_DIR/*.zip $TARGET_DIR 
mv $EXAMPLE_DIR/*.html $TARGET_DIR 
