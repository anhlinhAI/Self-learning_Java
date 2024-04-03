
class HinhThoi extends HinhThang {
    //Fields
    private int Cheo1;
    private int Cheo2;
    //Constructors
    HinhThoi(){

    }
    HinhThoi(int Cheo1,int Cheo2){
        this.Cheo1 =Cheo1;
        this.Cheo2 =Cheo2;
    }
    //setters and getters

    public void setCheo1(int cheo1) {
        Cheo1 = cheo1;
    }

    public void setCheo2(int cheo2) {
        Cheo2 = cheo2;
    }
    //Methods

    @Override
    void Nhap() {
        System.out.print("Enter the diagonal 1: ");
        Cheo1 = sc.nextInt();
        System.out.print("Enter the diagonal 2: ");
        Cheo2 = sc.nextInt();
    }

    @Override
    int ChuVi() {
        TuGiac KQ = new TuGiac();
        KQ.Nhap();
        return KQ.ChuVi();
    }
    double DienTich(){
        return 0.5 * this.Cheo1 * this.Cheo2;
    }
    void Xuat(){
        System.out.println("Perimeter: " + this.ChuVi());
        System.out.println("Area: " + this.DienTich());
    }
}
