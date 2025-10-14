package BaiTapTrenLop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Baitap2b {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            Random rd = new Random();
            Integer x = new Integer(rd.nextInt(100));
            mang.add(x);
            if(x > 15) System.out.println(mang.get(i) + " ");
        }
    }
}