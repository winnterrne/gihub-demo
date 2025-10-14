package BaiTapTrenLop3;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XuatDS_GV {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DS_GiaoVien dsGiaoVien = new DS_GiaoVien();
        dsGiaoVien.docTuFile();

        dsGiaoVien.tongnhom();
        dsGiaoVien.sortname();
        dsGiaoVien.sortnhom();
        dsGiaoVien.sortsoluonglonhon1();

    }
}
