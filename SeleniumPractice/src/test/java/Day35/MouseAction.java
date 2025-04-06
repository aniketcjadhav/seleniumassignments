package Day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);

	}

}
