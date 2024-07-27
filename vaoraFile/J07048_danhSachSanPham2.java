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

class SP implements Comparable<SP>{
    private String id, ten;
    private int gia, bh;

    public SP(String id, String ten, int gia, int bh) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }

    public int getGia() {
        return gia;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + gia + " " + bh;
    }
    
    
    
    @Override
    public int compareTo(SP o) {
        if(this.getGia() == o.getGia()){
            return this.getId().compareToIgnoreCase(o.getId());
        } else {
            return o.getGia() - this.getGia();
        }
    }
    
    
}
public class J07048_danhSachSanPham2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SP> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new SP(sc.nextLine(),
                    sc.nextLine(), 
            Integer.parseInt(sc.nextLine()),
            Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(SP i : list){
            System.out.println(i);
        }
    }
}
