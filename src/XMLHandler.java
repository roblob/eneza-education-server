import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLHandler {
	public static void main(String args[]){
		System.out.println("DICKS");
	}
	
	public static void addStudent(Document doc, String user_id, 
												String username,
												String password,
												String name, 
												String usertype,
												String email,
												String school,
												String gender,
												String level) {
		
		//add student to document
		Element root = doc.getDocumentElement();
		
		Attr userIDAttr = doc.createAttribute("user_id");
		userIDAttr.setValue(user_id);
		
		
		
	}
	
}
