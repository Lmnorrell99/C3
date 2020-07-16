# Convoluted Code Challenge (C3) - "Hello World" Application #
This simple project will be used for various events.  The challenge will be organized as follows:
* Work in teams.
* Each team is assigned a technical mentor.
* Teams will work together with their mentor to build the most complex "Hello World" application possible.
* Coding will be evaluated at the end of the challenge by a rule engine to determine complexity rating.
* Teams will be asked to briefly create a ReadMe with:
  * Their strategy and overall design
  * What they would have done differently if given more time.
  * One thing they learned as part of the exercise.

## Tool Setup ##
For this challenge, you will need to install the following tools:
* Tortoise GIT: https://tortoisegit.org/download/
* IntelliJ: https://www.jetbrains.com/idea/download/#section=windows
* JDK 8: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

## Team Setup ##
Before cloning, create a new branch from the master for your team.
```
## Importing the Application ##
After checking out, import the application as a Maven project into your preferred IDE.

## Building the Application ##
To build, add a new run config with the following maven command:
```
clean package install
```
As part of the build, the application will execute its unit test which will allow participants in the challenge to confirm, as they are complicating the program, that the project still builds and has the desired result.

Submissions will only be valid if they have a passing unit test (without modifying the test, obviously).

## Running the Application ##
To build, add a new run config with the following maven command:
```
exec:java
```

## Submitting Your Team's Entry ##
To officially submit your team's final entry, commit your code to the branch you created for your team.  Please ensure the Junit test passes before submitting.

## A Note on JDKs ##
This project has been designed to run with Java 8.  Run on another JDK at your own risk :)
