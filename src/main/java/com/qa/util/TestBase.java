package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\"
				+ "CucumberWithPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\\\automation extenstions\\\\geckodriver-v0.26.0-win64\\\\geckodriver.exe");
	        driver = new FirefoxDriver();
		}
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32/chromedriver.exe");
	        driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(waits.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(waits.implicity_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
