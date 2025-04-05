package Day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment31 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement dropdownlist =   driver.findElement(By.xpath("//select[@name = 'country']"));
		
		Select option = new Select(dropdownlist);
		
		List<WebElement> optionlist = option.getOptions();
		System.out.println("Cout of options :" +optionlist.size());
		
		for(WebElement op :optionlist)
		{
			System.out.println(op.getText());
		}
		
//		for(WebElement op :optionlist)
//		{
//			if(op.getText().equals("India"))
//			{
//				op.click();
//			}
//		}
		
		option.selectByContainsVisibleText("Brazil");
		Thread.sleep(5000);
		option.selectByIndex(2);
		Thread.sleep(5000);
		option.selectByValue("3");
	}

}
