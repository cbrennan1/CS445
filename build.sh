#!/bin/bash

cd HW1_CB
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo wget https://services.gradle.org/distributions/gradle-7.0-bin.zip
sudo apt-get -y install unzip
sudo unzip -d gradle-7.0-bin.zip

gradle build
sudo java -jar build/libs/HW1_CB.jar