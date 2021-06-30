$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/buildyourownPage.feature");
formatter.feature({
  "line": 1,
  "name": "Build your own computer page functionality",
  "description": "As a user I should able to navigate through build your own computer page successfully",
  "id": "build-your-own-computer-page-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3783814400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to buy product from build your own computer page",
  "description": "",
  "id": "build-your-own-computer-page-functionality;user-should-be-able-to-buy-product-from-build-your-own-computer-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on \"Computers\"Tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on  desktop tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select \"Name: A to Z\" from dropdown list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on \u0027add to cart\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I see \u0027build your own\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I select processor \"2.2 GHz Intel Pentium Dual-Core E2200\" from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select Ram \"8GB [+$60.00]\" from dropdownlist",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on HDD \"400 GB [+$100.00]\" radio buttton",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on OS \"Vista Premium [+$60.00]\" radio button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click Two check boxes \"Microsoft Office [+$50.00]\" and \"Total Commander [+$5.00]\"checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I verify price \"$1,475.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on \"ADD TO CARD\" Button.",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should see Message on top green bar like \"The product has been added to your shopping cart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TopmenuTeststpeDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 130214300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 12
    }
  ],
  "location": "BuildyourownPagestepsDefs.iClickOnTab(String)"
});
formatter.result({
  "duration": 657610800,
  "status": "passed"
});
formatter.match({
  "location": "BuildyourownPagestepsDefs.iClickOnDesktopTab()"
});
formatter.result({
  "duration": 3140760200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name: A to Z",
      "offset": 10
    }
  ],
  "location": "DesktopstepDefs.iSelectFromDropdownList(String)"
});
formatter.result({
  "duration": 211888100,
  "status": "passed"
});
formatter.match({
  "location": "BuildyourownPagestepsDefs.iClickOnAddToCartButton()"
});
formatter.result({
  "duration": 2142638700,
  "status": "passed"
});
formatter.match({
  "location": "BuildyourownPagestepsDefs.iSeeBuildYourOwnPage()"
});
formatter.result({
  "duration": 2399446300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2.2 GHz Intel Pentium Dual-Core E2200",
      "offset": 20
    }
  ],
  "location": "BuildyourownPagestepsDefs.iSelectProcessorFromDropdown(String)"
});
formatter.result({
  "duration": 149771200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8GB [+$60.00]",
      "offset": 14
    }
  ],
  "location": "BuildyourownPagestepsDefs.iSelectRamFromDropdownlist(String)"
});
formatter.result({
  "duration": 163703500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400 GB [+$100.00]",
      "offset": 16
    }
  ],
  "location": "BuildyourownPagestepsDefs.iClickOnHDDRadioButtton(String)"
});
formatter.result({
  "duration": 89907400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Vista Premium [+$60.00]",
      "offset": 15
    }
  ],
  "location": "BuildyourownPagestepsDefs.iClickOnOSRadioButton(String)"
});
formatter.result({
  "duration": 75345600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Microsoft Office [+$50.00]",
      "offset": 25
    },
    {
      "val": "Total Commander [+$5.00]",
      "offset": 58
    }
  ],
  "location": "BuildyourownPagestepsDefs.iClickTwoCheckBoxesAndCheckbox(String,String)"
});
formatter.result({
  "duration": 74167200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,475.00",
      "offset": 16
    }
  ],
  "location": "BuildyourownPagestepsDefs.iVerifyPrice(String)"
});
formatter.result({
  "duration": 292615100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ADD TO CARD",
      "offset": 12
    }
  ],
  "location": "BuildyourownPagestepsDefs.iClickOnButton(String)"
});
formatter.result({
  "duration": 68536500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 44
    }
  ],
  "location": "BuildyourownPagestepsDefs.iShouldSeeMessageOnTopGreenBarLike(String)"
});
formatter.result({
  "duration": 346626700,
  "status": "passed"
});
formatter.after({
  "duration": 838774200,
  "status": "passed"
});
});