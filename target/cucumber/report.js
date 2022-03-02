$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios login functionality Validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    },
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TechfiosStepDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 902900500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login with valid credentials",
  "description": "",
  "id": "techfios-login-functionality-validation;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "TechfiosStepDefinition.user_enters_username_as(String)"
});
formatter.result({
  "duration": 12244100,
  "error_message": "java.lang.NullPointerException\r\n\tat steps.TechfiosStepDefinition.user_enters_username_as(TechfiosStepDefinition.java:32)\r\n\tat ✽.When User enters username as \"demo@techfios.com\"(features/TechfiosLogin.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "TechfiosStepDefinition.user_enters_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TechfiosStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TechfiosStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
});