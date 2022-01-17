package pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage {

    private String searchButton = "//input[@value='Buscar con Google']";
    private String searchTextField = "//input[@title='Buscar']";
    // private String searchPr = "//select[@id='searchDropdownBox']";

    public  GooglePage(){

        super(driver);
    }

    public void navigateToGoogle(){
        
        navigateTo("https://www.google.com");
        driver.getWindowHandle();
        driver.findElement(By.id("L2AGLb")).click();
        
        
    }

    public void clickGoogleSearch(){

        ClickElement(searchButton);

    }

    public void enterSearchCriteria(String criteria){

        write(searchTextField,criteria);

    }

    

    
}
