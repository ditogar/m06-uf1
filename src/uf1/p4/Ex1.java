package uf1.p4;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.print.Doc;
import java.io.File;
import java.nio.file.Path;

public class Ex1 {
    public static void main(String[] args) {
        UtilsDOM dom = new UtilsDOM();
        File file = new File("/home/46948549y/IdeaProjects/m06-uf1-p1/src/uf1/p4/LlibresXML.xml");
        Document doc = dom.obrirXMLAmbDOM(file);

        System.out.println(dom.recorrerDOM(doc));
    }
}
