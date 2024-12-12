package uf1.p4;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class UtilsDOM {
    public Document obrirXMLAmbDOM(File fitxer) {
        Document doc = null; // Representació de l'arbre DOM

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Indica que el model DOM no ha de processar comentaris dins l'XML
            factory.setIgnoringComments(true);

            // Indica que ha d'ignorar els espais en blanc que tingui el document
            factory.setIgnoringElementContentWhitespace(true);

            // Es crea un objecte DocumentBuilder per a carregar en ell
            // l'estructura d'arbre a partir de l'XML
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsejar el documento XML i generar el seu DOM
            doc = builder.parse(fitxer);
            // Ara doc apunta a l'arbdre DOM preparat per a ser recorregut
            doc.getDocumentElement().normalize(); // Normalizar el documento
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }

    public void recorrerNode(Node node) {

        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println(node.getNodeName() + " ");
            if (node.hasAttributes()) {
                NamedNodeMap attributes = node.getAttributes();
                for (int i = 0; i < attributes.getLength(); i++) {
                    Node a = attributes.item(i);
                    if (a.getNodeName().equals("publicat_el")) {
                        System.out.println("Edat " +
                                (Integer.parseInt(Year.now().toString()) - Integer.parseInt(a.getNodeValue())));
                    }
                }
            }
            NodeList childs = node.getChildNodes();
            for (int i = 0; i < childs.getLength(); i++) {
                recorrerNode(childs.item(i));
            }
        }

        if (node.getNodeType() == Node.TEXT_NODE) {
            String content = node.getNodeValue().trim();
            if (!content.isEmpty()) {
                System.out.println(content);
            }
        }
    }
    public ArrayList<String> getTotsElsTitols(Document doc) {
        Node node = doc.getDocumentElement();

    }
}
