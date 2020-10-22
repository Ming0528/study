package com.study.java.lang.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class HtmlParserTest {

    private static final String FILE_PATH = "D:\\cache\\ipay88\\TransacRpt.xls";

    @Test
    public void testHtmlToString2() {
        String html = "<p>这是一个段落<img src=\"test.img\"/>内容;</p>";
        Document doc = Jsoup.parse(html);
        System.out.println(doc); // 输出带标签的html文档
        System.out.println("---------------------\n"+doc.text()); // 输出内容
        Elements element = doc.getElementsByTag("p");
        System.out.println("---------------------\n"+element.get(0).html());
    }

    @Test
    public void test2() {
        String html = "<div><p>Lorem ipsum.</p>";
        Document doc = Jsoup.parseBodyFragment(html);
        System.out.println(doc);
        System.out.println(doc.text());
    }

    @Test
    public void parseHtml() {
        try {

            Document document = Jsoup.parse(new File(FILE_PATH), "UTF-8");

            Elements elements = document.getElementsByTag("table");
            Elements elementss = document.getElementsByTag("tr");
            System.out.println("parse html end");
        }
        catch (Exception e) {
            System.out.println("parse html happen error");
        }
        System.out.println("final parse html end");
    }

    @Test
    public void parseHtml1() {
        try {
//            File currentFile = new File(FILE_PATH);
//            String currentFileName = currentFile.getName().substring(0, currentFile.getName().lastIndexOf("."));
//            String currentFileSuffix = currentFile.getName().substring(currentFile.getName().lastIndexOf("."));
//
//            // 当前时间戳
//            String nowDateStr = "20201021";
//            String currentFileParentPath = currentFile.getParentFile().getAbsolutePath();
//            String opearFileNames = "";
//            File opearFile;
//            opearFileNames = currentFileParentPath + File.separator + currentFileName + "_" + nowDateStr + currentFileSuffix;
//            opearFile = new File(opearFileNames);
//            // 复制文件
//            FileUtils.copyFile(currentFile, opearFile);
//            // 重命名 后缀
//            String htmlFileName = currentFileParentPath + File.separator + currentFileName + "_" + nowDateStr + "." + "html";
//            File htmlFile = new File(htmlFileName);
//            opearFile.renameTo(htmlFile);
//            Document document = Jsoup.parse(htmlFile, "UTF-8");

            File f = new File(FILE_PATH);
            InputStream in = new FileInputStream(f);
            Document document = Jsoup.parse(in, "UTF-8", f.getAbsolutePath());
            Element tableElement = document.select("table[bgcolor='#cccccc']").first();
            Element tbodyElement = tableElement.getElementsByTag("tbody").first();
            Elements trElements = tbodyElement.getElementsByTag("tr");

            int count = 0;
            for (Element element : trElements) {
                Elements tdElements = element.getElementsByTag("td");
                System.out.println("The count " + count + " value is:");
                for(Element tdElement : tdElements) {
                    System.out.println(tdElement.text());
                }
                count++;
            }
            System.out.println("parse html end");

//            Elements elementLists = document.getElementsByTag("tr");
//
//            Element element0 = elementLists.get(0);
//            Elements element0s = element0.getElementsByTag("td");
//            element0.getAllElements();

//            Element element1 = elementLists.get(1);
//            Elements element1s = element1.getElementsByTag("td");
//            element1s.get(0);
//            element1s.get(2).text();
//            element1s.get(2).tagName();
//
//            element1s.get(3);
//            element1.getAllElements();

//            Element element29 = elementLists.get(29);
//            Elements element29s = element29.getElementsByTag("td");
//            element29.getAllElements();
        }
        catch (Exception e) {
            System.out.println("parse html happen error");
        }
        System.out.println("final parse html end");
    }
}
