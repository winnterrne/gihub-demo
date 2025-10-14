package BaiTapTrenLop3;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class DS_ThiSinh {
    ArrayList<ThiSinh> dsThiSinh = new ArrayList<>();

    public void docFileXML(String path)
            throws ParserConfigurationException, SAXException, IOException {

        File fXmlFile = new File(path);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("ThiSinh");

        for (int i = 0; i < nList.getLength(); i++) {
            Node nNode = nList.item(i);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                String sbd = eElement.getElementsByTagName("SBD").item(0).getTextContent();
                String ten = eElement.getElementsByTagName("HT").item(0).getTextContent();
                int namsinh = Integer.parseInt(eElement.getElementsByTagName("NamSinh").item(0).getTextContent());
                double toan = Double.parseDouble(eElement.getElementsByTagName("Toan").item(0).getTextContent());
                double van = Double.parseDouble(eElement.getElementsByTagName("Van").item(0).getTextContent());
                double ngoaingu = Double.parseDouble(eElement.getElementsByTagName("NN").item(0).getTextContent());

                dsThiSinh.add(new ThiSinh(sbd, ten, namsinh, toan, van, ngoaingu));
            }
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        String sbd, ten;
        int namsinh;
        double toan, van, ngoaingu;
        System.out.println("Nhap sbd: ");
        sbd = sc.nextLine();
        System.out.println("Nhap ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap nam sinh:");
        namsinh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap diem toan: ");
        toan = sc.nextDouble();
        System.out.println("Nhap diem van: ");
        van = sc.nextDouble();
        System.out.println("Nhap diem tieng anh: ");
        ngoaingu = sc.nextDouble();
    }

    public void display() {
        for(ThiSinh ts : dsThiSinh)  {
            System.out.println("SBD: " + ts.getSbd());
            System.out.println("TEN: " + ts.getTen());
            System.out.println("NAMSINH: " + ts.getNamsinh());
            System.out.println("DIEM TOAN: " + ts.getToan());
            System.out.println("DIEM VAN: " + ts.getVan());
            System.out.println("DIEM TIENG ANH: " + ts.getNgoaingu());
        }
    }
    public void diemthap() {
        for(ThiSinh ts : dsThiSinh) {
            Collections.sort(dsThiSinh, ThiSinh.ds);
        }
    }

    public void sapxep() {
        for(int i = 0; i < dsThiSinh.size(); i++) {
            for(int j = i +1; j < dsThiSinh.size(); j++) {
               ThiSinh ts1 = dsThiSinh.get(i);
                ThiSinh ts2 = dsThiSinh.get(j);
                if(!ts1.getTen().equals(ts2.getTen())) {
                    dsThiSinh.set(i,ts2);
                    dsThiSinh.set(j,ts1);
                } else {
                    if(ts1.getToan() > ts2.getToan()) {
                        dsThiSinh.set(i,ts2);
                        dsThiSinh.set(j,ts1);
                    }
                }
            }
        }
        for (ThiSinh ts : dsThiSinh) {
            System.out.println(ts);
        }
    }
    public void xuatdsdau() {
        for (ThiSinh ts : dsThiSinh) {
            if(ts.ketqua().equals("dau")) {
                System.out.println(ts);
            }
        }
    }

    public void xuatsvlon() {
        for (ThiSinh ts: dsThiSinh) {
            if(ts.getNamsinh() > 1995 || ts.getToan() > 9) {
                System.out.println(ts);
            }
        }
    }
}
