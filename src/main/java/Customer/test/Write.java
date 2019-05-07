package Customer.test;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Write {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sht = wb.createSheet("Demo");
		HSSFRow r = sht.createRow(0);

		for (int i = 0; i < 4; i++) {
			HSSFCell c = r.createCell(i);
			if (i == 0) {
				c.setCellValue("Div ID");
			} else if (i == 1) {
				c.setCellValue("Div Name");
			} else if (i == 2) {
				c.setCellValue("Loc ID");
			} else if (i == 3) {
				c.setCellValue("Loc Name");
			}

		}
		HSSFRow r1 = sht.createRow(1);
		for (int i = 0; i < 4; i++) {
			HSSFCell c = r1.createCell(i);
			if (i == 0) {
				c.setCellValue("01");
			} else if (i == 1) {
				c.setCellValue("TCS");
			} else if (i == 2) {
				c.setCellValue("123");
			} else if (i == 3) {
				c.setCellValue("Cax");
			}
		}

		FileOutputStream fos = new FileOutputStream("D:\\Ak\\test.xls");
		wb.write(fos);

		fos.close();

	}
}
