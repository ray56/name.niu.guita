package name.niu.guitar.uitf.xlsgen.excelExporter;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

//
// Author:Leno
// Version:V1.0
//
public class ExportExcel<T>{
	
	@SuppressWarnings("unchecked")
	public void exportExcel(String title, String[] headers, int[] columnWidths, Collection<T> dataset, OutputStream out, String pattern) {
		
		// new workbook
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		// new sheet
		HSSFSheet sheet = workbook.createSheet(title);
		
		// setDefaultColumnWidth 15
		sheet.setDefaultColumnWidth(15);
		for(int i = 0 ; i < columnWidths.length ; i ++) {
			sheet.setColumnWidth(i, columnWidths[i]);
		}
		
		// createCellStyle
		HSSFCellStyle style =  workbook.createCellStyle();
		{
			// set style
			style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
			style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			style.setBorderRight(HSSFCellStyle.BORDER_THIN);
			style.setBorderTop(HSSFCellStyle.BORDER_THIN);
			style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			
			// createFont
			HSSFFont font = workbook.createFont();
			font.setColor(HSSFColor.VIOLET.index);
			font.setFontHeightInPoints((short) 12);
			font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
			
			style.setFont(font);
		}
		
		// createCellStyle2
		HSSFCellStyle style2 = workbook.createCellStyle();
		{
			style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
			style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
			style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
			style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
			style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);
			style2.setAlignment(HSSFCellStyle.ALIGN_LEFT);
			
			// createFont2
			HSSFFont font2 = workbook.createFont();
			font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
			
			style2.setFont(font2);
			
			style2.setWrapText(true);
		}
		
		// createDrawingPatriarch
		HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
		
		// createComment
		HSSFComment comment = patriarch.createComment(new HSSFClientAnchor(0, 0, 0, 0, (short) 4, 2, (short) 6, 5));
		comment.setString(new HSSFRichTextString("Comment enable!"));
		comment.setAuthor("");

		// createRow
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell(i);
			cell.setCellStyle(style);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text); 
		}

		// iterator dataset
		Iterator<T> it = dataset.iterator();
		int index = 0;
		while (it.hasNext()) {
			index++;
			row = sheet.createRow(index);
			row.setHeightInPoints(50);
			T t = (T) it.next();
			
			Field[] fields = t.getClass().getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				HSSFCell cell = row.createCell(i);
				cell.setCellStyle(style2);
				Field field = fields[i];
				String fieldName = field.getName();
				String getMethodName = "get"
						+ fieldName.substring(0, 1).toUpperCase()
						+ fieldName.substring(1);
				try {
					@SuppressWarnings("rawtypes")
					Class tCls = t.getClass();
					Method getMethod = tCls.getMethod(getMethodName,
							new Class[] {});
					
					Object value = getMethod.invoke(t);
					
					String textValue = null;
					
					if (value instanceof Boolean) {
						boolean bValue = (Boolean) value;
						textValue = (bValue) ? "TRUE" : "FALSE";
					} else if (value instanceof Date) {
						Date date = (Date) value;
						SimpleDateFormat sdf = new SimpleDateFormat(pattern);
						textValue = sdf.format(date);
					} else if (value instanceof byte[]) {
						
						row.setHeightInPoints(60);
						sheet.setColumnWidth(i, (short) (35.7 * 80));
						byte[] bsValue = (byte[]) value;
						HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 1023, 255, (short) 6, index, (short) 6, index);
						anchor.setAnchorType(2);
						patriarch.createPicture(anchor, workbook.addPicture(bsValue, HSSFWorkbook.PICTURE_TYPE_JPEG));
					} else {
						textValue = value.toString();
					}
					
					if (textValue != null) {
						Pattern p = Pattern.compile("^\\d+(\\.\\d+)?$");
						Matcher matcher = p.matcher(textValue);
						if (matcher.matches()) {
							cell.setCellValue(Double.parseDouble(textValue));
						} else {
							HSSFRichTextString richString = new HSSFRichTextString(textValue);
							HSSFFont font3 = workbook.createFont();
							font3.setColor(HSSFColor.BLUE.index);
							richString.applyFont(font3);
							cell.setCellValue(richString);
						}
					}
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} finally {
					
				}
			}

		}
		
		sheet.autoSizeColumn(0);
		
		try {
			workbook.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
