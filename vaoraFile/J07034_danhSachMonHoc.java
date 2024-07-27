/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MH{
    private String ma, ten;
    private int tc;

    public MH(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getTen() {
        return ten;
    }
    
    
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + tc;
    }
}
public class J07034_danhSachMonHoc {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MH> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new MH(sc.nextLine(),
            sc.nextLine(),
            Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<MH>(){
            @Override
            public int compare(MH o1, MH o2) {
                return o1.getTen().compareToIgnoreCase(o2.getTen());
            }
            
        });
        for (MH i : list){
            System.out.println(i);
        }
    }
}
