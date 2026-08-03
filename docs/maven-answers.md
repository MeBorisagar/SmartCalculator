
#### B2.1 List the Maven lifecycle phases that run automatically when you execute mvn package (in order).

When mvn package is executed, Maven runs all lifecycle phases up to and including package:
1. validate
2. compile
3. test
4. package


Each phase executes the phases before it automatically.



#### B2.2 What is the difference between mvn install and mvn package?

- mvn package compiles the project, runs tests, and creates JAR file in the target directory.
- mvn install performs everything that mvn package does and then installs the generated artifact into the local Maven repository (~/.m2/repository), making it available for other local Maven projects.


#### B2.3 Why should a testing library like JUnit use test scope rather than the default compile scope?

JUnit is only required for writing and running tests. Using the test scope ensures that:
- JUnit is available during test compilation and execution.
- It is not included in the application's runtime dependencies.
- The final packaged application remains smaller and contains only the libraries needed for production.