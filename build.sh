#!/bin/bash

cd HW1_CB
sudo apt-get -y update
sudo apt-get -y install openjdk-17-jdk

sudo snap install gradle

gradle build
sudo java -jar build/libs/HW1_CB.jar