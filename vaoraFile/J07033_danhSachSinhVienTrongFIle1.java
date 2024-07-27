/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SV implements Comparable<SV>{
    private String ma, ten, lop, email;

    public SV(String ma, String ten, String lop, String email) {
        this.ma = ma;
        String[] s = ten.trim().toLowerCase().split("\\s+");
        String res = "";
        for (String i : s){
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        this.ten = res.trim();
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }
    
    
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SV o) {
        return this.ma.compareToIgnoreCase(o.getMa());
    }
    
    
    
}
public class J07033_danhSachSinhVienTrongFIle1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SV> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new SV(sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(l);
        for(SV i : l){
            System.out.println(i);
        }
    }
}
