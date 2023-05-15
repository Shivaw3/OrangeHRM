package frameworks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Key_word_call {

		public static void main(String[] args) throws IOException {
			FileInputStream f= new FileInputStream("C:\\Users\\dell\\Downloads\\keys.xlsx");
			XSSFWorkbook w= new XSSFWorkbook(f);
			XSSFSheet s= w.getSheet("sheet2");
			Key_word_framework a=new Key_word_framework();
			Row r=s.getRow(0);
			Iterator <Row> row=s.iterator();
			while(row.hasNext())
			{
			   r = row.next();
				String act=r.getCell(2).getStringCellValue();
				if(act.equals("Opening_Browser"))
				{
					a.Opening_Browser();
				}
				else if(act.equals("Navigating"))
				{
					a.Navigating();
				}
				else if(act.equals("Text_Box"))
				{
					a.Text_Box();
				}
				else if(act.equals("Search_Button"))
				{
					a.Search_Button();
				}
				else if(act.equals("Close"))
				{
					
					
					a.Close();
					
				}
			}

		}

	}
