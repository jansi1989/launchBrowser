import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
        WebElement cont = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
        cont.click();
        driver.findElement(By.id("InputName")).sendKeys("jansi");
        driver.findElement(By.id("InputEmail1")).sendKeys("anto12@gmail.com");
        driver.findElement(By.id("InputSubject")).sendKeys("1234568122");
        Select ele=new Select(driver.findElement(By.name("courses")));
        ele.selectByVisibleText("Selenium");
        Select place=new Select(driver.findElement(By.name("branch")));
        place.selectByVisibleText("OMR");
        Select time=new Select(driver.findElement(By.name("time")));
        time.selectByVisibleText("Immediately");
        driver.findElement(By.xpath("//textarea[@class='form-control input-message']")).sendKeys("I want to know course details");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
        driver.close();

	}

}
