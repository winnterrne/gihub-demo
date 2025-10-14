package BaiTapTrenLop3;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XuatDS_ThiSInh {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DS_ThiSinh dsThiSinh = new DS_ThiSinh();
        dsThiSinh.nhap();
        dsThiSinh.display();
        dsThiSinh.diemthap();
        dsThiSinh.sapxep();
        dsThiSinh.xuatdsdau();
        dsThiSinh.xuatsvlon();

    }
}
