package BaiTapTrenLop3;

import java.util.Comparator;
public class ThiSinh {
    private String sbd;
    private String ten;
    private int namsinh;
    private double toan;
    private double van;
    private double ngoaingu;

    public ThiSinh() {
    }

    public ThiSinh(String sbd, String ten, int namsinh, double toan, double van, double ngoaingu) {
        this.sbd = sbd;
        this.ten = ten;
        this.namsinh = namsinh;
        this.toan = toan;
        this.van = van;
        this.ngoaingu = ngoaingu;
    }

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getNgoaingu() {
        return ngoaingu;
    }

    public void setNgoaingu(double ngoaingu) {
        this.ngoaingu = ngoaingu;
    }

    public double tongdiem() {
        return toan + van + (ngoaingu * 2);
    }

    public String ketqua() {
        return tongdiem() >= 25 ? "dau" : "rot";
    }
    public void display() {
        System.out.printf("%s: %s: %02d: %lf: %lf: %lf:",sbd,ten,namsinh,toan,van,ngoaingu);
        System.out.println("tong: " + tongdiem()  + "ketqua: " + ketqua()) ;
    }

    public static Comparator<ThiSinh> ds = new Comparator<ThiSinh>() {
        @Override
        public int compare(ThiSinh ts1, ThiSinh ts2) {
            return Double.compare(ts2.tongdiem(),ts1.tongdiem());
        }
    };


}
