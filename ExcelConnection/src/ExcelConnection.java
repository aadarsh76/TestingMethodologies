import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelConnection {

	public static Object[][] ExcelReader(String filePath,String sheetName) throws IOException{
		
		FileInputStream fileInputStream=new FileInputStream(filePath);
		
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		
		Sheet sheet=workbook.getSheet(sheetName);
		
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		
		Object [][] data=new Object[rowCount][colCount];
		
		for(int i=0;i<rowCount;i++) {
			Row row=sheet.getRow(i + 1);
			for(int j=0;j<colCount;j++) {
				Cell col=row.getCell(j);
				DataFormatter formatter=new DataFormatter();
				String cellValue=formatter.formatCellValue(col);
				data [i][j]=cellValue;
				
				
			}
		}
		
		workbook.close();
		fileInputStream.close();
		
		return data;
		
	}
	
}

