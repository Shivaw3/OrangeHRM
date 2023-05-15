package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Key_word_framework {
		WebDriver d;
		public void Opening_Browser()
		{
			System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
			d= new ChromeDriver();
			
		}
		public void Navigating()
		{
			d.get("http://www.google.com");
			d.manage().window().maximize();
		}
		public void Text_Box()
		{
			d.findElement(By.name("q")).sendKeys("manual testing");
		}
		public void Search_Button()
		{
			d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}
		public void Close()
		{
			d.close();
		}
		}
