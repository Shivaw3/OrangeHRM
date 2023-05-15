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

public class Data_driven_framewoks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("C:\\Users\\dell\\Downloads\\t111.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet ws=wb.getSheet("sheet1");
Row r=null;
Cell c=null;
System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://demo.guru99.com/test/newtours/");
WebElement we=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
List<WebElement>we1=we.findElements(By.tagName("a"));
System.out.println(we1.size());
for(int i=0;i<we1.size();i++) {
	try {
	System.out.println(we1.get(i).getText());
	r=ws.getRow(i);
	we1.get(i).click();
	String exp=r.getCell(1).getStringCellValue();
	String act=d.getCurrentUrl();
	r.createCell(2).setCellValue(act);
	if(exp==act) {
		r.createCell(3).setCellValue("pass");
	}
	else {
		r.createCell(3).setCellValue("fail");
	}
}
	catch(Exception e) {
		
	}
	
}
FileOutputStream f2=new FileOutputStream("C:\\Users\\dell\\Downloads\\t111.xlsx");
wb.write(f2);
f2.close();
	}

}
