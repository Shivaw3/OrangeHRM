package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver d=new FirefoxDriver();
d.get("https://demo.guru99.com/test/newtours/");
d.manage().window().maximize();
	}

}
