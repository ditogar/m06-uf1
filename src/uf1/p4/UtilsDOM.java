package uf1.p4;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class UtilsDOM {
    public Document obrirXMLAmbDOM(File fitxer) {
        Document doc = null; //Representació de l'arbre DOM

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            //Indica que el model DOM no ha de processar comentaris dins l'XML
            factory.setIgnoringComments(true);

            //Indica que ha d'ignorar els espais en blanc que tingui el document
            factory.setIgnoringElementContentWhitespace(true);

            //Es crea un objecte DocumentBuilder per a carregar en ell
            // l'estructura d'arbre a partir de l'XML
            DocumentBuilder builder = factory.newDocumentBuilder();

            //Parsejar el documento XML i generar el seu DOM
            doc = builder.parse(fitxer);
            //Ara doc apunta a l'arbdre DOM preparat per a ser recorregut

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }

    public String recorrerDOM(Document doc){
        String result = "";

        //Obtenir el primer node del DOM
        Node source = doc.getFirstChild();
        result += "***" + source.getNodeName() + "***" + "\n";

        //Obtenir llista dels nodes fills de l'arrel
        NodeList nodelist = source.getChildNodes();

        result += recorrerNode(source);

        return result;
    }

    public String recorrerNode(Node node) {
        String result = "";
        
        NodeList nodeList = node.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node child = nodeList.item(i);

            if (child.getNodeType() == Node.ELEMENT_NODE) {
                result += child.getNodeName() + "\n";
                NamedNodeMap attributes = node.getAttributes();

                for (int j = 0; j < attributes.getLength(); j++) {
                    Node attribute = attributes.item(j);
                    result += attribute.getNodeValue() + "\n";
                }
                result += recorrerNode(child);

            } else if (child.getNodeType() == Node.TEXT_NODE) {
                result += child.getNodeValue() + "\n";
            }
        }
        return result;
    }
}
