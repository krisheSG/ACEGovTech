# Overview

This project includes ACE Gov Tech assessement requirements test scripts along with testing framework / solution.

## Feature of Test framework
The framework feature includes the below approaches
* BDD / Scenario based
* Modularized based on the application pages
* Test data repository using feature file and external 
* command line execution using maven commands

## Technology 
* Java
* Selenium
* Cucumber
* Maven
* Page Factory
* Extent Report

### How to run the UI Tests

###### UI Tests
```
$ mvn clean test -Dcucumber.options="--tags '@Regression'" -DexecutionPlatform="LOCAL_CHROME"
```


