package advancedSelenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Multipledatafetching {
public static void main(String[] args)throws Throwable{
	//Give the Path
	FileInputStream fis=new FileInputStream("./Data/Multipledata.xlsx");
	//Take the control of workbook
	Workbook wb=WorkbookFactory.create(fis);
	//Take the control of Sheet
	Sheet sheet=wb.getSheet("Sheet1");
	int rowcount=sheet.getPhysicalNumberOfRows();
	int cellcount=sheet.getRow(0).getPhysicalNumberOfCells();
	for(int i=1;i<rowcount;i++) {
		for(int j=0;j<cellcount;j++) {
			String data=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data);
		}
	}
}

}
