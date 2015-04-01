#!/bin/bash

HOST='https://sdqweb.ipd.kit.edu/eclipse/palladio/examples/nightly/'
HOST_SED='https:\/\/sdqweb.ipd.kit.edu\/eclipse\/palladio\/examples\/nightly\/'
curl $HOST | grep -ohE '\w*.zip' | sed "s/^/$HOST_SED/" | xargs wget

unzip '*.zip'
rm *.zip*
