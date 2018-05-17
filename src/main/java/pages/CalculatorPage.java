package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class CalculatorPage extends BasePage {
    @FindBy(xpath = "//h2[contains(@class,'calculator-block__title')]")
    WebElement title;

    @FindBy(xpath = "//span[@class='calculator__currency-field-text']")
    List<WebElement> currencies;

    @FindBy(xpath = "//input[@name='amount']")
    WebElement inputDep;

    @FindBy(xpath = "//select[@id='period']")
    WebElement selectPeriod;

    CalculatorPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    void checkTitle(String value){
        Assert.assertEquals(value, title.getText());
    }

    void chooseCurrency(String value){
        for(WebElement i : currencies){
            if(value.equals(i.getText())){
                i.click();
                break;
            }
        }

    }

    void typeSumOfDep(String value){
        inputDep.sendKeys(value);
    }

    void typePeriod(String value){

    }

}
