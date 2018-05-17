package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class ScenariaSteps {
    private MainPage mainPage = new MainPage();

    @Step("^Выбор меню \\\"(.+)\\\"$\" элемента \\\"(.+)\\\"$\"")
    public void selectServiceItem(String serviceItem,String innerItem){
        mainPage.selectServiceItem(serviceItem,innerItem);
    }
}
