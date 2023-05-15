package frameworks;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Page_object {
	
			By username=By.name("username");
			By password =By.name("password");
			By submit=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
			WebDriver d; 
			Page_object(ChromeDriver d2)
			{
			this.d=d2;
			}

		public void username()
		{
			d.findElement(username).sendKeys("Admin");
			
		}
			public void password()
			{
				d.findElement(password).sendKeys("admin123");
			}
			public void button()
			{
				d.findElement(submit).click();
				
			}
			public void close()
			{
				d.close();
				
			}
			
		}
	

