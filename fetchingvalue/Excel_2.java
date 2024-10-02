package fetchingvalue;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Excel_2 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException 
   {
	   FileInputStream fis=new FileInputStream("C:\\Users\\Anant\\eclipse-workspace\\SeleniumProject\\ExcelSheet\\minakshiSheet.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	    String Mobile1= NumberToTextConverter.toText(wb.getSheet("login_cred").getRow(2).getCell(0).getNumericCellValue());
	    System.out.println(Mobile1);
}
}
