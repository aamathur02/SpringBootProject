# Test Driven Development Project - BE

Welcome! This is an optional project that you can complete prior to the start of the Summer Internship Program to help you learn our tech stack. Feel free to leave comments with your questions, however please try to complete this on your own!

This application is built to help teach Spring Boot, one of the technologies you might be using this summer.
The way this application was built was by writing unit tests, and your job is to go into the application and develop the features.

## The project

This project is a web service that allows a user to perform basic HTTP requests. As a developer of this project, you will need to implement the book controller, model, repository, and service.These will handle the requests from the frontend.

---

### To begin:

You will first need [IntelliJ ultimate edition](https://www.jetbrains.com/idea/download/#section=windows). Spring Boot will not work with the community edition. Make sure you are using Java 8. After this, import all of the maven dependencies and right click on the java folder under the test folder to see the Run All Tests option.
This command will start executing all of the unit tests in the backend and they will fail until you implement the right functionality. 

---

### To develop:

To see what your code currently does, run the TddTutorialApplication and see if you are able to hit the web service on port 8080 with a tool like [Postman](https://www.postman.com/downloads/).
To see if your project matches the functionality expected, run the tests using the Run All Tests option.

---

### Don't know where to begin?

- If this is your first time using Spring Boot, you should start by reading the documentation [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/).

- A lengthy, but insightful Spring Boot tutorial can be found [here](https://www.youtube.com/watch?v=msXL2oDexqw)

- After you have glanced over the tutorial, start looking into some functionality to write! Each component has tests written so that you can focus on one component at a time.

- Remember a simple concept, you are trying to implement functionality that matches the expected behavior provided by the unit tests! So examine the tests carefully; each test is begins with the `@Test` annotation. This will provide clues as to which methods to implement for each component and how each of the components should behave.

- A suggested order of implementation would be the model, service, then the controller.

- To only run tests on one component, right click on the specific test file and choose the Run option.

- If you did everything correctly, you should have 11 passing tests at the end.
