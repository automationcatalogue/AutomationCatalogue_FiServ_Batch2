package JavaTeachings.xmlHandling;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;

public class CreateXMLDemo {
    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element rootElement  = doc.createElement("Employees");
        Element nodeElement  = doc.createElement("employee");
        Element empNameElement = doc.createElement("name");
        Element empOrgElement = doc.createElement("OrgName");
        Element empCityElement = doc.createElement("empCity");
        Element empSalaryElement = doc.createElement("empSalary");

        Text t1 = doc.createTextNode("Sagar");
        Text t2 = doc.createTextNode("FiServ");
        Text t3 = doc.createTextNode("Chennai");
        Text t4 = doc.createTextNode("999000");

        empNameElement.appendChild(t1);
        empOrgElement.appendChild(t2);
        empCityElement.appendChild(t3);
        empSalaryElement.appendChild(t4);

        nodeElement.appendChild(empNameElement);
        nodeElement.appendChild(empOrgElement);
        nodeElement.appendChild(empCityElement);
        nodeElement.appendChild(empSalaryElement);

        rootElement.appendChild(nodeElement);
        doc.appendChild(rootElement);
        Source source = new DOMSource(doc);

        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer t = tFactory.newTransformer();
        FileOutputStream fos = new FileOutputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FiServ_Batch2\\Files\\emp.xml");
        Result result = new StreamResult(fos);

        t.transform(source, result);
        System.out.println("XML file is generated");

    }
}
