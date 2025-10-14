package BaiTapKeThuaTrenLop;

public class Nguoi {
    private String hoten;
    private int ngaysinh;
    private String gioitinh;

    public Nguoi() {
        gioitinh = "nam";
    }
    public Nguoi(String hoten, int ngaysinh, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        if(ktgioitinh(gioitinh)) {
            this.gioitinh = "nu";
        }else {
            this.gioitinh = "nam";
        }

    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public boolean ktgioitinh(String gt) {
        if(gt.compareToIgnoreCase("nam") == 0) {
            return false;
        }
        return true;
    }
    public void xuat() {
        System.out.println("Ho ten: " + hoten + "Ngay sinh: " + ngaysinh + "Gioi tinh: " + gioitinh);
    }
}
