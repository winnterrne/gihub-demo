package BaiTapKeThuaTrenLop;
import java.util.Scanner;
import java.util.ArrayList;

public class MainBai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new CanBo();
        nv.nhap();

        nv.xuat();
    }
}
