## Environment:
- Java version: 1.8
- Maven version: 3.*
- Spring Boot version: 2.2.1.RELEASE

## Read-Only Files:
- src/test/*

## Requirements:
Spring boot allows to configure the application beans using Java or XML or Annotation. There is a project which has a few classes which are used for sending notifications. And you have to use all 3 types of configuration styles namely XML, Java and Annotation to define those beans so that those beans can be loaded into Spring Boot Application Context.

Candidate bean classes are given as:

|SN|Bean name|Bean class|Constructor args|
|---|---|---|---|
|1|	smsNotificationService|	SmsNotificationService.java|	SMS_SERVICE|
|2|	callNotificationService|	CallNotificationService.java|	CALL_SERVICE|
|3|	emailNotificationService|	EmailNotificationService.java|	EMAIL_SERVICE|
|4|	thirdPartyNotificationService|	ThirdPartyNotificationService.java|	THIRD_PARTY_SERVICE|

Configuration classes are given as:

* `JavaBasedConfiguration.java`:  It contains the beans defined using Java
* `XmlBasedConfiguration.java`: It contains the beans defined on the xml_based_bean_configuration.xml
* `xml_based_bean_configuration.xml`: XML Configuration file that contains the bean definition
* `App.java`: The starting point of application where you can define beans using annotations


Now,

1. Define #1 and #2 beans using Java based configuration.

2. Define #3 bean using annotation based configuration.

3. Define #4 bean using XML based configuration.

Your task is to complete the given project as per the given requirements so that it passes all the test cases when running the provided unit tests.

## Commands
- run: 
```bash
mvn clean package; java -jar target/SpringBootConfigurationStyles-1.0.jar
```
- install: 
```bash
mvn clean install
```
- test: 
```bash
mvn clean test
```