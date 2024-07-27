/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */

class DTP{
    private String maSV, ten, lop;
    private double d1, d2, d3;

    public DTP(String maSV, String ten, String lop, double d1, double d2, double d3) {
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    public double getD3() {
        return d3;
    }
    
    
    
    @Override
    public String toString(){
        return maSV + " " + ten + " " + lop + " " + d1 + " " + d2 + " " + d3;
    }
}

public class J05030_bangDiemThanhPhan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DTP> dtp = new ArrayList<>();
        while(n-- > 0) {
            dtp.add(new DTP(sc.nextLine(), 
                    sc.nextLine(), 
                    sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), 
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(dtp, new Comparator<DTP>(){
            @Override
            public int compare(DTP o1, DTP o2) {
                return o1.getTen().compareToIgnoreCase(o2.getTen());
            }
            
        });
        int t = 1;
        for (DTP i : dtp){        
            System.out.print(t + " ");
            t++;
            System.out.println(i);
        }
    }
}
