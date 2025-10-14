package BaiTapTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Baitap2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> mang = new ArrayList<Integer>();
        for(int i = 1; i < n; i++) {
            int x = sc.nextInt();
            mang.add(x);
            if(x % i != 5) {
                System.out.println(i + " ");
            }
        }
    }
}