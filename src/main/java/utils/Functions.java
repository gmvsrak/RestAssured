package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Functions {
	static Properties prop = null;
	static FileInputStream fs = null;
	private static String folderName;
	private static String filename = System.getProperty("user.dir")+"//src//main//resources//TestData.xlsx";	
	private static XSSFWorkbook workbook = null;
    private static XSSFSheet sheet = null;
    private static XSSFRow row = null;
    private static XSSFCell cell = null;
    private static Functions single_instance = null; 
    
    private Functions() {
    	
    }
    
	public Properties loadConfigFile(String fileName) throws IOException {
		try {
			folderName = System.getProperty("user.dir")+"//src//main//resources";
			fs = new FileInputStream( folderName +"/"+ fileName + ".properties");
			prop = new Properties();
			prop.load(fs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
	public String getCellData(String sheetName, String param) throws IOException {
		fs = new FileInputStream(filename);
		workbook = new XSSFWorkbook(fs);
        int rowNum = -1;
        try {
                int index = workbook.getSheetIndex(sheetName);
                if (index == -1) {
                    return "";
                } else {
                    sheet = workbook.getSheetAt(index);
          
                    for(int i = 0; i <= sheet.getLastRowNum(); ++i) {
                        if (sheet.getRow(i).getCell(0).getStringCellValue().trim().equals(param.trim())) {
                       		rowNum = i;
                            break;
                        }
                    }
                     row = sheet.getRow(rowNum);
                    return row.getCell(1).getStringCellValue();
                }
                
               
        } catch (Exception e) {
            e.printStackTrace();
            Log.error("Market " + param + " or component");
            //System.out.println("Market " + market + " or component " + component + " does not exist in xls");
            throw new NullPointerException("Market " + param);
        }
        
        
	}
                    
	public static Functions getInstance() {
    	if (single_instance == null) 
            single_instance = new Functions(); 
    	return single_instance;
    }

}
