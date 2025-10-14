package BaiTapTrenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class Baitap2f {
    public static boolean kthangchuc(int n) {
        int hangchuc = (n / 10) % 10;
        if (hangchuc == 1) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> mang = new ArrayList<Integer>();
        for(int i = 0; i <= n; i++) {
            mang.add(sc.nextInt());
        }
        for(int x : mang) {
            if(kthangchuc(x)) {
                System.out.println(x + " ");
            }
        }
    }
}