package co.in.craftsvilla.generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;

public class ReadExcel 
{
	public static File file = null;
	public static FileInputStream fin = null;
	public static Workbook wrkbk = null;
	public static Sheet sh = null;

	public static String[][] getData(String filename,String sheetname)
	{
		try
		{
			file = new File(filename);
			fin = new FileInputStream(file);
			wrkbk = new XSSFWorkbook(fin);
			sh=wrkbk.getSheet(sheetname);
			
			//last row or last column that has the data in the sheet.
			int rowNum = sh.getLastRowNum()+1; 
			/* +1 is added to match the number of rows and 
			number of columns as in the excel sheet*/
			
			int colNum = sh.getRow(0).getLastCellNum();
			
			String[][] data = new String[rowNum][colNum];
			for(int i=0;i<rowNum;i++)
			{
				Row r = sh.getRow(i);
				for(int j=0; j<colNum;j++)
				{
					Cell c = r.getCell(j);
					String value = new DataFormatter().formatCellValue(c);
					data[i][j] = value;					
				}
			}
			
			return data;
					
		}
		catch(Exception e)
		{
			Reporter.log("Unable to read the excel"+e);
			return null;
		}
	}

}