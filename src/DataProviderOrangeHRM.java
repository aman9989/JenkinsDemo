import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOrangeHRM {

	public String workBkPath; 
	
	@Test(dataProvider="getWorkBookPath")
	public void loginFunc(String UserId, String Password) {
		System.out.println("UserID : "+UserId+"   Password : "+Password);
	}
	
	@DataProvider
	public String[][] getWorkBookPath() throws IOException {
		workBkPath = System.getProperty("user.dir")+"\\src\\TestData\\DataProvider.xlsx";
		//Read Data from File
		//File file = new File(workBkPath);
		FileInputStream fis = new FileInputStream(workBkPath);
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rowCount = sh.getLastRowNum()+1;
		System.out.println(rowCount);
		
		//Count cols of one row
		Row row= sh.getRow(0);
		//To get the last coloumn number
		short colCount = row.getLastCellNum();
		System.out.println(colCount);
		String temp[][]=new String[rowCount-1][colCount];
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String data = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+"  ");
				temp[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
			System.out.println();
		}
		return temp;
	}
}