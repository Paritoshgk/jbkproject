package Dom_SAX;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

 
public class DOMtest {
public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, TransformerException{
	DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
	DocumentBuilder b=f.newDocumentBuilder();
	Document doc=b.newDocument();
	
	Element rootele=doc.createElement("Students");
	Element studentele=doc.createElement("student");
	Element nameele=doc.createElement("name");
	Element emailele=doc.createElement("Emailid");
	Element mobilele=doc.createElement("mobilenumber");
	Element addrele=doc.createElement("Address");
	
	Text t1=doc.createTextNode("Sachin");
	Text t2=doc.createTextNode("bhavarsachin@gmail.com");
	Text t3=doc.createTextNode("9764777223");
	Text t4=doc.createTextNode("Nashik");
	
	nameele.appendChild(t1);
	emailele.appendChild(t2);
	mobilele.appendChild(t3);
	addrele.appendChild(t4);
	
	studentele.appendChild(nameele);
	studentele.appendChild(emailele);
	studentele.appendChild(mobilele);
	studentele.appendChild(addrele);
	
	rootele.appendChild(studentele);
	doc.appendChild(rootele);
	Transformer t= TransformerFactory.newInstance().newTransformer();
	t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("C:\\Program Files\\jbkpari\\task3\\Student.xml")));
	System.out.println("Xml file is generated....");
	
}
}
