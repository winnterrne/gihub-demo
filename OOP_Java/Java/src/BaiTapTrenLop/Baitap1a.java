package BaiTapTrenLop;

import java.util.Scanner;

public class Baitap1a {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double chieudai;
        double chieurong;
        double dientich;
        double chuvi;

        chieudai = sc.nextDouble();
        chieurong = sc.nextDouble();
        chuvi = (chieudai + chieurong) / 2;
        dientich = chieudai * chieurong;
        System.out.println(chuvi);
        System.out.println(dientich);
    }
}