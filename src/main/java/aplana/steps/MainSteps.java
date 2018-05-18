package aplana.steps;

import io.qameta.allure.Step;
import aplana.pages.MainPage;

public class MainSteps {
    @Step("Выбор меню {0} элемента {1}")
    public void selectServiceItem(String serviceItem, String innerItem){
        new MainPage().selectServiceItem(serviceItem,innerItem);
    }
}
