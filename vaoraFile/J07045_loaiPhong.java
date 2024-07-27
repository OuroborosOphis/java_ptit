/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String kh, ten, don, phi;

    public LoaiPhong(String line) {
        String[] a = line.trim().split("\\s+");
        this.kh = a[0];
        this.ten = a[1];
        this.don = a[2];
        this.phi = a[3];
    }

    public String getTen() {
        return ten;
    }
    
    
    @Override
    public String toString(){
        return kh + " " + ten + " " + don + " " + phi;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.ten.compareToIgnoreCase(o.getTen());
    }
}
public class J07045_loaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
