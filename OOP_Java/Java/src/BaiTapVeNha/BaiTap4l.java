package BaiTapVeNha;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class BaiTap4l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            mang.add(sc.nextInt());
        }
        mang.sort(null);
        Collections.sort(mang, Collections.reverseOrder());
        System.out.println(mang + " ");
    }
}