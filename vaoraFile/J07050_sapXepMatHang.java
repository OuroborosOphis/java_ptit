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

class matHang {
    private String maMH = "MH", tenMH, dvt; 
    private double giaMua, giaBan, lai;
    public static int sMa = 1;

    public matHang(String tenMH, String dvt, double giaMua, double giaBan) {
        this.tenMH = tenMH;
        this.dvt = dvt;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.maMH += String.format("%02d", sMa++);
        this.lai = giaBan - giaMua;
    }
    
    public double getLai(){
        return this.lai;
    }
    
    public String getMaMH(){
        return this.maMH;
    }
    
    @Override
    public String toString(){
        return this.maMH + " " + this.tenMH + " " + this.dvt + " " + String.format("%.2f", this.lai);
    }
}
public class J07050_sapXepMatHang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<matHang> a = new ArrayList<>();
        while(t-- > 0){
            a.add(new matHang(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a, (matHang o1, matHang o2) -> {
            
            return (int)(o2.getLai() - o1.getLai());
            
        });
        for (matHang i : a){
            System.out.println(i);
        }
    }
}
