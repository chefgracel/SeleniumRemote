package WebDriverLocal.WebDriverLocal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriver {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.183:4444/wd/hub/"), capability);
		driver.get("http://www.baidu.com/");
        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("HelloWorld");
	}
}
