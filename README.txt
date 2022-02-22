# Colin Brennan
# CS-445-hw1


1. Installl java if not yet installed on your machine:

```
sudo apt-get update
sudo apt-get install openjdk-17-jdk
```

2. Change directory into the folder for the project

```
cd HW1_CB
```

3. Run Application

```
./gradlew build
java -jar build/libs/HW1_CB.jar
```

4. Steps 1-3 can be automated by running the build.sh script located in the same directory as this README.txt
```
sudo chmod 777 build.sh
./build.sh
```