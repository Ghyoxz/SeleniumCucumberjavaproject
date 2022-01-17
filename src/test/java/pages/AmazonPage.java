package pages;

import org.openqa.selenium.By;

public class AmazonPage extends BasePage{

    private String searchPr = "//a[contains(text(),'Ofertas')]";
    

    public AmazonPage(){
        super(driver);
        
    }

    public void navigateToAmazon(){

        navigateTo("https://www.amazon.es");
        driver.getWindowHandle();
        driver.findElement(By.id("sp-cc-accept")).click();
        
    }

    public void selectCategory (){

        ClickElement(searchPr);

    }

    

    
    
}
