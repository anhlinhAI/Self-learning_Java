
public class SuDung {
    public static void main(String args[]) {
        System.out.println("The square: ");
        HinhVuong a = new HinhVuong();
        a.Nhap();
        a.Xuat();
        System.out.println("The rectangle: ");
        HinhCN b = new HinhCN();
        b.Nhap();
        b.Xuat();
        System.out.println("The lozenge: ");
        HinhThoi c= new HinhThoi();
        c.Nhap();
        c.Xuat();
        System.out.println("The trapezium: ");
        HinhThang d=new HinhThang();
        d.Nhap();
        d.Xuat();
    }
}