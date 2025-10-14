package BaiTapKeThuaTrenLop;

import java.time.Year;
import java.util.Scanner;

public class CanBo extends NhanVien{
    private String chucvu;
    private String phongban;
    private double hesophucaplanhdao;

    public CanBo() {
        super();
        chucvu = "truongphong";
        phongban = "hanhchinh";
        hesophucaplanhdao = 5.0;
    }
    public CanBo(String manv, String hoten, int hesoluong, String chucvu, double hesophucaplanhdao) {
        super(manv,hoten,hesoluong);
        this.chucvu = chucvu;
        this.hesophucaplanhdao = hesophucaplanhdao;
        super.setNamvaolam(Year.now().getValue());
        super.setSongaynghi(1);
    }
    public CanBo(String manv, String hoten, int namvaolam, int hesoluong, int songaynghi, String chucvu, String phongban, double hesophucaplanhdao) {
        super(manv, hoten, namvaolam, hesoluong, songaynghi);
        this.chucvu = chucvu;
        this.phongban = phongban;
        this.hesophucaplanhdao = hesophucaplanhdao;
    }
    @Override
    public char tinh() {
        return 'A';
    }
    public double phucaplanhdao() {
        return hesophucaplanhdao * luongcoban;
    }

    public void xuat() {
        System.out.println("MANV: " + getManv() + " HOTEN: " + getHoten() + " NAMVAOLAM " + getNamvaolam() +
                " HESOLUONG: " + getHesoluong() + " CHUCVU: " + chucvu + " PHONGBAN: " + phongban +
                "HESOPHUCCAPLANHDAO: " + hesophucaplanhdao);
    }

}
