package WebDriverLocal.WebDriverLocal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalDriver 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "res/chromedriver");
    	WebDriver driver = new ChromeDriver();

        driver.get("http://www.baidu.com/");
        WebElement txtbox = driver.findElement(By.name("wd"));

        txtbox.sendKeys("HelloWorld");
    }
}
