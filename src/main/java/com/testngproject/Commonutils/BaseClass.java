package com.testngproject.Commonutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



public class BaseClass 
{
	public WebDriverUtils wLib = new WebDriverUtils();
	public FileUtils fLib = new FileUtils();
	public ExcelUtils elib = new ExcelUtils();
	//public DataBaseUtilities dbLib = new DataBaseUtilities();
	public static WebDriver driver;
	//@Parameters("browser")
	//@BeforeClass(groups = {"smoke", "RegressionTest"})
	public void configBeforeParallClass(String BROWSER) throws Throwable {
		System.out.println("=========launch the browser==============");
		/*Common  Data*/
		//String URL  = fLib.getPropertyKeyValue("url");

		//String BROWSER  = fLib.getPropertyKeyValue("browser");
		//String BROWSER  ="chrome";
		 if(BROWSER.equals("chrome")) {
		    driver = new ChromeDriver();
		 }else if(BROWSER.equals("firefox")) {
			 driver = new FirefoxDriver();
		 }else if(BROWSER.equals("ie")) {
			 driver = new InternetExplorerDriver();
		 }else {
			 driver = new ChromeDriver(); 
		 }
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get(URL);
	}
	
	//@Parameters("browser")
		@BeforeClass(groups = {"smoke", "RegressionTest"})
		public void configBeforeClass() throws Throwable {
			System.out.println("=========launch the browser==============");
			/*Common  Data*/
			//String URL  = fLib.getPropertyKeyValue("url");

			//String BROWSER  = fLib.getPropertyKeyValue("browser");
			String BROWSER  ="chrome";
			 if(BROWSER.equals("chrome")) {
			    driver = new ChromeDriver();
			 }else if(BROWSER.equals("firefox")) {
				 driver = new FirefoxDriver();
			 }else if(BROWSER.equals("ie")) {
				 driver = new InternetExplorerDriver();
			 }else {
				 driver = new ChromeDriver(); 
			 }
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.get(URL);
		}
		
	@AfterClass(groups = {"smoke", "RegressionTest"})
	public void confifAfterClass() {
		System.out.println("=========close the browser==============");
		driver.quit();
	}



}
