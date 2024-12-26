#!/usr/bin/env bash

export JAVA_HOME=$(/usr/libexec/java_home -v 17)
./gradlew build -x test
docker build -t pharndt/roborockmqtt .
docker push pharndt/roborockmqtt
