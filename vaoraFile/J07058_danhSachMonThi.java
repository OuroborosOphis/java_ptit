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

class MH implements Comparable<MH>{
    private String ma, ten, ht;

    public MH(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + ' ' + ten + ' ' + ht;
    }

    @Override
    public int compareTo(MH o) {
        return this.getMa().compareToIgnoreCase(o.getMa());
    }
    
    
}
public class J07058_danhSachMonThi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MH> l = new ArrayList<>();
        while(t-- > 0){
            l.add(new MH(sc.nextLine(), 
                    sc.nextLine(), 
                    sc.nextLine()));
        }
        Collections.sort(l);
        for(MH i : l){
            System.out.println(i);
        }
    }
}
