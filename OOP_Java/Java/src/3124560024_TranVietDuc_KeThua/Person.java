package BaiTapKeThuaTrenLop;

import java.util.Scanner;

public class Person {
    private int cmnd;
    private String hoten;
    private int ngaysinh;

    public Person() {

    }

    public Person(int cmnd, String hoten, int ngaysinh) {
        this.cmnd = cmnd;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
    }
    public int getCmnd() {
        return cmnd;
    }
    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
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
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cmnd: ");
        cmnd = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sc.nextInt();
    }
    public void output() {
        System.out.println("CMND: " + cmnd + " HO va TEN: " + hoten + " NGAY SINH: "  + ngaysinh);
    }
}
