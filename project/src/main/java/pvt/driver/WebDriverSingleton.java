package pvt.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pvt.pages.MailPage;
import pvt.pages.VkPage;

public class WebDriverSingleton {

		private static WebDriverSingleton instance;
		private static WebDriver driver;
		private static MailPage mail;
		private static VkPage vk;
		
		private WebDriverSingleton() {
			
			
		}
		
		public static WebDriverSingleton getInstance() {
			if (instance == null) {
				instance = new WebDriverSingleton();
				driver = new ChromeDriver();
				mail = new MailPage(driver);
				vk = new VkPage(driver);
			}
			return instance;
		}
		
		public WebDriver getDriver()
	    {
	    	return driver;
	    }
		
		public MailPage getMailPage(WebDriver driver)
	    {
	    	return mail;
	    }
		
		public VkPage getVkPage(WebDriver driver)
	    {
	    	return vk;
	    }
		
		public static void closeWebBrowser(WebDriver driver){
	        if (null != driver){
	            driver.quit();
	        }
	        driver = null;
	    }

	}
