package BaiTapKeThuaTrenLop;

import java.util.Scanner;
public class NuocGiaiKhat extends HangHoa {
    private String donvitinh;
    private int soluong;
    private double dongia;
    private static double tilechietkhau;

    public NuocGiaiKhat(String mahang, String tenhang, String donvitinh, int soluong, double dongia) {
        super(mahang,tenhang);
        if (donvitinh.compareToIgnoreCase("ket") !=0 && donvitinh.compareToIgnoreCase("thung") !=0 && donvitinh.compareToIgnoreCase("chai") !=0 && donvitinh.compareToIgnoreCase("lon") !=0) {
            this.donvitinh = "ket";
        } else {
            this.donvitinh = donvitinh;
        }
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public double thanhtien() {
        if(donvitinh.compareToIgnoreCase("ket") !=0 && donvitinh.compareToIgnoreCase("thung") !=0 ) {
            if(donvitinh.compareToIgnoreCase("chai") == 0) {
                return soluong * dongia / 20;
            }else {
                return soluong * dongia / 24;
            }
        }else {
            return soluong * dongia;
        }
    }
    public double tongtien() {
        return thanhtien() * tilechietkhau;
    }
    public void xuat() {
        super.xuat();
        System.out.println("Don vi tinh: " + donvitinh + "So luong: " + soluong + "Don gia: " + dongia + "Thanh tien: " + thanhtien() + "Tong tien: " + tongtien());
    }
}
