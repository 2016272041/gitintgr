package GithubIntegr.gittest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException {
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle = "Meet Guru99";
		String aTitle = "";
		//launch Firefox and redirect it to the Base URL
		driver.manage().window().maximize();
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(eTitle)){
			System.out.println("Test Passed");
			}
		else {
			System.out.println("Test Failed");
		}
		//close Firefox browser
			driver.close();
		}
	}
