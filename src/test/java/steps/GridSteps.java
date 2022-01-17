package steps;

import io.cucumber.java.en.*;
import pages.GridPage;

public class GridSteps {
    
    GridPage grid = new GridPage();

    @Given("^navego a LolGamepedia$")

    public void navigateToGrid(){
    
        grid.navigateToGrid();
        
    }

    @When("^busco una liga y la clickeo$")

    public void enterSearchCriteria(){

        
        
    }
    @And("^obtengo datos de una celda y muestro$")
    
    public void validateResults(){
        String value = grid.getValueFromGrid(1,1);

        System.out.println(value);


    }
}
