# Testing moodle using Cucumber
This directory contains the cucumber files for testing the Comments module of the Moodle application.

## Running the tests
Run ```mvn test``` to run all the tests.

## Feature files
The behaviors that we tested are in the feature files that inside the [resources/hellocucumber](resources/hellocucumber) directory. See the files for a detailed description of the tests.

$$*TODO*: The test suite includes three scenarios that involve a student and a teacher interacting with a commenting system.
The first scenario tests that a student is able to view a comment successfully.
The second scenario tests that a teacher is able to delete a comment.
The third scenario tests that a student is able to view a comment that has been deleted by the teacher.
These scenarios were implemented using Selenium and were designed to ensure that the commenting system is functioning correctly for both students and teachers.
The elements in the Moodle platform were located and interacted with using a combination of XPath, CSS selector and navigate() method in order to locate the desired buttons and then sendKeys() and click() methods were used to perform the desired actions on the HTML elements." 

## Step files
The step files in the [src/test/java/hellocucumber](src/test/java/hellocucumber) directory contain the code that defines how each sentence in the feature files is translated to Selenium actions. See the files for a detailed description of the implementation.

The step files located in the src/test/java/hellocucumber directory contain the code that defines the mapping between the sentences in the feature files written using Gherkin syntax and the Selenium actions that are executed to test the application.
These step files are written using the Cucumber framework which allows for a natural language-like syntax in the feature files and then maps those sentences to specific actions in the step files.
The step files use Selenium WebDriver methods such as findElement() and click() to interact with elements on the web page and assert the expected behavior of the application.
For example, the scenario 'Given the student enters the login page' written in Gherkin syntax is implemented in the HelloCucumber file using the StepDefinition and MoodleActuator java sub-files to perform the corresponding actions in the application
