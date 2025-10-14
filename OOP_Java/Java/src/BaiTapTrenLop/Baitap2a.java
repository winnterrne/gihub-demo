package BaiTapTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Baitap2a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> mang = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            mang.add(x);
            System.out.println(x + " ");
        }
    }
}