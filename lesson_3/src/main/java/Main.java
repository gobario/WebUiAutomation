import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //test1
        driver.get("http://the-internet.herokuapp.com/");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        webElement2.click();
        webElement2.click();
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"elements\"]/button[1]"));
        WebElement webElement4 = driver.findElement(By.xpath("//*[@id=\"elements\"]/button[2]"));
        WebElement webElement5 = driver.findElement(By.xpath("//*[@id=\"elements\"]/button[3]"));
        webElement3.click();
        webElement4.click();
        webElement5.click();

        //test2
        driver.get("http://the-internet.herokuapp.com/");
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a"));
        webElement.click();
        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        webElement6.click();
        WebElement webElement7 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        webElement7.click();

        //test3
        driver.get("http://the-internet.herokuapp.com/");
        WebElement webElement8 = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[20]/a"));
        webElement8.click();
        WebElement webElement9 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        webElement9.sendKeys("test@mail.ru");
        WebElement webElement10 = driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i"));
        webElement10.click();

        //test4
        driver.get("http://the-internet.herokuapp.com/");
        WebElement webElement11 = driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a"));
        webElement11.click();
        WebElement webElement12 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        webElement12.sendKeys("tomsmith");
        WebElement webElement13 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        webElement13.sendKeys("SuperSecretPassword!");
        WebElement webElement14 = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        webElement14.click();
    }
}
