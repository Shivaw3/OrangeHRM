package frameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("d://Read1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet13");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		WebElement link=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		List<WebElement>link1=link.findElements(By.tagName("option"));
		System.out.println(link1.size());
		for(int i=1;i<link1.size();i++) {
			System.out.println(link1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(link1.get(i).getText());
			link1.get(i).click();
			if(link1.get(i).isSelected()) {
				r.createCell(1).setCellValue("pass");
			}
			else {
			r.createCell(1).setCellValue("fail");
			}
		}
		FileOutputStream f1=new FileOutputStream("d://Read1.xlsx");
		wb.write(f1);
		f1.close();
		
	}

}
