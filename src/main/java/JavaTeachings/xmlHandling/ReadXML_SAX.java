package JavaTeachings.xmlHandling;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;

public class ReadXML_SAX extends DefaultHandler {
    public static void main(String[] args) throws Exception{
        ReadXML_SAX ob1 = new ReadXML_SAX();

        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\Students.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser p = factory.newSAXParser();
        p.parse(fis, ob1);
    }

    public void startDocument(){
        System.out.println("Started Reading the XML file");
    }

    public void startElement (String uri, String localName,String qName, Attributes attributes) {
        System.out.println("Node Name :"+qName);
    }

    public void characters (char ch[], int start, int length) throws SAXException{
        String s1 = new String(ch,start,length);
        System.out.println(s1);
    }

    public void endDocument(){
        System.out.println("Ending Document here...");
    }

}

