# Cucumber + Selenium Web Automation Testing


The purpose of this project is to practice frontend (web) testing automation using the framework Cucumber and Selenium WebDriver.


|   Java   |          Frameworks/Tools           |
|:--------:|:-----------------------------------:|
| min. 11  | Cucumber, Selenium WebDriver, JUnit |

## To run the project

1. Have an IDE (IntelliJ, VSCode, etc)
2. Have Java JDK
3. Clone the project and execute: mvn clean install

## Project structure
Packages:
- support: contains utilities to support the project and that can be used globally.
- features: contains scenarios to test (Gherkin).
- stepDefinition: contains the tests scripts.
- pages: contains the pages representations as objects (with elements and methods).
- runner: contains the class that will execute all features files.

This project uses the design pattern Page Object Model (POM) and Selenium Class PageFactory to support POM.
