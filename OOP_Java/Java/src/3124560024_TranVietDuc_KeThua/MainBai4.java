package BaiTapKeThuaTrenLop;
import java.util.Scanner;
import java.util.ArrayList;

public class MainBai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVienBai4> ds = new ArrayList<>();
        int n = 0;
        while (true) {
            System.out.println("====MENU====");
            System.out.println("1. Nhap danh sach nhan vien: ");
            System.out.println("2. Xuat danh sach nhan vien: ");
            System.out.println("3. Thoat");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sach nhan vien");
                    System.out.println("Nhap MaNhanVien: ");
                    String manv = sc.nextLine();
                    System.out.println("Nhap HoTen: ");
                    String tennv = sc.nextLine();
                    System.out.println("Nhap HeSoLuong: ");
                    double hesoluong = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Nhap ChucVu");
                    String chucvu = sc.nextLine();
                    System.out.println("Nhap ThamNienQuanLi");
                    int thamninequanli = sc.nextInt();
                    sc.nextLine();

                    NhanVienBai4 nv4 = new NhanVienBai4();
                    ds.add(nv4);
                    System.out.println("Da them 1 NV");
                    break;
                case 2:
                    if(ds.isEmpty()) {
                        System.out.println("Danh sach chua co nhan vien: ");
                    }else {
                        System.out.println("DANH SACH NHAN VIEN: ");
                        for(NhanVienBai4 nv : ds) {
                            nv.xuat();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh ...");
                    return;
                default:
                    System.out.printf("Lua chon k hop le: ");
            }
        }
    }
}