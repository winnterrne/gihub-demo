package BaiTapKeThuaTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> ds = new ArrayList<>();
        int n = 0;
        while (true) {
            System.out.println("====MENU====");
            System.out.println("1. Nhap dach sach nhan vien: ");
            System.out.println("2. Xuat danh sach nhan vien: ");
            System.out.println("3. Thoat: ");
            System.out.println("Moi nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("da them 1 nhan vien: ");
                        System.out.println("Nhap CMCD:");
                        int cmnd = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap hoten: ");
                        String hoten = sc.nextLine();
                        System.out.println("Nhap ngay sinh: ");
                        int ngaysinh = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhap ma nv: ");
                        String manv = sc.nextLine();
                        System.out.println("Nhap he so luong: ");
                        int hesoluong = sc.nextInt();
                        sc.nextLine();

                        Employee e = new Employee(cmnd, hoten, ngaysinh, manv, hesoluong);
                        ds.add(e);
                        System.out.println("DA THEM VAO DANH SACH");


                    break;
                case 2:
                    if (ds.isEmpty()) {
                        System.out.println("Chua co danh sach nhan vien nao: ");
                    }else {
                        System.out.println(" DANH SACH NHAN VIEN: ");
                        for(Employee employee : ds) {
                            employee.output();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thoat chuong trinh .....");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon k hop le");
            }
        }
    }
}
