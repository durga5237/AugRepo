import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;
import java.util.List;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.CollectionCondition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Configuration.*;

public class FirstClass {

	@Test
	public void seleniumPrac() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
	
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("onward_cal")).click();

		while (!driver.findElement(By.className("monthTitle")).getText().equalsIgnoreCase("Aug 2023")) {

			driver.findElement(By.className("next")).click();

		}

		List<WebElement> totalDates = driver.findElements(By.xpath("//tbody/tr/td"));
		System.out.println(totalDates.size());
		for (WebElement one : totalDates) {
			if (one.getText().equalsIgnoreCase("10")) {
				one.click();
			}

		}

		driver.close();

//		

	}

}
