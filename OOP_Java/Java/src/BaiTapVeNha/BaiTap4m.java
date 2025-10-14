package BaiTapVeNha;

import java.util.Scanner;
import java.util.ArrayList;

public class BaiTap4m {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            mang.add(sc.nextInt());
        }
        for(int i = 0; i < mang.size() - 1 ; i++) {
            int a = mang.get(i);
            int b = mang.get(i + 1);
            if((a % 2 == 0 && b % 2 == 0)) {
                int sum = a + b;
                mang.add(i + 1, sum);
                i++;
            }
        }
        System.out.println(mang + " ");
    }
}