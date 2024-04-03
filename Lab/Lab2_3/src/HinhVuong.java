

public class HinhVuong extends HinhCN {
    //Fields
    private int Canh;
    //Constructor
    HinhVuong(){

    }
    HinhVuong(int Canh){
        this.Canh = Canh;
    }

    public void setCanh(int canh) {
        Canh = canh;
    }
    int ChuVi(){
        return Canh * 4;
    }

    @Override
    double DienTich() {
        return Canh * Canh;
    }

    @Override
    void Nhap() {
        System.out.print("Enter the side: ");
        Canh = sc.nextInt();
    }

    @Override
    void Xuat() {
        super.Xuat();
    }
}
