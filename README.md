## Project overview 
The project contains UI automated test as a recruitment task for FRIDAY


## Required software
1. [Java SE Development Kit 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)  
2. [Apache Maven](https://maven.apache.org/install.html) 
3. [IntelliJ IDEA Community](https://www.jetbrains.com/idea/)   


## To run the tests

Switch to project directory
```
 cd friday-ui-tests
```
In order to run the tests (Chrome)

```
 mvn test
```
In order to run the tests (Firefox)

```
 mvn test -Ddriver=firefox
```
 To see generated report after test run

```
 mvn allure:serve
```
