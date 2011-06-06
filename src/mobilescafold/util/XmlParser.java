/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobilescafold.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XmlParser {
    
    public DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
    public DocumentBuilder docBuilder;
    public Document doc; 
    public NodeList applications;  
    public Node applicatioNode; 
    public XmlParser()
    {
    }
    
    
    public String getCurrentPackageName(String path)
    {
        String result="";
        
        return result;
    }
    
    
    
    public String getParentPackageName(String path)
    {
       String result="";
            
         try {
            docBuilder = docBuilderFactory.newDocumentBuilder();
            doc = docBuilder.parse(new File(path)); // normalize text representation
            NodeList node = doc.getElementsByTagName("manifest");
            int i=0,sw=0;
            while (i<=node.item(0).getAttributes().getLength()-1)
            {
                if(node.item(0).getAttributes().item(i).getNodeName().equals("package")){
                 sw=1;
                 result=node.item(0).getAttributes().item(i).getNodeValue();
                }
                
                i++;
            }
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
        
        return result; 
    }
    
    
    public void addActivity(String path, String activity_name,String PackageName) {
        docBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            docBuilder = docBuilderFactory.newDocumentBuilder();
            doc = docBuilder.parse(new File(path)); // normalize text representation
            
            //create the root element
            Element root = doc.getDocumentElement();
            Element childElement = doc.createElement("activity");
            childElement.setAttribute("android:label", "@string/app_name");
            childElement.setAttribute("android:theme", "@android:style/Theme.NoTitleBar");
            childElement.setAttribute("android:configChanges", "keyboardHidden|orientation");
            childElement.setAttribute("android:name", PackageName+"."+activity_name);
            applicatioNode = doc.getElementsByTagName("application").item(0);
            applicatioNode.insertBefore(childElement, applicatioNode.getFirstChild());

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(path));
            transformer.transform(source, result);

            System.out.println("Xml changed correctly..");



        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
  }
}  