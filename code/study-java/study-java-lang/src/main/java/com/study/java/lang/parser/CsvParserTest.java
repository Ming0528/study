package com.study.java.lang.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/9/25 11:00 <br>
 * @package com.study.java.lang.parser <br>
 */
public class CsvParserTest {

    String SAMPLE_CSV_FILE_PATH = "D:\\cache\\reconcile\\cybersource\\TransactionRequestReport_20200923_001.csv";

    @Test
    public void readCsvFile() {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        FileInputStream fileInputStream = null;

        int colNum = 3;
        try {
            fileInputStream = new FileInputStream(SAMPLE_CSV_FILE_PATH);
            inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            CSVParser parser = CSVFormat.DEFAULT.parse(bufferedReader);
//            CSVParser parser = CSVParser.parse(new File(SAMPLE_CSV_FILE_PATH), StandardCharsets.UTF_8, CSVFormat.DEFAULT );

//          表内容集合，外层List为行的集合，内层List为字段集合
            List<List<String>> values = new ArrayList<>();
            int rowIndex = 0;


            Iterator<CSVRecord> currentIndex = parser.iterator();
            CSVRecord csvRecord;
            int count = 0;
            while (currentIndex.hasNext()) {
                count++;
                csvRecord = currentIndex.next();
                csvRecord.get(0);
                csvRecord.get(1);
                csvRecord.get(2);

                if (count >=5) {
                    break;
                }
            }

            count = 0;
            while (currentIndex.hasNext()) {
                count++;
                csvRecord = currentIndex.next();
                csvRecord.get(0);
                csvRecord.get(1);
                csvRecord.get(2);

                if (count >=5) {
                    break;
                }
            }

            parser.close();



//            for (CSVRecord record : parser.getRecords()) {
////              跳过表头
//                if (rowIndex == 0) {
//                    rowIndex++;
//                    continue;
//                }
////              每行的内容
//                List<String> value = new ArrayList<>(colNum + 1);
//                for (int i = 0; i < colNum; i++) {
//                    value.add(record.get(i));
//                }
//                values.add(value);
//                rowIndex++;
//            }
        } catch (IOException e) {
            System.out.println("happen error!");

        }
        finally {
            //关闭流
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
