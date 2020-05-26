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
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d83.0.4103.61)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027KayVM\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.3.0-53-generic\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.61, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /tmp/.com.google.Chrome.9PxmhV}, goog:chromeOptions: {debuggerAddress: localhost:40193}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c052d26270177bbf0692304a564323fe\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\n\tat page.SweaterPage.clickAddToCart(SweaterPage.java:55)\n\tat step_definitions.StepDefi.userIsAddingASweaterToTheCartSizeSizeQuantityQuantity(StepDefi.java:92)\n\tat ✽.User is adding a sweater to the cart: size M, quantity 5(src/test/resources/features/order.feature:7)\n",
  "status": "failed"
});
formatter.step({
  "name": "User click proceed to checkout",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.userClickProceedToCheckout()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User proceed the order",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefi.userProceedTheOrder()"
});
formatter.result({
  "status": "skipped"
});
});