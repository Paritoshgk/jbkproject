package Dom_SAX;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Domtestread {
public static void main(String[] args) {
	try {
	File fXmlFile=new File("Student.xml");
	DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder dbBuilder=dbFactory.newDocumentBuilder();
	Document doc=dbBuilder.parse(fXmlFile);
	
	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	NodeList nList=doc.getElementsByTagName("Students");
	System.out.println("------------"+nList.getLength());
	
	for(int temp=0;temp<nList.getLength();temp++) {
		Node nNode=nList.item(temp);
		System.out.println("\nCurrent Element:"+nNode.getNodeName());
		
		if(nNode.getNodeType()==Node.ELEMENT_NODE) {
			Element eElement=(Element) nNode;
			
		//System.out.println("Staff id: "+eElement.getAttribute("id"));
		System.out.println("First Name: "+eElement.getElementsByTagName("name").item(0).getTextContent());
		System.out.println("Email: "+eElement.getElementsByTagName("Emailid").item(0).getTextContent());
		System.out.println("Mobile number: "+eElement.getElementsByTagName("mobilenumber").item(0).getTextContent());
		System.out.println("Address : "+eElement.getElementsByTagName("Address").item(0).getTextContent());
		
		
			
		}
		
	}
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
