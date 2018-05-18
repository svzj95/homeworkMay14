package aplana.pages;

import aplana.steps.BaseSteps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div[@class='service']")
    private
    List<WebElement> serviceItems;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectServiceItem(String serviceItem, String innerItem) {
        for (WebElement i : serviceItems) {
            if(serviceItem.equals(i.findElement(By.xpath("descendant::div[@class='service__title-text']")).getText())){
                i.findElement(By.xpath("descendant::span[contains(.,'" + innerItem + "')]/..")).click();
                return;
            }
        }
        Assert.fail("Не найден элемент коллеции - " + serviceItem);
    }
}
