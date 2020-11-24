package com.study.java.lang.parser;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * @author liu.ming320<br>
 * @CreatedDate 2020/10/20 15:33 <br>
 * @package com.study.java.lang.parser <br>
 */
public class XmlParserTest {

    private static final String FILE_PATH = "D:\\cache\\reconcile\\TransacRpt.xml";
//    private static final String FILE_PATH = "D:\\cache\\reconcile\\TransacRpt (1).xls";
    private static final String APP_PATH = "D:\\cache\\reconcile\\appFile4Payment.xml";


    @Test
    public void parseHtml() {

    }

    @Test
    public void parse() {
        File ipay88File = new File(FILE_PATH);

//        try {
//            Document document = null;
//            SAXReader reader = new SAXReader();
//            document = reader.read(ipay88File);
//            String DATA_NODE_PATH = "/table/tbody/tr";
//            List<Element> appNodeList = (List<Element>) document.selectNodes(DATA_NODE_PATH);
//
//
//            Element element = document.getRootElement();
//            element.elements();
//            element.element("table");
//            element.attributes();
//            System.out.println("parse end");
//        }
//        catch (Exception e) {
//            System.out.println("happen error");
//        }
//        System.out.println("In HtmlParserTest, parse ending!!!");
    }

    @Test
    public void parseXml() {
        File ipay88File = new File(APP_PATH);

//        try {
//            Document document = null;
//            SAXReader reader = new SAXReader();
//            document = reader.read(ipay88File);
//            Element element = document.getRootElement();
//            element.elements();
//            element.attributes();
//
//            String APP_NODE_PATH = "/amp/apps/app";
//            List<Element> appNodeList = (List<Element>) document.selectNodes(APP_NODE_PATH);
//            System.out.println("parse end");
//        }
//        catch (Exception e) {
//            System.out.println("happen error");
//        }
//        System.out.println("In HtmlParserTest, parse ending!!!");
    }
}
