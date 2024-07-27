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

class DN{
    private String ma, ten;
    private int amount;

    public DN(String ma, String ten, int amount) {
        this.ma = ma;
        this.ten = ten;
        this.amount = amount;
    }

    public String getMa() {
        return ma;
    }
   
    @Override
    public String toString() {
        return ma + " " + ten + " " + amount;
    }        
}
public class J07037_danhSachDoanhNghhiep {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DN> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new DN(sc.nextLine(),
            sc.nextLine(),
            Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<DN>(){          
            @Override
            public int compare(DN o1, DN o2) {
                return o1.getMa().compareToIgnoreCase(o2.getMa());
            }
            
        });
        for (DN i : list){
            System.out.println(i);
        }
    }
}
