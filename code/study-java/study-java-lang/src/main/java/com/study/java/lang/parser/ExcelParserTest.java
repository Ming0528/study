package com.study.java.lang.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelParserTest {
    private static final String SAMPLE_EXCEL_FILE_PATH = "D:\\cache\\cashier_record_20201119_20201119.xls";

    private static final String FILE_NAME_XLS_SUBFFIX = "xls";
    private static final String FILE_NAME_XLSX_SUBFFIX = "xlsx";

    private static final String EMPTY_STRING = "";


    @Test
    public void testIpay88() {
        File excelFile = new File(SAMPLE_EXCEL_FILE_PATH);
        getWorkbook(excelFile);
    }

    private Workbook getWorkbook(File file) {
        String fileName = file.getName();
        Workbook workbook = null;
        try {
            if (fileName.toLowerCase().endsWith(FILE_NAME_XLS_SUBFFIX)) {
                workbook = new HSSFWorkbook(new FileInputStream(file));
            }
            else if (fileName.toLowerCase().endsWith(FILE_NAME_XLSX_SUBFFIX)) {
                workbook = new XSSFWorkbook(new FileInputStream(file));
            }

            Sheet sheet = workbook.getSheetAt(0);
            Row row = null;
            List<String> colList = null;

            for (int i =0; i < 100; i++) {
                row = sheet.getRow(i);
                colList = new ArrayList<>();

                Cell cell;
                for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                    cell = row.getCell(j);
                    colList.add(buildCellValue(cell));
                }
                System.out.println("parase end!");
            }
        }
        catch (IOException ioe) {
            System.out.println("In AbstractExcelParser getWorkbook, open file happen error!");
        }
        return workbook;
    }


    /**
     * @description
     * 获取单元格值<br>
     * @param cell 单元格
     */
    private String buildCellValue(Cell cell) {
        if (cell == null) {
            return EMPTY_STRING;
        }
        switch (cell.getCellTypeEnum()) {
            case NUMERIC:
                return NumberToTextConverter.toText(cell.getNumericCellValue());
            case STRING:
                return cell.getStringCellValue();
            case BLANK:
                return EMPTY_STRING;
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return cell.toString();
        }
    }
}
