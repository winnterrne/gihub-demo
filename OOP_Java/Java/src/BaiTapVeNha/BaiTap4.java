    package BaiTapVeNha;

    import java.util.Scanner;
    import java.util.ArrayList;

    public class BaiTap4 {
        public static int Tongchan(int n) {
            int sum = 0;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
        public static boolean kttong(int n) {
            return Tongchan(n) % 2 == 0;
        }
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> mang = new ArrayList<>();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                mang.add(sc.nextInt());
            }
            int tong = 0;
            for(int x : mang) {
                if(kttong(x)) {
                    System.out.println(Tongchan(x) + " ");
                }
            }
        }
    }