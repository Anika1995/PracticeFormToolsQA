
//import java.awt.List;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//first name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anika");
		//last name
		driver.findElement(By.cssSelector("[id='lastName']")).sendKeys("Uniyal");
		//email
		driver.findElement(By.id("userEmail")).sendKeys("anikauniyal1995@gmail.com");
		//for Gender
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		//mobile No.
		driver.findElement(By.id("userNumber")).sendKeys("9560491897");	
		// for Bithdate
		driver.findElement(By.id("dateOfBirthInput")).click();
		//Selecting August 
		WebElement monthdropdown = driver.findElement(By.className("react-datepicker__month-select"));
		Select se= new Select(monthdropdown);
		se.selectByVisibleText("August");
		//Selecting Year(1995)
		WebElement yeardropdown =driver.findElement(By.className("react-datepicker__year-select"));
		Select yearse=new Select(yeardropdown);
		yearse.selectByValue("1995");
		//Selecting date(3rd)
		WebElement dates= driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--003']"));
		dates.click();
		// for Subjects
		WebElement Subject=driver.findElement(By.id("subjectsInput"));
		Subject.sendKeys("Maths");
		Subject.sendKeys(Keys.ENTER);
		Subject.sendKeys("English");
		Subject.sendKeys(Keys.ENTER);
		//close advertisement
		driver.findElement(By.id("close-fixedban")).click();
		//for hobbies
		Thread.sleep(2000);;
		WebElement hobbycheck=driver.findElement(By.xpath("//label[contains(text(),'Music')]"));
		hobbycheck.click();
	
		//UPLOAD Picture from the location
		WebElement uploadFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		Thread.sleep(5000);
		uploadFile.sendKeys("C:\\Users\\Acer\\Documents\\Capture.png");
		//for Current Address
		driver.findElement(By.id("currentAddress")).sendKeys("D-109,Sector 61 ,Noida , 201301");
			
	
		
		//Select State
		WebElement states =driver.findElement(By.xpath("//div[@id='state']"));	
		states.click();
		WebElement dropstate= driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
		dropstate.click();
		//Select City
		WebElement city =driver.findElement(By.xpath("//div[@id='city']"));	
		city.click();
		WebElement dropcity= driver.findElement(By.xpath("//div[contains(text(),'Gurgaon')]"));
		dropcity.click();
		//Select Submit
		driver.findElement(By.id("submit")).click();
		
	}
	

}
