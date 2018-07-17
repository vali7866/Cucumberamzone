$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/VALI/eclipse-workspace NEW/com.BDD/src/main/java/Features/Login.Feature");
formatter.feature({
  "line": 1,
  "name": "Login amazon Action",
  "description": "",
  "id": "login-amazon-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Successful amazon Login with Valid Credentials",
  "description": "",
  "id": "login-amazon-action;successful-amazon-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on amazon Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user search books and click on Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepRunner.user_is_on_amazon_Home_Page()"
});
formatter.result({
  "duration": 5590589582,
  "status": "passed"
});
formatter.match({
  "location": "StepRunner.user_Navigate_to_LogIn_Page()"
});
formatter.result({
  "duration": 6769204812,
  "status": "passed"
});
formatter.match({
  "location": "StepRunner.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 88957710447,
  "status": "passed"
});
formatter.match({
  "location": "StepRunner.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 67633510,
  "status": "passed"
});
formatter.match({
  "location": "StepRunner.user_search_books_and_click_on_Search_button()"
});
formatter.result({
  "duration": 22322145444,
  "status": "passed"
});
});