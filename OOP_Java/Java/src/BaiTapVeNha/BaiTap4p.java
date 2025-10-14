package BaiTapVeNha;
import java.util.Scanner;
import java.util.ArrayList;
public class BaiTap4p {
    public static void AVG(ArrayList<Integer>mang) {
        int sum = 0;
        for(int i = 0; i < mang.size(); i++) {
            sum += mang.get(i);
        }
        double avg = sum / mang.size();
        System.out.println(avg + " ");
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            mang.add(sc.nextInt());
        }
        AVG(mang);
    }
}
