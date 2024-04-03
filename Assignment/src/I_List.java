/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public interface I_List {
  // tim ma cua 1 phan tu trong nhom
  int find(String code);
  //tim ten mot phan tu trong nhom
  int findName(String name);
  //tim mot phan tu bang ten
  void search ();
  // them 1 phan tu, co nhap lieu
  //void addStore(String inputString);
  void add();
  // xoa 1 phan tu, co nhap lieu
  void remove();
  // update 1 phan tu co nhap lieu
  void update();
  // sap xep ds
  void sort();
  // xuat ds
  void output();
  //luu danh sach ra file txt
  void save();
  //doc danh sach tu file 
  void loadStoreFromFile(String fName);
  //luu danh sach vao file binary
  void saveToFile ();
}
