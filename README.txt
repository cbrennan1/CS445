# CS445 HW1 Colin Brennan
1. If Java is not yet installed on your linux machine execute the below commands to install Java
```
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer
```
2. Once java has been installed the next step is to change your current working directory to the osurce folder of the project (src/main).

***To automate the following steps (3-7) run the run.sh located in the same directory as the source and bin directiories.***

3. In order to compile the TestCreature.java program the following code should be executed.
```
javac <path to TestCreature.java>
```
4. Once that class has been compiled the program can be run by executing the following command 
```
java TestCreature
```
5. In order to run the unit testing you must first change the directory to src/Testing
6. The program can be compiled with the following command
```
javac <path to RunTests.java>
```
7. You can then run the program with the following command
```
java RunTests.java
```