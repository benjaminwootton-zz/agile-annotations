package agileannotations;

import agileannotations.bdd.Given;
import agileannotations.bdd.Then;
import agileannotations.bdd.When;
import agileannotations.documentation.CodeReview;
import agileannotations.documentation.Documentation;
import agileannotations.documentation.Wiki;
import agileannotations.process.Sprint;
import org.junit.Test;

public class AgileAnnotations {

    @Test
    @Given()
    @When()
    @Then()
    public void shouldCreateBDDAnnotations() {
    }

    @Test
    @CodeReview()
    @ReviewedBy()
    @Documentation()
    @Wiki()
    public void shouldCreateDocumentationAnnotations() {
    }


}
