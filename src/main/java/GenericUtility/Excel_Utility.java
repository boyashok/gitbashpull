package GenericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains all excel data methods
 * @author DELL
 *
 */
public class Excel_Utility {
   /**
    * This method is used to read the data from excel sheet
    * @param sheetname
    * @param rownum
    * @param cellnum
    * @return
    * @throws Throwable
    */
	public String getSheetandRow(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fis1= new FileInputStream("./src/test/resources/\\commondata.xlsx");
		Workbook book= WorkbookFactory.create(fis1);
		Sheet sh=book.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		Cell cel=row.getCell(cellnum);
		String value1=cel.getStringCellValue();
		return value1;
		
	}
}
