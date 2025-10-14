package BaiTapVeNha;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class BaiTap4k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            mang.add(sc.nextInt());
        }
        int num = 3;
        for(int i = 0; i < mang.size(); i += num) {
            int end = Math.min(i + num, n);
            List<Integer> mangcat = mang.subList(i,n);
            System.out.println(mangcat);
        }
    }
}
