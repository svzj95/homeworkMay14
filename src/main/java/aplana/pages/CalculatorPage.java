package aplana.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import aplana.steps.BaseSteps;

import java.util.List;

public class CalculatorPage extends BasePage {
    @FindBy(xpath = "//h2[contains(@class,'calculator-block__title')]")
    private
    WebElement title;

    @FindBy(xpath = "//span[@class='calculator__currency-field-text']")
    private
    List<WebElement> currencies;

    @FindBy(xpath = "//input[@name='amount']")
    WebElement inputDep;

    @FindBy(xpath = "//select[@id='period']")
    private
    WebElement selectPeriod;

    @FindBy(xpath = "//input[@name='replenish']")
    private
    WebElement monthAdding;

    @FindBy(xpath = "//input[@name='capitalization']")
    private
    WebElement monthCapitalization;

    @FindBy(xpath = "//input[@name='partial_out']")
    private
    WebElement partialOut;

    @FindBy(xpath = "//span[@class='js-calc-rate']")
    private
    WebElement calcRate;

    @FindBy(xpath = "//span[@class='js-calc-earned']")
    private
    WebElement calcEarned;

    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    private
    WebElement calcReplenish;

    @FindBy(xpath = "//span[@class='js-calc-result']")
    private
    WebElement calcResult;

    public CalculatorPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void checkTitle(String value) {
        Assert.assertEquals(value, title.getText());
    }

    public void chooseCurrency(String value) {
        for (WebElement i : currencies) {
            if(i.getText().contains(value)){
                i.click();
                return;
            }
        }
        Assert.fail("Не найден валюта - " + value);
    }

    public void typeSumOfDep(String value) {
        this.sendToWebInputField(monthCapitalization,value);
    }

    public void typePeriod(String value) {
        new Select(selectPeriod).selectByValue(value);
    }

    public void typeMonthAdding(String value) {
        this.sendToWebInputField(monthAdding,value);
    }

    public void enableMCandPO(String mc, String po) {
        if ( "1".equals(mc))
            this.clickCheckbox(monthCapitalization);
        if ("1".equals(po))
            this.clickCheckbox(partialOut);
    }

    public void checkParam(String rate, String accumul, String adding, String total) {
        wait.until(ExpectedConditions.textToBePresentInElement(calcRate,rate));
        wait.until(ExpectedConditions.textToBePresentInElement(calcEarned,accumul));
        wait.until(ExpectedConditions.textToBePresentInElement(calcReplenish,adding));
        wait.until(ExpectedConditions.textToBePresentInElement(calcResult,total));
    }

}
