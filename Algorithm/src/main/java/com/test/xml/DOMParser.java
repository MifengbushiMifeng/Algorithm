package com.test.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jonathan on 2017/1/31.
 */
public class DOMParser {

    public DOMParser() {
        super();
    }

    public static void main(String[] args) {
        DOMParser parser = new DOMParser();
        Document document = parser.parse("D:\\temp\\xml\\books.xml");

        // Get root element
        Element rootElement = document.getDocumentElement();

        // traverse
        NodeList nodes = rootElement.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
            Node node = nodes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element child = (Element) node;
                // process child element

            }
        }

        NodeList nodeList = rootElement.getElementsByTagName("book");
        if (nodeList != null) {
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String id = element.getAttribute("id");
                System.out.println("The Ids in the XML file are : " + id);
            }
        }

    }

    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

    // Load And parse XML file into DOM
    public Document parse(String filePath) {

        org.w3c.dom.Document document = null;
        try {
            // DOM parser instance
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            // parse an XML file into a DOM tree
            document = builder.parse(new File(filePath));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;

    }

}
