#!/bin/bash
# to be run within the docker container
cd /root/McHammerCoder/core
mvn clean install
chown $USERID . -R
chgrp $GROUPID . -R
chown $USERID /root/.m2 -R
chgrp $GROUPID /root/.m2 -R
