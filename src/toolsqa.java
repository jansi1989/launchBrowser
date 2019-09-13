
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;
    
    public class toolsqa {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("jansi");
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("rani");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Male']"));
		btn.click();
		WebElement btn1 = driver.findElement(By.xpath("(//input[@name='exp'])[4])"));
		btn1.click();
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("20/01/1/2020");
		WebElement cou = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		cou.click();
		WebElement btn3 = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		btn3.click();
		Select box =new Select(driver.findElement(By.id("continents")));
		box.selectByVisibleText("Europe");
		Select box1=new Select(driver.findElement(By.id("continentsmultiple")));
		box1.selectByVisibleText("Australia");
		Select box3=new Select(driver.findElement(By.id("selenium_commands")));
		box3.selectByVisibleText("WebElement Commands");
		driver.findElement(By.id("submit1")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
}
}