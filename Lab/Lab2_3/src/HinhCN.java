
public class HinhCN extends HinhThoi {
    //Fields
    private int ChieuDai;
    private int ChieuRong;
    //Constructors
    HinhCN(){

    }
    HinhCN(int ChieuDai,int ChieuRong){
        this.ChieuRong = ChieuRong;
        this.ChieuDai = ChieuDai;
    }

    public void setChieuDai(int chieuDai) {
        ChieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        ChieuRong = chieuRong;
    }
    // Methods


    @Override
    void Nhap() {
        System.out.print("Enter the length: ");
        ChieuDai = sc.nextInt();
        System.out.print("Enter the width: ");
        ChieuRong = sc.nextInt();
    }
    @Override
    int ChuVi() {
        return (ChieuDai + ChieuRong) * 2;
    }

    @Override
    double DienTich() {
        return ChieuDai * ChieuRong;
    }

    @Override
    void Xuat() {
        super.Xuat();
    }
}
