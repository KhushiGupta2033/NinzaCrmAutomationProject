package ninzaCRM.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class consist of all the generic methods related to file operations like property file, excel sheet etc
 * @author Khushi Gupta
 * 
 */
public class FileUtility {
	
	/**
	 * 
	 * This method is used to read data from property file
	 * @param keys
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String keys) throws IOException {
		FileInputStream file= new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(file);
		return p.getProperty(keys);
	}
	
//	read data from excel
	
	/**
	 * This method is used to read the data from excel and return the value to the caller method
	 * @param sheetName
	 * @param rowNo
	 * @param cellNo
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream excel= new FileInputStream("C:\\Users\\User\\Desktop\\FireFlink.TestData.xlsx");
		Workbook wobj=WorkbookFactory.create(excel);
		return wobj.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	}
	
	public Object[][] readMultipleData(String sheetName, int rows, int cols) throws EncryptedDocumentException, IOException {
		FileInputStream excel= new FileInputStream("C:\\Users\\User\\Desktop\\ExcelPrac.xlsx");
		Workbook wobj=WorkbookFactory.create(excel);
		Sheet sheet = wobj.getSheet(sheetName);
		int lastrow=sheet.getLastRowNum();
		int lastCol=sheet.getRow(rows).getLastCellNum();
		
		Object[][] data=new Object[lastrow][lastCol] ;
		for(int i=0;i<lastrow;i++)
		{
			for(int j=0;j<lastCol;j++)
			{
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
			
		
	}

}
