package advancedSelenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMerging {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row=sheet.getRow(2);
		Cell cell=row.getCell(1);
		String data=cell.getStringCellValue();
		System.out.println(data);
		
		
		

	}

}
