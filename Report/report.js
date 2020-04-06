$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/automation/feature/Automation.feature");
formatter.feature({
  "line": 1,
  "name": "Testing login function on Automation app",
  "description": "",
  "id": "testing-login-function-on-automation-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User checking the login function using valid username and valid password.",
  "description": "",
  "id": "testing-login-function-on-automation-app;user-checking-the-login-function-using-valid-username-and-valid-password.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Signin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user clicks on Signin button",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enters the valid username \"\u003cusername\u003e\" in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters valid password \"\u003cpassword\u003e\" in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User confirms the home page is launched.",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "testing-login-function-on-automation-app;user-checking-the-login-function-using-valid-username-and-valid-password.;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16,
      "id": "testing-login-function-on-automation-app;user-checking-the-login-function-using-valid-username-and-valid-password.;;1"
    },
    {
      "cells": [
        "uma2011@yahoo.com",
        "sakthi"
      ],
      "line": 17,
      "id": "testing-login-function-on-automation-app;user-checking-the-login-function-using-valid-username-and-valid-password.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 369500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to launch the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 163522100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_application()"
});
formatter.result({
  "duration": 107100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User checking the login function using valid username and valid password.",
  "description": "",
  "id": "testing-login-function-on-automation-app;user-checking-the-login-function-using-valid-username-and-valid-password.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Signin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user clicks on Signin button",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enters the valid username \"uma2011@yahoo.com\" in the username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters valid password \"sakthi\" in the password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User confirms the home page is launched.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Signin_button()"
});
formatter.result({
  "duration": 23055536300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "uma2011@yahoo.com",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_enters_the_valid_username_in_the_username_field(String)"
});
formatter.result({
  "duration": 2395853600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sakthi",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enters_valid_password_in_the_password_field(String)"
});
formatter.result({
  "duration": 2286245600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 7380432100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_the_home_page_is_launched()"
});
formatter.result({
  "duration": 42200,
  "status": "passed"
});
formatter.before({
  "duration": 246400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to launch the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 228800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_application()"
});
formatter.result({
  "duration": 166800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "user selects tshirt to place order",
  "description": "",
  "id": "testing-login-function-on-automation-app;user-selects-tshirt-to-place-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "user navigates to tshirt in women option",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user clicks on tshirt image to book",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user selects quantity of tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user selects size of tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user selects colour of tshirt",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user adds tshirt to cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user confirms tshirt checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_navigates_to_tshirt_in_women_option()"
});
formatter.result({
  "duration": 12421905100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_tshirt_image_to_book()"
});
formatter.result({
  "duration": 9759678900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_quantity_of_tshirt()"
});
formatter.result({
  "duration": 3356388200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_size_of_tshirt()"
});
formatter.result({
  "duration": 3297702000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_colour_of_tshirt()"
});
formatter.result({
  "duration": 3314102000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_adds_tshirt_to_cart()"
});
formatter.result({
  "duration": 3316641700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_proceeds_to_checkout()"
});
formatter.result({
  "duration": 9200001000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_tshirt_checkout()"
});
formatter.result({
  "duration": 39500,
  "status": "passed"
});
formatter.before({
  "duration": 218300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user to launch the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user to launch the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_browser()"
});
formatter.result({
  "duration": 175300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_to_launch_the_application()"
});
formatter.result({
  "duration": 115800,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User completes order",
  "description": "",
  "id": "testing-login-function-on-automation-app;user-completes-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user proceeds to shipping page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user agrees to terms of service",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User proceeds to payment page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user selects to bankwire",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User confirms order.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_proceeds_to_shipping_page()"
});
formatter.result({
  "duration": 11329639700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_agrees_to_terms_of_service()"
});
formatter.result({
  "duration": 3183330800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_proceeds_to_payment_page()"
});
formatter.result({
  "duration": 7481403400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_selects_to_bankwire()"
});
formatter.result({
  "duration": 14269093300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirms_order()"
});
formatter.result({
  "duration": 4791400,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[  ]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat com.automation.stepdefinition.StepDefinition.user_confirms_order(StepDefinition.java:152)\r\n\tat ✽.Then User confirms order.(src/test/java/com/automation/feature/Automation.feature:36)\r\n",
  "status": "failed"
});
});