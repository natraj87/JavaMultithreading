package pageActions;

import org.openqa.selenium.By;

import pages.BasePage;

public class Googlepageactions extends BasePage{
	
	public void googlesearchtest()
	{
		driver.findElement(By.name("q")).sendKeys("Naveen automation labs");
		driver.findElement(By.name("q")).submit();
		driver.findElements(By.tagName("h3")).stream().forEach(s->System.out.println(s.getText()));
	}
	
	public void teardown()
	{
		driver.quit();
	}

}
