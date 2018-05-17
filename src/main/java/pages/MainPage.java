package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class MainPage extends BasePage {
    @FindBy(xpath="//div[contains(@class,'services_main')]")
    List<WebElement> serviceItems;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectServiceItem(String serviceItem, String innerItem){
        for(WebElement i : serviceItems){
            if(serviceItem.equals(i.findElement(By.xpath("./descendant::div[@class='service__title-text']")))){
                i.findElement(By.xpath("//div[contains(@class,\"services_main\")]//span[contains(.,'"+innerItem+"')]/..")).click();
                break;
            }
        }
    }
}
