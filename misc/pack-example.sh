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

for f in *; do
    if [[ -d $f ]]; then
    	pushd $f
    	pandoc -s README.md -o README.html
    	zip_file="$project_name-$f.zip"
    	zip -r "$zip_file" * .project
    	mv "$zip_file" ../
    	rm README.html
    	popd
    fi
done

popd


mv $EXAMPLE_DIR/*.zip $TARGET_DIR 
