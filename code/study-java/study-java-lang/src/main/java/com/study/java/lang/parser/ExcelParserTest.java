package com.study.java.lang.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ExcelParserTest {
    private static final String SAMPLE_EXCEL_FILE_PATH = "D:\\cache\\reconcile\\TransacRpt (1).xls";

    private static final String FILE_NAME_XLS_SUBFFIX = "xls";
    private static final String FILE_NAME_XLSX_SUBFFIX = "xlsx";

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
        }
        catch (IOException ioe) {
            System.out.println("In AbstractExcelParser getWorkbook, open file happen error!");
        }
        return workbook;
    }
}
