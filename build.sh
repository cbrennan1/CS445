#!/bin/bash

cd HW1_CB
sudo apt-get update
sudo apt-get install openjdk-17-jdk

./gradlew build
java -jar build/libs/HW1_CB.jar