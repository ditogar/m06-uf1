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

    public String recorrerDOM(Document doc) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringComments(true);
        factory.setIgnoringElementContentWhitespace(true);

        StringBuilder res = new StringBuilder();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            NodeList nodeList = doc.getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                res.append(recorrerNode(node));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return res.toString();
    }

    public static String recorrerNode(Node node) {
        StringBuilder res = new StringBuilder();
        res.append("\n").append(node.getNodeName()).append(" ").append(node.getNodeValue()).append("\n");

        if (node.hasAttributes()) {
            NamedNodeMap attrMap = node.getAttributes();
            for (int i = 0; i < attrMap.getLength(); i++) {
                Node attr = attrMap.item(i);
                res.append(attr.getNodeName()).append(attr.getNodeValue()).append("\n");
            }
        }
        if (node.hasChildNodes()) {
            NodeList childList = node.getChildNodes();
            for (int i = 0; i < childList.getLength(); i++) {
                Node child = childList.item(i);
                res.append(recorrerNode(child));
            }
        }
        return res.toString();
    }
}

