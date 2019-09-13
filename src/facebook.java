import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement acc = driver.findElement(By.xpath("//span[text()='Create an account']"));
		String tl = acc.getText();
		System.out.println(tl);
		WebElement acct = driver.findElement(By.xpath("//div[contains(text(),'Facebook')]"));
		String t2 = acct.getText();
		System.out.println(t2);
		WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		String t3 =login.getAttribute("value");
		System.out.println(t3);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jansi145");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
		

}
}