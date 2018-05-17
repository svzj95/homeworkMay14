package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class CalculatorPage extends BasePage {
    @FindBy(xpath = "//h2[contains(@class,'calculator-block__title')]")
    WebElement title;

    CalculatorPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    void checkTitle(String value){
        Assert.assertEquals(value, title.getText());
    }

}
