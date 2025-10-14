package BaiTapKeThuaTrenLop;

public class Employee extends Person{
    private String manv;
    private int hesoluong;

    public Employee() {
        super();
    }

    public Employee(int cmnd, String hoten, int ngaysinh, String manv, int hesoluong) {
        super(cmnd, hoten, ngaysinh);
        this.manv = manv;
        this.hesoluong = hesoluong;
    }
    public String getManv() {
        return manv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public int getHesoluong() {
        return hesoluong;
    }
    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }
    public double getLuong() {
        return hesoluong * 2000000;
    }

    public void output() {
        super.output();
        System.out.println("MA NV: " + manv + " HE SO LUONG: " + hesoluong + " Luong: " + getLuong());
    }
}
