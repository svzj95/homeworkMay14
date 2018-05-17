package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

public class BasePage {
    WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 3);

    BasePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}
