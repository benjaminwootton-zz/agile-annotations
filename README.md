Agile-Annotations
=================

A simple set of Java annotations to support agile development, testing, and delivery.

By annotating parts of our Java code, we can improve communication within the development team and build simple tools that process these annotations and use them within the development or deployment workflow.    

A few examples:

*Foster communication amongst the team:*

- @Wiki("confluence.mycompany.com/about-my-feature")
- @Documentation("confluence.mycompany.com/about-my-feature")
- @Pair("Ben", "Dave")

*Track Our Work:*

- @Sprint("17th December 2012");
- @Epic("Simplify the codebase");
- @Outstanding("Still need to test the calculation engine")

*Structure Our Tests*

- @Given("A top customer")
- @When("The customer complains")
- @Then("Trigger an email")




Processing Ideas
================

Here's a few ideas:

- Automatically ensure that no tests are marked @Outstanding()
- Fail the build if anything 
- Report on the @Pair annotation to see the spread of developers pairing
- Report on the BDD @When annotation 
