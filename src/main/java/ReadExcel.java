import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

/**
 * Created by lbene on 17.08.2017.
 */
public class ReadExcel {

    public boolean read() {
        try {
            FileInputStream file = new FileInputStream(new File("/home/lbene/Documents/ExcelJava/src/main/java/filename.xls"));

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(0);

            for (Iterator<Row> rowIterator = sheet.iterator(); rowIterator.hasNext();) {
                Row row = rowIterator.next();

                for (Iterator<Cell> cellIterator = row.cellIterator(); cellIterator.hasNext();) {
                    Cell cellData = cellIterator.next();
                    // todo work with the data

                }
            }

            return true;
        }
        catch (Exception exception) {

            System.out.println("WTF");
        }

        return false;
    }
}
