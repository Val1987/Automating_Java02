package Lesson03;

// CRM  не работает! Увы потом доделаю! (сории)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CRM_Test_02 {

    private static final String REGISTRATIONS = "https://crm.geekbrains.space/user/login";
    private static final String LOGIN = "user";
    private static final String PASSWORD = "1234";
    private static final WebDriver driver;

    static {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    private static void login() {

        driver.get(REGISTRATIONS);

        WebElement loginTextInput = driver.findElement(By.xpath(""));
        loginTextInput.sendKeys(LOGIN);

        WebElement passwordTextInput = driver.findElement(By.xpath(""));
        loginTextInput.sendKeys(PASSWORD);

        WebElement loginButton = driver.findElement(By.xpath(""));
        loginButton.click();

    }

    public static void main(String[] args) throws InterruptedException {

        login();

        driver.findElement(By.xpath("xpath=//div[@id='container']/div/div/div/div")).click();
        driver.findElement(By.xpath("xpath=//header[@id='oroplatform-header']/div/div/ul/li[3]/a/i")).click();
        driver.findElement(By.xpath("xpath=(//a[contains(text(),'Создать контактное лицо')])[3]")).click();
        driver.findElement(By.xpath("//div[@class='controls']/input[@name='crm_contact[lastName]']")).sendKeys("Tishow");
        driver.findElement(By.xpath("//div[@class='controls']/input[@name='crm_contact[firstName]']")).sendKeys("Val");

        Select name = new Select(driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul[2]/li[1]/div")));
        name.selectByValue("1");

        driver.findElement(By.xpath("//div[@class='controls']/input[@name='crm_contact[jobTitle]']")).sendKeys("idiot");
        driver.findElement(By.xpath("xpath=//form[@id='crm_contact-uid-60b325b92de18']/div/div/div/div[2]/div/div[4]/button")).click();

        driver.close();
        driver.quit();

    }

}
