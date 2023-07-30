import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.CollectionCondition.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Configuration.*;

public class SecondClass {
	@Test
	public void New() {
		Configuration.screenshots = true;
		open("https://www.redbus.in/");
		$(By.id("mynum")).click();

	}

}
