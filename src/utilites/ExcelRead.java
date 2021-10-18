package utilites;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell coloumn;
	public XSSFCellStyle style;
	public String path=null;
	
	
	public ExcelRead(String path)
	{	
		this.path=path;
	}
	
	public int getRowcount(String sheetname) throws IOException
	{
		fi= new FileInputStream(path);
		workbook = new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		workbook.close();
		fi.close();
		return rowcount ;
		
	}
	
	 public int getCellcount(String sheetname,int rownum) throws IOException
	 {
		 fi=new FileInputStream(path);
		 workbook=new XSSFWorkbook(fi);
		 sheet=workbook.getSheet(sheetname);
		 row=sheet.getRow(rownum);
		 int cellcount=row.getLastCellNum();
		 workbook.close();
		 fi.close();
		 return cellcount ;
	 }
	public String getCellData(String sheetname,int rownum ,int column) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		coloumn=row.getCell(column);
		DataFormatter format =new DataFormatter();
		String data;
		try{
			
			data=format.formatCellValue(coloumn);
			
		}
		catch(Exception e)
		{
			data="";
			
		}
			workbook.close();
			fi.close();
		return data;
	}
	
	public void setCellvalue(String sheetname,int rownum,int column,String data) throws IOException
	{
		fi=new FileInputStream(path);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		coloumn=row.createCell(column);
		coloumn.setCellValue(data);
		//for update excel file
		fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		fi.close();
		fo.close();
	}
	
	
	
}
