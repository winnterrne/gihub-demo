package BaiTapKeThuaTrenLop;

public class SinhVien extends Nguoi{
    private String mssv;
    private String hedaotao;
    private int tongsotinchi;

    public SinhVien(String hoten, int ngaysinh, String gioitinh, String mssv, String hedaotao, int tongsotinchi){
        super(hoten,ngaysinh,gioitinh);
        this.mssv = mssv;
        if(hedaotao.equalsIgnoreCase("caodang")) {
            this.hedaotao = hedaotao;
            this.tongsotinchi = 100;
        }else if(hedaotao.equalsIgnoreCase("caodangnghe")) {
            this.hedaotao = hedaotao;
            this.tongsotinchi = 130;
        }else {
            this.hedaotao = hedaotao;
            this.tongsotinchi = 150;
        }
    }
    public String getMssv() {
        return mssv;
    }
    public void setMssv(String mssv) {
        this.mssv= mssv;
    }
    public String getHedaotao() {
        return hedaotao;
    }
    public void setHedaotao(String hedaotao) {
        this.hedaotao = hedaotao;
    }
    public double tonghocphi() {
       double hocphi = 0;
        switch (hedaotao) {
            case "daihoc" :
                hocphi = 200000;
            case "caodang" :
                hocphi = 150000;
            case "caodangnghe" :
                hocphi = 130000;
        }
        return hocphi * tongsotinchi;
    }

    public void xuat() {
        super.xuat();
        System.out.println("Mssv: " + mssv + "He dao tao: " + hedaotao + "tong so tin chi: " + tongsotinchi + "hoc phi: " + tonghocphi());
    }

}
