package aplana.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenariaSteps {
    private MainSteps mainSteps = new MainSteps();
    private CalculatorSteps calculatorSteps = new CalculatorSteps();

    @When("^Выбор меню (.+) элемента (.+)")
    public void selectServiceItem(String serviceItem,String innerItem){
        mainSteps.selectServiceItem(serviceItem,innerItem);
    }

    @When("^Проверить, что заголовок (.+)")
    public void checkTitle(String value){
        calculatorSteps.checkTitle(value);
    }

    @When("^Выбрать валюту (.+)")
    public void chooseCurrency(String value){
        calculatorSteps.chooseCurrency(value);
    }

    @When("^Сумма вклада: (.+)")
    public void typeSumOfDep(String value){
        calculatorSteps.typeSumOfDep(value);
    }

    @When("^Кол-во месяцев: (.+)")
    public void typePeriod(String value){
        calculatorSteps.typePeriod(value);
    }

    @When("^Ежемесячное пополнение: (.+)")
    public void typeMonthAdding(String value){
        calculatorSteps.typeMonthAdding(value);
    }

    @When("^Ежемесячная капитализация (.+), Частичное снятие (.+)")
    public void enableMCandPO(String mc, String po){
        calculatorSteps.enableMCandPO(mc,po);
    }

    @When("^Проверка значений: Cтавка (.+), Начислено % (.+), Пополнение (.+), К снятию (.+)")
    public void checkParametres(String rate, String accumul, String adding, String total) throws InterruptedException {
        calculatorSteps.checkParam(rate, accumul, adding, total);
    }

}
