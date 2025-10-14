package BaiTapKeThuaTrenLop;
import java.util.Scanner;

public class HangHoa {
    private String mahang;
    private String tenhang;

    public HangHoa() {

    }
    public HangHoa(String mahang, String tenhang) {
        if(ktmahang(mahang)) {
            this.mahang = mahang;
        }
        this.tenhang = tenhang;
    }
    public String getMahang() {
        return mahang;
    }
    public void setMahang(String mahang) {
        this.mahang = mahang;

    }
    public String getTenhang() {
        return tenhang;
    }
    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }
    public boolean ktmahang(String ma) {
        if(ma.length() < 5) {
            return false;
        }
        if(!ma.startsWith("HH")) {
            return false;
        }
        for(int i = 2; i < 5; i++) {
            char c = ma.charAt(i);
            if(c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public void xuat() {
        System.out.println("Ma Hang: " + mahang + "Ten Hang: " + tenhang);
    }
}
