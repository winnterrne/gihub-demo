package BaiTapVeNha;

import java.util.Scanner;
import java.util.ArrayList;

public class Baitap3g {
    // cau g
    public static int bt3(int n) {
        if(n == 1) return 1;
        return (bt3(n-1) + n);
    }
    public static float bt3b(int n) {
        if(n == 1) return 1.0f;
        return bt3b(n-1) + 1.0f / n;
    }

    public static void main(String[] args) {
        System.out.println(bt3(5));
        System.out.println(bt3b(5));
        // cau h
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == 0) {
            System.out.println("he so a khac k ");
        } else {
            float delta = b * b - 4 * a * c;
            if(delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem la: " + (-b+Math.sqrt(delta) / (2 * a)) + " va " + (-b - Math.sqrt(delta) / (2 * a)));
            } else if( delta == 0) {
                System.out.println("Phuong trinh co 1 nghiem kep" + (-b/(2*a)));
            } else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
    }
}