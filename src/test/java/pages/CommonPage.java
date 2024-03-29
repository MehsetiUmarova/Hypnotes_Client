package pages;

import org.openqa.selenium.support.PageFactory;

import static stepDefinitions.Hooks.driver;

public  abstract  class CommonPage {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

    private ClientPage clientPage;

    public  ClientPage getClientPage() {
        if (clientPage == null) {
            clientPage = new  ClientPage();
        }
        return clientPage;
    }


}
