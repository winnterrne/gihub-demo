package BaiTapKeThuaTrenLop;
import java.util.Scanner;

public class NhanVienBai4 {
    private String manv;
    private String tennv;
    private double hesoluong;
    private static double luongcoban = 1150;

    public NhanVienBai4() {
        manv = "NV001";
        tennv = "Tran Viet Duc";
        hesoluong = 2.34;
    }
    public NhanVienBai4(String manv, String tennv, double hesoluong) {
        if(ktmanv(manv)) {
            this.manv = manv;
        }else {
            this.manv = "NV001";
        }
        this.tennv = tennv;
        this.hesoluong = hesoluong;

    }
    public String getManv() {
        return manv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public String getTennv() {
        return tennv;
    }
    public void setTenn(String tennv) {
        this.tennv = tennv;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }
    public double thunhap() {
        return hesoluong * luongcoban;
    }

    public boolean ktmanv(String ma) {
        if(!ma.startsWith("NV")) {
            return false;
        }
        for(int i = 2; i < ma.length(); i++) {
            char c = ma.charAt(i);
            if( c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    public void xuat() {
        System.out.println("Manv: " + manv + "Ten nv: " + tennv + "Heso: " + hesoluong + "Thunhap: " + thunhap());
    }

}
