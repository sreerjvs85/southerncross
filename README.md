# southerncross pom framework design

1. Added maven to mac after resolving dependency issues.
2. Created a new maven project and cleaned up.
3. Added required selenium dependencies in pom.xml and able to build without errors.
4. Created new folder structure for Page Object Model. This will have packages for different pages, Browser functions, Common funtions and tests.
5. Added Cucumber and TestNG for BDD approach.
6. Added few library files, page objects and browser utility classes
7. Added feature file and step definition
8. Ran the first test case successfully.
9. Parameterized the inputs.
10. Jenkins localhost installed and it's up and running.
11. Added maven project and configured polling for automated build cycle.
12. Added json format and generated cucumber reports to jenkin.

Execution:

Before executing it directly, make sure java 8 and maven are installed on the target machine. This has been developed on a mac
but have added chromedriver for windows. Cluecumber Report has been used for reporting.

Pull the code from github and run the below command from terminal/cmd line

##"mvn clean verify"

After execution results can be seen below

##"southerncross/target/test-report/index.html"

and any screenshots if any will be in

##"southerncross/target/screenshots"
