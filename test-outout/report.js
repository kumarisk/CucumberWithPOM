$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sudheer.indlamudi/eclipse-workspace-new/CucumberWithPOM/src/main/java/com/qa/features/facebooklogin.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user login with vaild credentials",
  "description": "",
  "id": "facebook-login-feature;user-login-with-vaild-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters useremail and password",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verify logged in user",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageStepefenetion.user_is_on_login_page()"
});
formatter.result({
  "duration": 42529668700,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepefenetion.validate_title()"
});
formatter.result({
  "duration": 151248100,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepefenetion.user_enters_useremail_and_password()"
});
formatter.result({
  "duration": 8111804900,
  "status": "passed"
});
formatter.match({
  "location": "HomepageStepefenetion.user_verify_logged_in_user()"
});
formatter.result({
  "duration": 1737300,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.stepdefenitions.HomepageStepefenetion.user_verify_logged_in_user(HomepageStepefenetion.java:43)\r\n\tat ✽.Then user verify logged in user(C:/Users/sudheer.indlamudi/eclipse-workspace-new/CucumberWithPOM/src/main/java/com/qa/features/facebooklogin.feature:9)\r\n",
  "status": "failed"
});
});