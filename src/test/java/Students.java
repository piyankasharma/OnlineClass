import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Students {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/MySpace/JavaProjects/OnlineClass/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
      System.out.println(driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).isSelected());
		driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']")).isSelected());

		/*driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']")).click();
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		driver.findElement(By.xpath("//div[text()='Students']")).click();
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();*/
		driver.findElement(By.xpath("//div[normalize-space()='Passengers']")).click();
		for(int i=1;i<=3;i++){driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();}
				
		//driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
		
		
		
		
		
		
		

	}

}
