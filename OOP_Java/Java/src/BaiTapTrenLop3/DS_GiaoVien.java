package BaiTapTrenLop3;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DS_GiaoVien {
    ArrayList<GiaoVien> dsGiaoVien = new ArrayList<>();

    public void docTuFile()
            throws ParserConfigurationException, SAXException, IOException {
        File file = new File("C:\\Users\\Tran Duc\\Documents\\HOC KI 1 NAM 2\\OOP_Java\\Java\\src\\BaiTapTrenLop3\\giaovien.xml");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("giaoVien");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) node;
                String ten = e.getElementsByTagName("tenNguyenDay").item(0).getTextContent();
                int soNhom = Integer.parseInt(e.getElementsByTagName("soNhom").item(0).getTextContent());

                dsGiaoVien.add(new GiaoVien(ten, soNhom));
            }
        }
    }

    public int tongnhom() {
        int sum = 0;
        for(GiaoVien gv : dsGiaoVien) {
            sum += gv.getSoluong();
        }
        return sum;
    }
    public void sortname() {
        for(GiaoVien gv : dsGiaoVien) {
            Collections.sort(dsGiaoVien, GiaoVien.ds);
        }
    }
    public int sortnhom() {
        for(GiaoVien gv : dsGiaoVien) {
            Collections.sort(dsGiaoVien, GiaoVien.ds1);
        }
        return sortnhom();
    }
    public void sortsoluonglonhon1() {
        int count = 0;
        for(GiaoVien gv : dsGiaoVien) {
            for (GiaoVien gv2 : dsGiaoVien) {
                if(gv.getSoluong() == gv2.getSoluong()) {
                    count ++;
                }
            }
            if (count > 1) {
                System.out.println(gv + " ");
            }
        }
    }


}
