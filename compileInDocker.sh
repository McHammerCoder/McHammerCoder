#!/bin/bash
cd core
# get other repos
git clone https://github.com/McHammerCoder/Monticore
git clone https://github.com/McHammerCoder/Hammer
cd ..

# build docker image
docker build . -t mchammercoder:latest

#run compile within docker image
docker run --rm -it -e USERID=$UID -e GROUPID=$GID -v `pwd`/m2:/root/.m2 -v `pwd`:/root/McHammerCoder mchammercoder:latest /root/compile.sh
