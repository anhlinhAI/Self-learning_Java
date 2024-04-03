/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class Lab2_2 {
    private int tu, mau, choose;

	public Lab2_2(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}
	
	public int getTu() {
		return tu;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public int getMau() {
		return mau;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}
        
       /* void execution(){
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Sum");
            System.out.println("2.Difference");
            System.out.println("3.Product");
            System.out.println("4.Quotient");
            System.out.println("Choose the operation: ");
            choose = Integer.parseInt(sc.nextLine());
            
        }*/
	public int timUSCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
	
	public void toiGianPhanSo() {
		int i = timUSCLN(this.getTu(), this.getMau());
		this.setTu(this.getTu() / i);
		this.setMau(this.getMau() / i);
	}
	
	public void congPhanSo(Lab2_2 ps) {
		int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
		int ms = this.getMau() * ps.getMau();
		Lab2_2 phanSoTong = new Lab2_2(ts, ms);
		phanSoTong.toiGianPhanSo();
		System.out.println("1. Sum = " + phanSoTong.tu + "/" + phanSoTong.mau);
	}
	 
	public void truPhanSo(Lab2_2 ps) {
		int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
		int ms = this.getMau() * ps.getMau();
		Lab2_2 phanSoHieu = new Lab2_2(ts, ms);
		phanSoHieu.toiGianPhanSo();
		System.out.println("2. Difference = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
	}
	
	public void nhanPhanSo(Lab2_2 ps) {
		int ts = this.getTu() * ps.getTu();
		int ms = this.getMau() * ps.getMau();
		Lab2_2 phanSoTich = new Lab2_2(ts, ms);
		phanSoTich.toiGianPhanSo();
		System.out.println("3. Product = " + phanSoTich.tu + "/" + phanSoTich.mau);
	}
	
	public void chiaPhanSo(Lab2_2 ps) {
		int ts = this.getTu() * ps.getMau();
		int ms = this.getMau() * ps.getTu();
		Lab2_2 phanSoThuong = new Lab2_2(ts, ms);
		phanSoThuong.toiGianPhanSo();
		System.out.println("4. Quotient = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
	}
        
	
}

