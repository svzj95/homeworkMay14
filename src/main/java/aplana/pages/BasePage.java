package aplana.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import aplana.steps.BaseSteps;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 3);

    BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public boolean isElementPresent(WebElement element) {
        try {
            BaseSteps.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        finally {
            BaseSteps.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    void sendToWebInputField(WebElement webElement, String value){
        webElement.sendKeys(value);
    }

    void clickCheckbox(WebElement webElement){
        Actions actions = new Actions(BaseSteps.getDriver());
        actions.moveToElement(webElement).click().perform();
    }
}
