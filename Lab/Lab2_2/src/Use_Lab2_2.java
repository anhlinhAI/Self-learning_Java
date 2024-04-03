/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

public class Use_Lab2_2 {
    public static void main(String[] args) {
        Lab2_2 phanSo1=new Lab2_2(16,3);    // tạo phân số có tử = 16 và mẫu = 4
        Lab2_2 phanSo2=new Lab2_2(4,8); // tạo phân số có tử = 4 và mẫu = 8
        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
    }
     
}
