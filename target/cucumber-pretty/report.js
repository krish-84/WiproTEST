$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UI-Scenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Wipro TEST Assignment",
  "description": "",
  "id": "wipro-test-assignment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7280438209,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Scenario4 - Check the given end point response to see if it contains this email address \"Eliseo@gardner.biz\"",
  "description": "",
  "id": "wipro-test-assignment;scenario4---check-the-given-end-point-response-to-see-if-it-contains-this-email-address-\"eliseo@gardner.biz\"",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@yes"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "the end point is \"https://jsonplaceholder.typicode.com/comments/1\"",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "the email address in the response should be \"Eliseo@gardner.biz\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 893678925,
  "status": "passed"
});
formatter.before({
  "duration": 6469317109,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Scenario5 - Check the given end point response to see if it returns 10 users",
  "description": "",
  "id": "wipro-test-assignment;scenario5---check-the-given-end-point-response-to-see-if-it-returns-10-users",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@yes"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "the end point is \"https://jsonplaceholder.typicode.com/users\"",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "the response should contain 10 users",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 493875574,
  "status": "passed"
});
});