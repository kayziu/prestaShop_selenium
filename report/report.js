$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/order.feature");
formatter.feature({
  "name": "User buy a sweater",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@devs2"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User is logging in and buy a sweater",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the mainpage and clicks SignIn",
  "keyword": "Given "
});
formatter.step({
  "name": "User is logging in to the shop with valid data",
  "keyword": "When "
});
formatter.step({
  "name": "User is adding a sweater to the cart: size \u003csize\u003e, quantity \u003cquantity\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User click proceed to checkout",
  "keyword": "When "
});
formatter.step({
  "name": "User proceed the order",
  "keyword": "When "
});
formatter.step({
  "name": "User makes a screenshot of a webpage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "size",
        "quantity"
      ]
    },
    {
      "cells": [
        "M",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is logging in and buy a sweater",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@devs2"
    }
  ]
});
formatter.step({
  "name": "User is on the mainpage and clicks SignIn",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefi.userIsOnTheMainpageAndClicksSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is logging in to the shop with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.userIsLoggingInToTheShopWithValidData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is adding a sweater to the cart: size M, quantity 5",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.userIsAddingASweaterToTheCartSizeSizeQuantityQuantity(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.userClickProceedToCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceed the order",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.userProceedTheOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User makes a screenshot of a webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefi.userMakesAScreenshotOfAWebpage()"
});
formatter.result({
  "status": "passed"
});
});