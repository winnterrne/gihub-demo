package BaiTapVeNha;

import java.util.Scanner;
import java.util.ArrayList;

public class BaiTap4o {
    public static void Max(ArrayList<Integer>mang) {
        int max = mang.get(0);
        for(int i = 0; i < mang.size(); i++) {
            if(max < mang.get(i)) {
                max = mang.get(i);
            }
        }
        System.out.println("max: " + max);
    }
    public static void Min(ArrayList<Integer>mang) {
        int min = mang.get(0);
        for(int i = 0; i < mang.size(); i++) {
            if(min > mang.get(i)) {
                min = mang.get(i);
            }
        }
        System.out.println("min: " + min);
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            mang.add(sc.nextInt());
        }
        Max(mang);
        Min(mang);
    }
}