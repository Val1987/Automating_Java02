package Lesson03;

/*
 *   С Cookie файлами пока не разобрался, как их использовать то с Selenium? Разберусь и доделаю!
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GB_Test_01 {

    private static final String REGISTRATIONS = "https://gb.ru/login";
    private static final WebDriver driver;

    static {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    private static void login() {

        driver.get(REGISTRATIONS);

        driver.findElement(By.xpath("//a[@class='signin vkontakte js-social-button-with-confidential']")).click();

//        Cookie cookie1 = new Cookie("key1", "value1");
//        Set<Cookie> cookie = driver.manage().getCookies();
//        Cookie cookie2 = new Cookie("key2", "value2");
//        driver.manage().addCookie(cookie2);

    }

    public static void main(String[] args) throws InterruptedException {

        login();

//        driver.close();
//        driver.quit();

    }

}
