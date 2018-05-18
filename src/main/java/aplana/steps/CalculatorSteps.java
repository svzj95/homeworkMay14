package aplana.steps;

import aplana.pages.CalculatorPage;
import io.qameta.allure.Step;

public class CalculatorSteps {

    @Step("Проверить, что заголовок {0}")
    public void checkTitle(String value){
        new CalculatorPage().checkTitle(value);
    }

    @Step("Выбрать валюту {0}")
    public void chooseCurrency(String value){
        new CalculatorPage().chooseCurrency(value);
    }

    @Step("Сумма вклада: {0}")
    public void typeSumOfDep(String value){
        new CalculatorPage().typeSumOfDep(value);
    }

    @Step("Кол-во месяцев: {0}")
    public void typePeriod(String value){
        new CalculatorPage().typePeriod(value);
    }

    @Step("Ежемесячное пополнение: {0}")
    public void typeMonthAdding(String value){
        new CalculatorPage().typeMonthAdding(value);
    }

    @Step("Ежемесячная капитализация {0}, Частичное снятие {1}")
    public void enableMCandPO(String mc, String po){
        new CalculatorPage().enableMCandPO(mc,po);
    }

    @Step("Проверка значений: Cтавка {0}, Начислено % {1}, Пополнение {2}, К снятию {3}")
    public void checkParam(String rate, String accumul, String adding, String total) throws InterruptedException {
        new CalculatorPage().checkParam(rate, accumul, adding, total);
    }


}
