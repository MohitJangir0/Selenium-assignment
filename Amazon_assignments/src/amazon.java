import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Wrist Watches");
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();

		WebElement displayanalogue = driver.findElement(By
				.xpath("//div[@id='filters']//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']"));
		displayanalogue.click();
		Thread.sleep(1000);
		WebElement leathermaterial = driver
				.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']"));
		leathermaterial.click();
		Thread.sleep(1000);

		WebElement brandtitan = driver
				.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']"));
		brandtitan.click();
		Thread.sleep(2000);

		WebElement discountfilter = driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]"));
		discountfilter.click();
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(
				By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[1]/div[1]/div"));
		WebElement fifthElement = elements.get(5);
		System.out.println(fifthElement.getText());
		driver.quit();

	}

}
