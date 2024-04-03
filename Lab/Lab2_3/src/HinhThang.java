

public class HinhThang extends TuGiac {
    private int DayLon;
    private int DayBe;
    private int Canh1;
    private int Canh2;
    //constructor
    HinhThang(){
    }
    HinhThang(int DayLon,int DayBe,int Canh1,int Canh2){
        super(DayLon,DayBe,Canh1,Canh2);
        this.DayLon = DayLon;
        this.DayBe = DayBe;
        this.Canh1 =Canh1;
        this.Canh2 = Canh2;
    }
    //setter getter

    public void setDayLon(int dayLon) {
        this.DayLon = dayLon;
    }

    public void setDayBe(int dayBe) {
        this.DayBe = dayBe;
    }

    @Override
    public void setCanh1(int canh1) {
        this.Canh1 = canh1;
    }

    @Override
    public void setCanh2(int canh2) {
        this.Canh2 = canh2;
    }
    //methods

    @Override
    void Nhap() {
        System.out.print("Enter the big bottom: ");
        DayLon = sc.nextInt();
        System.out.print("Enter the small bottom: ");
        DayBe = sc.nextInt();
        System.out.print("Enter two sides: ");
        Canh1 = sc.nextInt();
        Canh2 = sc.nextInt();
    }

    @Override
    void Xuat() {
        TuGiac KQ = new TuGiac(DayLon,DayBe,Canh1,Canh2);
        KQ.Xuat();
    }
}
