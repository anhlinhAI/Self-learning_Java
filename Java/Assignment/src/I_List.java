/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public interface I_List {
    int find(String code);
    void add();
    void remove();
    void Search();
    void update();
    void sort();
    void output();
    void save();
    void loadStoreFromFile(String fName);
    void saveToFile (String fName);
    
}
