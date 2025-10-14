package BaiTapTrenLop3;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Excute {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DSBook dsBook = new DSBook();
        dsBook.ReadXML();

        System.out.println("\nDanh sách ban đầu:");
        dsBook.xuatDS();

        System.out.println("\nDanh sách sau khi sắp xếp theo giá:");
        dsBook.sapxepDS();
    }
}
