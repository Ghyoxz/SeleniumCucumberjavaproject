package pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.FindAll;

public class GridPage extends BasePage {

    private String cell = "//*[@id='flfp-section-3-1']";
    private String pruebacelda = "//div[contains(text(),'ACEPTAR')]";

    private String koreaGrid = "//div[contains(text(),'KR')]";

    public GridPage(){
        super(driver);
    }
    

    public void navigateToGrid(){

        navigateTo("https://www.lol.fandom.com/wiki/League_of_Legends_Esports_Wiki");

        driver.getWindowHandle();
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        //driver.findElement(By.id("//div[contains(text(),'ACEPTAR')]")).click();

        ClickElement(pruebacelda);
        ClickElement(koreaGrid);
        
        
        
    }

    public String getValueFromGrid(int row, int column){

        
        return getValueFromTable(cell, row, column);
        
    }
}
