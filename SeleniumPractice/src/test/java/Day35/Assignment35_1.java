package Day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment35_1 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();

	}

}
