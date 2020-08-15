package Test1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Example1 
{
	
  
	public static void main(String[] args) throws IOException, InterruptedException
	{
		try {
			
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Rashmitha\\Desktop\\Demo1.xlsx");
		Thread.sleep(500);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	
		XSSFSheet s= wb.getSheet("Sheet2");
		
		int rc = s.getLastRowNum();

		for (int i = 0; i < rc ; i++)
		{
		
			XSSFRow r = s.getRow(i);
			
			Thread.sleep(5000);
			int cc = r.getLastCellNum();
			
		for (int j = 0; j < cc; j++)
		
		 {
		   XSSFCell c = r.getCell(j);
		   
		   String  str = c.getStringCellValue();
		   
			Thread.sleep(500);
		   
		   if (r != null) 
			{
				switch (c.getCellType()) 
				{
				case Cell.CELL_TYPE_STRING:
					
					Thread.sleep(5000);
					
					str = c.getStringCellValue();
					
					System.out.println(str);
					break;
					
				case Cell.CELL_TYPE_NUMERIC:
					
					Thread.sleep(5000);

					
					str = NumberToTextConverter.toText(c.getNumericCellValue());
					
					System.out.println(str);
					
					break;
			   
		        }
	       }
		
				
		}

	}
		}	
		
		catch (Exception e) 
		{
		
		System.out.println("File not found");
          e.printStackTrace();

		}
			
		 
	}
}
	


	
	

