package BaiTapKeThuaTrenLop;
import java.time.Year;
import java.util.Scanner;

public class NhanVien {
    private String manv;
    private String hoten;
    private int namvaolam;
    private int hesoluong;
    private int songaynghi;
    public static double luongcoban = 1150;

    public NhanVien() {

    }
    public NhanVien(String manv, String hoten, int hesoluong) {
        this.manv = manv;
        this.hoten = hoten;
        this.namvaolam = Year.now().getValue();
        this.hesoluong = hesoluong;
        this.songaynghi = 0;
    }
    public NhanVien(String manv, String hoten, int namvaolam, int hesoluong, int songaynghi) {
        this.manv = manv;
        this.hoten = hoten;
        this.namvaolam = namvaolam;
        this.hesoluong = hesoluong;
        this.songaynghi = songaynghi;
    }
    public String getManv() {
        return manv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getNamvaolam() {
        return namvaolam;
    }
    public void setNamvaolam(int namvaolam) {
        this.namvaolam = namvaolam;
    }
    public int getHesoluong() {
        return hesoluong;
    }
    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }
    public int getSongaynghi() {
        return songaynghi;
    }
    public void setSongaynghi(int songaynghi) {
        this.songaynghi = songaynghi;
    }
    public void xuat() {
        System.out.println("MANV: " + manv + " HOTEN: " + hoten + " NAMVAOLAM: " + namvaolam + " HESOLUONG: " + hesoluong + " SONGAYNGHI: " + songaynghi);
    }
    public double phucapthamnien() {
        double sum = 0;
        if(namvaolam > 5) {
            sum = namvaolam * luongcoban / 100;
        }
        return sum;
    }
    public char tinh() {
        if(songaynghi <= 1) {
            return 'A';
        }else if(songaynghi <= 3) {
            return 'B';
        }else {
            return 'C';
        }
    }
    public double hesothidua() {
        char thidua = tinh();
        switch (thidua) {
            case 'A':
                return 1.0;
            case 'B':
                return 0.75;
            case 'C':
                return 0.5;
            default:
                return 0.0;
        }
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap manv: ");
        manv = sc.nextLine();
        System.out.println("Nhap ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap nam vao lam");
        namvaolam = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap he so luong: ");
        hesoluong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap so ngay nghi: ");
        songaynghi = sc.nextInt();
        sc.nextLine();
    }

}
