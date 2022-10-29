package prasad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcel {

	public static void main(String[] args) throws Exception {
		
     FileInputStream file=new FileInputStream("C://selenium practise//Data driven practise.xlsx");
		
     XSSFWorkbook workbook=new XSSFWorkbook(file);
     XSSFSheet sheet=workbook.getSheet("sheet1");//Providing sheet name
     //XSSFSheet sheet=workbook.getSheetAt(0);//proving the sheet no
     int rowcount=sheet.getLastRowNum();//returns the row count
     int Colcount=sheet.getRow(0).getLastCellNum();//returns the coloumn/cell count
     for (int i=0; i<=rowcount;i++)
     {
     XSSFRow currentrow=sheet.getRow(i);//focussed on current row
     for(int j=0;j<Colcount;j++)
     {
     String value=currentrow.getCell(j).toString();//read value from sheet
     System.out.print("     "   +value);
     }
     System.out.println();
     }	 
     }
	 }


