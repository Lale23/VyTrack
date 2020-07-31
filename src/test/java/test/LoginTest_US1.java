package test;

import Page.LoginPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_US1 extends TestBase {


    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 25);

    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "testData")
    public void loginTest_US1_1(String userName, String password) {

      loginPage.login1(userName, password);
    }

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {"storemanager79", "UserUser123"},
                {"storemanager80", "UserUser123"},
                {"salesmanager143", "UserUser123"},
                {"salesmanager144", "UserUser123"},
                {"salesmanager145", "UserUser123"}
        };
/*
    @Test(description = "Login with store manager_2")
    public void loginTest_US1_2(){

        loginPage.login2();
    }

    @Test(description = "Login with sales manager_1")
    public void loginTest_US1_3(){

        loginPage.login3();
    }

    @Test(description = "Login with sales manager_2")
    public void loginTest_US1_4(){

        loginPage.login4();
    }

    @Test(description = "Login with sales manager_3")
    public void loginTest_US1_5(){

        loginPage.login5();
    }

 */

/*
Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        loginUserStory1 = new LoginUserStory1();

        String username = ConfigurationReader.getProperty("truckdriver_username");
        String password = ConfigurationReader.getProperty("truckdriver_password");

        loginUserStory1.loginUStory1(username,password);


        WebElement fleetButton = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

         actions = new Actions(Driver.getDriver());

         Thread.sleep(2000);
         actions.moveToElement(fleetButton).perform();

         WebElement vehicleModule = Driver.getDriver().findElement(By.xpath("//span[text()='Vehicles']"));

         Thread.sleep(2000);
         actions.moveToElement(vehicleModule).click().perform();


        //table[@class='grid table-hover table table-bordered table-condensed']//td


        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']//td"));

        for(WebElement each : list){
            Assert.assertTrue(each.isDisplayed());
        }


       //general information     //div[@class='responsive-cell responsive-cell-no-blocks']/div



 */
    }
}
