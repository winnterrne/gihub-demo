package BaiTapKeThuaTrenLop;


public class CBLanhDao extends NhanVienBai4{
    private String chucvu;
    private int thamnienquanli;

    public CBLanhDao() {
        super.setManv("NV009");
        super.setTenn("Dieu Hien");
        super.setHesoluong(4.67);
        chucvu = "giamdoc";
        thamnienquanli = 10;
    }
    public double hesolanhdao() {
        switch (chucvu) {
            case "giamdoc":
                return 7.0;
            case "truongphong":
                return 6.0;
            case "phophong":
                return 4.5;
            default:
                return 1.0;
        }
    }
    public double phucaplanhdao() {
        return 1500 * hesolanhdao();
    }

    @Override
    public double thunhap() {
        return super.thunhap() * phucaplanhdao();
    }
    public void xuat() {
        super.xuat();
        System.out.println("Thu nhap : " + thunhap() + "Chuc vu: " + chucvu);
    }
}
