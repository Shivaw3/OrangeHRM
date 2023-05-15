package frameworks;



	import java.util.Objects;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Object_call {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Page_object a=new Page_object(d);
		a.username();
		a.password();
		a.button();
		a.close();


		
			

		}

	
		}

	

