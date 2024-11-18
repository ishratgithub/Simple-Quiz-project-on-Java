# Project Title: Simple-Quiz-project-on-java

# What are the uses of Java?
Java is commonly used in web development for building server-side applications using frameworks like Spring, Hibernate, and Struts. It is also used in mobile application development for Android and for building desktop applications using Swing and JavaFX. Additionally, Java is a popular choice for developing large-scale enterprise applications.
Java's popularity can be attributed to its many advantages, including its simplicity, object-oriented nature, platform independence, robustness, security, and large community support. The language is also continually evolving with new releases and updates to keep pace with the latest technologies and programming paradigms.

# What is the purpose of using a JSON file?
The purpose of using a JSON (JavaScript Object Notation) file is to exchange data between different programs and platforms in a lightweight, easy-to-read format. Here are some of the specific purposes of using a JSON file:

 - Data Exchange: JSON files are used to exchange data between different programs and platforms in a simple and efficient way. This is especially useful for web applications, where data exchange needs to happen quickly and with minimal bandwidth usage.

 - Configuration: JSON files can be used as configuration files for software applications, providing a flexible way to store and manage application settings.

 - Data Storage: JSON files can be used to store data in databases, document stores, and other data storage systems. This provides a simple and flexible way to store and retrieve data.

 - Web APIs: JSON is the preferred format for many web APIs, making it a standard way to exchange data between web applications and services.

 - Data Analysis: JSON files can be used for data analysis and visualization, providing a flexible and easy-to-read format for data scientists and analysts.

In summary, JSON files are used for a variety of purposes, including data exchange, configuration, data storage, web APIs, and data analysis. Its lightweight and easy-to-read format makes it a popular choice for exchanging data between different programs and platforms.

## Technology used:
 - Intellij IDEA
 - java
 - 
## Project Scenerio:
Create a quiz program that will take questions, option and answer from admin user and save it to the question bank. Then if any user want to give the quiz, random 5 questions will be shown to the user from the question bank.

Program output:

Add Quiz
Start Quiz
if user select option 1, then system will tell user to input a question, 4 options and correct ans to save data in a quiz bank. The quiz bank will be a json file. For an example,

System>Please add a ques here:

User>Which testing is done by developer?

System>Input options.

Option a:

User> Unit Testing

Option b:

User> Integration Testing

Option c:

User> Sanity Testing

Option d:

User> Regression Testing

System> Please input the correct ans

User> a

System: Quiz saved at the database. Do you want to add more? (y/n)

if user press y, then the previous scenario will happen again otherwise the program will be closed.

If user select option 2, then, System> You will be asked 5 questions, each questions has 1 marks
1. What is not the blackbox testing strategy?
- a. Equivalence Partitioning
- b. Boundary Value Testing
- c. Branch Testing
- d. State Transition
User> c

System> Correct!

else not correct,

System: Not correct
Finally 5 different random questions will appear from your question database. At least add 15 questions from any category from testing. Result: You got [correct_marks] out of 5

JSON Format:
[{

    "answerkey": 3,
    
    "option 3": "Branch Testing",
    
    "option 4": "State Transition",
    
    "question": "What is not the blackbox testing strategy?",
    
    "option 1": "Equivalence Partitioning",
    
    "option 2": "Boundary Value Testing"
    
  },
  
  {
  
    "answerkey": 3,
    
    "option 3": "planning",
    
    "option 4": "Check Exit criteria completion",
    
    "question": "Faults are found most cost-effectively in which test activity?",
    
    "option 1": "design",
    
    "option 2": "execution"
    
  }
  {
    "answerkey": 4,
    "option 3": "Concatenated Loops",
    "option 4": "All of the above",
    "question": "Loop Testing methodology includes which of the following.",
    "option 1": "Simple Loops",
    "option 2": "Nested Loops"
  }]
  
  
