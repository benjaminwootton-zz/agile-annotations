Agile-Annotations
=================

A simple set of Java annotations to support agile development, testing, and delivery.

By annotating parts of our Java code, we can improve communication within the development team and also build simple automated tools to help us get a high level understanding of the code base.

*Foster communication amongst the team:*

@Wiki("confluence.mycompany.com/about-my-feature")
@Documentation("confluence.mycompany.com/about-my-feature")
@Pair("Ben", "Dave")

*Track Our Work:*

@Sprint("17th December 2012");
@Epic("Simplify the codebase");
@Outstanding("Still need to test the calculation engine")

*Structure Our Tests*

@Given("A top customer")
@When("The customer complains")
@Then("Trigger an email")





