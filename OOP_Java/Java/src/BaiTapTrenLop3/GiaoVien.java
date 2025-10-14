package BaiTapTrenLop3;

import java.util.Comparator;

public class GiaoVien {
    private String name;
    private int soluong;

    public GiaoVien() {

    }
    public GiaoVien(String name, int soluong) {
        this.name = name;
        this.soluong = soluong;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSoluong() {
        return soluong;
    }
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    public String toString() {
        return "Name: " + name + "Soluong: " + soluong;
    }
    public static Comparator<GiaoVien> ds = new Comparator<GiaoVien>() {
        @Override
        public int compare(GiaoVien gv1, GiaoVien gv2) {
            return gv1.getName().compareToIgnoreCase(gv2.getName());
        }
    };

    public static Comparator<GiaoVien> ds1 = new Comparator<GiaoVien>() {
        @Override
        public int compare(GiaoVien gv1, GiaoVien gv2) {
            return Integer.compare(gv2.getSoluong(), gv1.getSoluong());
        }
    };
}
