package ishu;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Opengrid {
		public static void main(String[] args) throws InterruptedException, MalformedURLException 

		{
			String title="Online Cooking Class Enquiry Form";
			System.setProperty("webdriver.chrome.driver","C:/Users/natyam/Desktop/chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setBrowserName("chrome");
			capabilities.setCapability("webdriver.chrome.driver","C:/Users/natyam/Desktop/chromedriver.exe");			
			capabilities.setPlatform(Platform.WINDOWS);
			//capabilities.setVersion(version);
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:6666/wd/hub"), capabilities);
	try {
		driver.get("http://demo.opencart.com");	
		 Thread.sleep(1000);
			
		    System.out.println("Execution is stopped for 10 seconds");
		    //verifying the title
			boolean title1=driver.getTitle().contains("Your Store");
			if(title1)
			{
				System.out.println("Title is verified");
			}
			else
			{
				System.out.println("Title is not verified");
			}
			
		    System.out.println("Waiting for the page to load");
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		    //verifying the links
		    java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		    
		    int expectedlinks=73;
			 
			int actuallinks=links.size();
			
			if(expectedlinks==actuallinks)
			{
				System.out.println("No of links are equal to expected links " +actuallinks);
			}
			else
			{
				System.out.println("No of links are npot equal to expected links" +actuallinks);	
			}
			
			driver.findElement(By.linkText("My Account")).click();
			Thread.sleep(1000);
			System.out.println("My Account is clicked");
			
			driver.findElement(By.linkText("Register")).click();
			//Thread.sleep(1000);
			System.out.println("Register is clicked");
			
			driver.findElement(By.name("firstname")).sendKeys("Ishwarya");
			WebElement fname = driver.findElement(By.name("firstname"));
			String name = fname.getAttribute("value");
			if(Validation.ValidateflName(name))
			{
				System.out.println("Valid fistname");
				driver.findElement(By.name("lastname")).sendKeys("Atyam");
				Thread.sleep(1000);
				WebElement last = driver.findElement(By.name("lastname"));
				String name1 = last.getAttribute("value");
				if(Validation.ValidateflName(name1))
				{
					System.out.println("valid Last name");			
					driver.findElement(By.name("email")).sendKeys("apple@gmail.com");
					WebElement email = driver.findElement(By.name("email"));
					String mail = email.getAttribute("value");
					if(Validation.Validatemail(mail))
					{
						System.out.println("valid email");
						driver.findElement(By.name("telephone")).sendKeys("9866961693");
						WebElement phone = driver.findElement(By.name("telephone"));
						String number = phone.getAttribute("value");
						if(Validation.ValidateNumber(number))
						{
							System.out.println("valid phone number");
							driver.findElement(By.name("password")).sendKeys("ish123");
							Thread.sleep(1000);
							WebElement pwd = driver.findElement(By.name("password"));
							String pass = pwd.getAttribute("value");
							driver.findElement(By.name("confirm")).sendKeys("ish123");
							WebElement pwd1 = driver.findElement(By.name("confirm"));
							String pass1 = pwd1.getAttribute("value");
							if(pass.equals(pass1))
							{
								System.out.println("Password is matching");
							}
						}
						
					}
					
				}
			}
			driver.findElement(By.xpath(".//*[@id='content']/form/fieldset[3]/div/div/label[2]")).click();
			System.out.println("No button is clicked");
			
			driver.findElement(By.name("agree")).click();
		    driver.findElement(By.cssSelector("input[value='Continue']")).click();
			
			Thread.sleep(1500);
			boolean text4=driver.getPageSource().contains("Your Account Has Been Created!");
			if(text4)
			{
				System.out.println("Your Account Has Been Created! is present");
			}
			else
			{
				System.out.println("Your Account Has Been Created! is not present");
			}
			
			driver.findElement(By.linkText("Phones & PDAs")).click();
			driver.findElement(By.linkText("HTC Touch HD")).click();
			boolean text5=driver.getPageSource().contains("HTC Touch HD");
			if(text5)
			{
				System.out.println("HTC Touch HD is present");
			}
			else
			{
				System.out.println("HTC Touch HD is not present");
			}
			driver.navigate().back();
			
			driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
			System.out.println("Add to cart button is clicked");
			
			Thread.sleep(1500);
			
			boolean text6=driver.getPageSource().contains("Success: You have added HTC Touch HD to your shopping cart!");
			if(text6)
			{
				System.out.println("Success: You have added HTC Touch HD to your shopping cart! is present");
			}
			else
			{
				System.out.println("Success: You have added HTC Touch HD to your shopping cart! is not present");
			}
			
			
			driver.findElement(By.linkText("Brands")).click();
			
			boolean title2=driver.getTitle().contains("Find Your Favorite Brand");
			if(title2)
			{
				System.out.println("Title matches");
			}
			else
			{
				System.out.println("Title not matches");
			}
			driver.findElement(By.linkText("Canon")).click();
			boolean text7=driver.getPageSource().contains("Canon");
			if(text7)
			{
				System.out.println("Canon is present");
			}
			else
			{
				System.out.println("Canon is not present");
			}
			
			driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]")).click();
			System.out.println("Clicked on add to wishlist icon");
			

			boolean text8=driver.getPageSource().contains("Success: You have added Canon EOS 5D to your wish list!");
			if(text8)
			{
				System.out.println("Success: You have added Canon EOS 5D to your wish list! is present");
			}
			else
			{
				System.out.println("Success: You have added Canon EOS 5D to your wish list! is not present");
			}
			
			driver.findElement(By.linkText("Wish List (1)")).click();
			
			boolean title3=driver.getTitle().contains("My Wish List");
			if(title3)
			{
				System.out.println("Title matches");
			}
			else
			{
				System.out.println("Title not matches");
			}
			

			driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/a")).click();
			driver.close();
			System.out.println("Window closed.");
	         
			Thread.sleep(2000);
	}
	  catch(Exception ex){
		System.out.println("Hello");
	}
	
	
	}
}