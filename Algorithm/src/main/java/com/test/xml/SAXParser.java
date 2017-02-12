package com.test.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IBM on 2017/2/2.
 */
public class SAXParser {

    class BookHander extends DefaultHandler {

        private List<String> nameList;

        public List<String> getNameList() {
            return nameList;
        }

        private boolean title = false;

        // Called at the start of an XML document
        @Override
        public void startDocument() throws SAXException {
            System.out.println("Start parsing document...");
            nameList = new ArrayList<String>();

        }

        // Called at the end of an XML document
        @Override
        public void endDocument() throws SAXException {
            System.out.println("End");

        }

        /**
         * Start processing of an element
         *
         * @param uri
         *            Namespace URI
         * @param localName
         *            The local name, without prefix
         * @param qName
         *            The qualified name, without prefix
         * @param atts
         *            the attributes of the element
         */
        @Override
        public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
            // Using qualified name because we are not using xmlns prefixes here
            if (qName.equals("title")) {
                title = true;
            }
        }

        @Override
        public void endElement(String namespaceURI, String localName, String qName) throws SAXException {

            // End of processing current element
            if (title) {
                title = false;
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            // Processing character data inside an element
            if (title) {
                String bookTitle = new String(ch, start, length);
                System.out.println("Book Title : " + bookTitle);
                nameList.add(bookTitle);
            }

        }

    }

    public static void main(String[] args) throws SAXException, IOException {
        XMLReader parser = XMLReaderFactory.createXMLReader();
        BookHander bookHandler = (new SAXParser()).new BookHander();
        parser.setContentHandler(bookHandler);
        parser.parse("D:\\temp\\xml\\books.xml");
        System.out.println(bookHandler.getNameList());
    }
}
