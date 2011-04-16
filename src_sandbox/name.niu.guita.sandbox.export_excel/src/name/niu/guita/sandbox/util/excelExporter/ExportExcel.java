package name.niu.guita.sandbox.util.excelExporter;
 
import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import name.niu.guita.sandbox.dataObject.Book;
import name.niu.guita.sandbox.dataObject.Student;
import name.niu.guita.sandbox.dataObject.TestCaseDescription;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

/**
 * ���ÿ�Դ���POI3.0.2��̬����EXCEL�ĵ�
 * ת��ʱ�뱣��������Ϣ��ע��������
 * @author leno
 * @version v1.0
 * @param <T> Ӧ�÷��ͣ���������һ������javabean������
 * ע������Ϊ�˼������boolean�͵�����xxx��get����ʽΪgetXxx(),������isXxx()
 * byte[]��jpg��ʽ��ͼƬ����
 */
public class ExportExcel<T> {
 
   public void exportExcel(Collection<T> dataset, OutputStream out) {
      exportExcel("����POI����EXCEL�ĵ�", null, dataset, out, "yyyy-MM-dd");
   }
 
   public void exportExcel(String[] headers, Collection<T> dataset,
         OutputStream out) {
      exportExcel("����POI����EXCEL�ĵ�", headers, dataset, out, "yyyy-MM-dd");
   }
 
   public void exportExcel(String[] headers, Collection<T> dataset,
         OutputStream out, String pattern) {
      exportExcel("����POI����EXCEL�ĵ�", headers, dataset, out, pattern);
   }
 
   /**
    * ����һ��ͨ�õķ�����������JAVA�ķ�����ƣ����Խ�������JAVA�����в��ҷ���һ��������������EXCEL ����ʽ�����ָ��IO�豸��
    *
    * @param title
    *            ��������
    * @param headers
    *            ���������������
    * @param dataset
    *            ��Ҫ��ʾ�����ݼ���,������һ��Ҫ���÷���javabean������Ķ��󡣴˷���֧�ֵ�
    *            javabean���Ե����������л����������ͼ�String,Date,byte[](ͼƬ����)
    * @param out
    *            ������豸�����������󣬿��Խ�EXCEL�ĵ������������ļ�����������
    * @param pattern
    *            �����ʱ�����ݣ��趨�����ʽ��Ĭ��Ϊ"yyy-MM-dd"
    */
   @SuppressWarnings("unchecked")
   public void exportExcel(String title, String[] headers,
         Collection<T> dataset, OutputStream out, String pattern) {
      // ����һ��������
      HSSFWorkbook workbook = new HSSFWorkbook();
      // ����һ�����
      HSSFSheet sheet = workbook.createSheet(title);
      // ���ñ��Ĭ���п��Ϊ15���ֽ�
      sheet.setDefaultColumnWidth(15);
      // ����һ����ʽ
      HSSFCellStyle style = workbook.createCellStyle();
      // ������Щ��ʽ
      style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);
      style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
      // ����һ������
      HSSFFont font = workbook.createFont();
      font.setColor(HSSFColor.VIOLET.index);
      font.setFontHeightInPoints((short) 12);
      font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
      // ������Ӧ�õ���ǰ����ʽ
      style.setFont(font);
      // ���ɲ�������һ����ʽ
      HSSFCellStyle style2 = workbook.createCellStyle();
      style2.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);
      style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
      style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
      style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
      style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
      style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
      style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
      style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
      // ������һ������
      HSSFFont font2 = workbook.createFont();
      font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
      // ������Ӧ�õ���ǰ����ʽ
      style2.setFont(font2);
     
      // ����һ����ͼ�Ķ���������
      HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
      // ����ע�͵Ĵ�С��λ��,����ĵ�
      HSSFComment comment = patriarch.createComment(new HSSFClientAnchor(0, 0, 0, 0, (short) 4, 2, (short) 6, 5));
      // ����ע������
      comment.setString(new HSSFRichTextString("������POI�����ע�ͣ�"));
      // ����ע�����ߣ�������ƶ�����Ԫ�����ǿ�����״̬���п���������.
      comment.setAuthor("leno");
 
      //������������
      HSSFRow row = sheet.createRow(0);
      for (int i = 0; i < headers.length; i++) {
         HSSFCell cell = row.createCell(i);
         cell.setCellStyle(style);
         HSSFRichTextString text = new HSSFRichTextString(headers[i]);
         cell.setCellValue(text);
      }
 
      //�����������ݣ�����������
      Iterator<T> it = dataset.iterator();
      int index = 0;
      while (it.hasNext()) {
         index++;
         row = sheet.createRow(index);
         T t = (T) it.next();
         //���÷��䣬����javabean���Ե��Ⱥ�˳�򣬶�̬����getXxx()�����õ�����ֵ
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
                Class tCls = t.getClass();
                Method getMethod = tCls.getMethod(getMethodName,
                      new Class[] {});
                Object value = getMethod.invoke(t, new Object[] {});
                //�ж�ֵ�����ͺ����ǿ������ת��
                String textValue = null;
//              if (value instanceof Integer) {
//                 int intValue = (Integer) value;
//                 cell.setCellValue(intValue);
//              } else if (value instanceof Float) {
//                 float fValue = (Float) value;
//                 textValue = new HSSFRichTextString(
//                       String.valueOf(fValue));
//                 cell.setCellValue(textValue);
//              } else if (value instanceof Double) {
//                 double dValue = (Double) value;
//                 textValue = new HSSFRichTextString(
//                       String.valueOf(dValue));
//                 cell.setCellValue(textValue);
//              } else if (value instanceof Long) {
//                 long longValue = (Long) value;
//                 cell.setCellValue(longValue);
//              }
                if (value instanceof Boolean) {
                   boolean bValue = (Boolean) value;
                   textValue = "��";
                   if (!bValue) {
                      textValue ="Ů";
                   }
                } else if (value instanceof Date) {
                   Date date = (Date) value;
                   SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                    textValue = sdf.format(date);
                }  else if (value instanceof byte[]) {
                   // ��ͼƬʱ�������и�Ϊ60px;
                   row.setHeightInPoints(60);
                   // ����ͼƬ�����п��Ϊ80px,ע�����ﵥλ��һ������
                   sheet.setColumnWidth(i, (short) (35.7 * 80));
                   // sheet.autoSizeColumn(i);
                   byte[] bsValue = (byte[]) value;
                   HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0,
                         1023, 255, (short) 6, index, (short) 6, index);
                   anchor.setAnchorType(2);
                   patriarch.createPicture(anchor, workbook.addPicture(
                         bsValue, HSSFWorkbook.PICTURE_TYPE_JPEG));
                } else{
                   //�����������Ͷ������ַ����򵥴���
                   textValue = value.toString();
                }
                //�������ͼƬ���ݣ�������������ʽ�ж�textValue�Ƿ�ȫ�����������
                if(textValue!=null){
                   Pattern p = Pattern.compile("^\\d+(\\.\\d+)?$");  
                   Matcher matcher = p.matcher(textValue);
                   if(matcher.matches()){
                      //�����ֵ���double����
                      cell.setCellValue(Double.parseDouble(textValue));
                   }else{
                      HSSFRichTextString richString = new HSSFRichTextString(textValue);
                      HSSFFont font3 = workbook.createFont();
                      font3.setColor(HSSFColor.BLUE.index);
                      richString.applyFont(font3);
                      cell.setCellValue(richString);
                   }
                }
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                //������Դ
            }
         }
 
      }
      try {
         workbook.write(out);
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
 
   }
 
   public static void main(String[] args) {
		// Test TestCaseDescription
		ExportExcel<TestCaseDescription> eetc = new ExportExcel<TestCaseDescription>();
		String[] eetc_header = { "No.", "Test Case Id", "Operations",
				"Excepted Result" };
		List<TestCaseDescription> eetc_dataset = new ArrayList<TestCaseDescription>();
		eetc_dataset.add(new TestCaseDescription("1", "Case_001",
				"[Precondition]\r1.ϵͳ��A������\r[Steps]\r1.���Button1\r",
				"[Excepted]\r1.���ﻭ��B"));
		eetc_dataset.add(new TestCaseDescription("2", "Case_002",
				"[Precondition]\r1.ϵͳ��B������\r[Steps]\r1.���Button2\r",
				"[Excepted]\r1.���ﻭ��C"));
		eetc_dataset.add(new TestCaseDescription("3", "Case_003",
				"[Precondition]\r1.ϵͳ��C������\r[Steps]\r1.���Button3\r",
				"[Excepted]\r1.���ﻭ��A"));

		OutputStream eetc_out;
		try {
			eetc_out = new FileOutputStream("C:\\tc.xls");
			eetc.exportExcel(eetc_header, eetc_dataset, eetc_out);
			eetc_out.close();
			JOptionPane.showMessageDialog(null, "�����ɹ�!");
			System.out.println("excel�����ɹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	   
      // ����ѧ��
      ExportExcel<Student> ex = new ExportExcel<Student>();
      String[] headers = { "ѧ��", "����", "����", "�Ա�", "��������" };
      List<Student> dataset = new ArrayList<Student>();
      dataset.add(new Student(10000001, "����", 20, true, new Date()));
      dataset.add(new Student(20000002, "����", 24, false, new Date()));
      dataset.add(new Student(30000003, "����", 22, true, new Date()));
      // ����ͼ��
      ExportExcel<Book> ex2 = new ExportExcel<Book>();
      String[] headers2 = { "ͼ����", "ͼ������", "ͼ������", "ͼ��۸�", "ͼ��ISBN",
            "ͼ�������", "����ͼƬ" };
      List<Book> dataset2 = new ArrayList<Book>();
      try {
         BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("book.jpg"));
         byte[] buf = new byte[bis.available()];
         while ((bis.read(buf)) != -1) {
            //
         }
         dataset2.add(new Book(1, "jsp", "leno", 300.33f, "1234567",
                "�廪������", buf));
         dataset2.add(new Book(2, "java���˼��", "brucl", 300.33f, "1234567",
                "���������", buf));
         dataset2.add(new Book(3, "DOM����", "lenotang", 300.33f, "1234567",
                "�廪������", buf));
         dataset2.add(new Book(4, "c++����", "leno", 400.33f, "1234567",
                "�廪������", buf));
         dataset2.add(new Book(5, "c#����", "leno", 300.33f, "1234567",
                "�����������", buf));
 
         OutputStream out = new FileOutputStream("C:\\a.xls");
         OutputStream out2 = new FileOutputStream("C:\\b.xls");
         ex.exportExcel(headers, dataset, out);
         ex2.exportExcel(headers2, dataset2, out2);
         out.close();
         JOptionPane.showMessageDialog(null, "�����ɹ�!");
         System.out.println("excel�����ɹ���");
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}