package utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteResultsToExcel {

	private static XSSFWorkbook workbook;

	public static String writeData(String principalAmount,String interestAmount)
	{
		String fileName = DateUtil.getTimeStamp() + ".xlsx";
		workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("EMI Calculator Results");
        sheet.setColumnWidth(0, 80*256);
        sheet.setColumnWidth(1, 50*256);
        Row headerRow = sheet.createRow(0);
        Cell headerCell1 = headerRow.createCell(0);
        Cell headerCell2 = headerRow.createCell(1);
        headerCell1.setCellValue("Principal Amount");
        headerCell2.setCellValue("Interest Amount");    
        
        sheet.createRow(1).createCell(0).setCellValue(principalAmount);
        sheet.getRow(1).createCell(1).setCellValue(interestAmount);
        
        try {
			FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir")+"/test-output/"+fileName);
			workbook.write(fout);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return fileName;
	}
	
}
