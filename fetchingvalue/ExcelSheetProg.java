package fetchingvalue;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetProg 
{
  
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Anant\\eclipse-workspace\\SeleniumProject\\ExcelSheet\\minakshiSheet.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s1=wb.getSheet("login_cred");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(1);
		String value1=c1.getStringCellValue();
		System.out.println(value1);
	}
}
