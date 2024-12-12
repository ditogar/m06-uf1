package uf1.p4;

import org.w3c.dom.Document;

import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
        UtilsDOM dom = new UtilsDOM();
        File file = new File("C:\\Users\\diego\\IdeaProjects\\m6-uf1\\src\\uf1\\p4\\LlibresXML.xml");
        Document doc = dom.obrirXMLAmbDOM(file);

        dom.recorrerNode(doc.getDocumentElement());
    }
}
