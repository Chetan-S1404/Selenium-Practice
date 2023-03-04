package Programs;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {

	public static void main(String[] args) throws Throwable {
		// create a object for physical file
		FileInputStream f= new FileInputStream("C:\\Users\\chetan\\eclipse-workspace\\Flipcart\\src\\test\\resources\\Book1.xlsx");
		//create a workbook
		Workbook wb= WorkbookFactory.create(f);
		//create a sheet
		Sheet s = wb.getSheet("sheet1");
		// get row
		Row r = s.getRow(0);
		//get cell
		Cell c = r.getCell(0);
		
		System.out.println(c);
		
		
		for(int i=0;i<3;i++)
		{Row r1 = s.getRow(i);
			for(int j=0;j<3;j++)
			{
				Cell c1 = r1.getCell(j);
				System.out.print((c1)+"   	");
				
			}
			 System.out.println();
		}
		
	}

}
