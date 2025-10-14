package BaiTapVeNha;

import java.util.Scanner;
import java.util.ArrayList;

public class BaiTap4n {
    public static void ktchanle(ArrayList<Integer> mang) {
        int countmax = 0;
        int countmin = 0;
        for(int i = 0; i < mang.size(); i++) {
            if(mang.get(i) % 2 == 0) {
                countmax++;
            }else{
                countmin++;
            }
        }
        System.out.println("Co: " + countmax + " so chan");
        System.out.println("Co:" + countmin + " so le");
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            mang.add(sc.nextInt());
        }
        ktchanle(mang);
    }
}