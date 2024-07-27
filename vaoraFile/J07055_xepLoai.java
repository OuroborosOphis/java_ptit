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

/**
 *
 * @author DELL 7510
 */
public class J07055_xepLoai {
    static class SV implements Comparable<SV>{
        private String ma, ten, rank;
        private double d;
        private static int stt = 1;

        public SV(String ten, double d1, double d2, double d3) {
            this.ma = String.format("SV%02d", stt++);
            String[] word = ten.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : word){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ten = res.trim();           
            this.d = (d1 * 0.25 + d2 * 0.35 + d3 * 0.4);
            if (d >= 8) this.rank = "GIOI";
            else if (d >= 6.5) this.rank = "KHA";
            else if (d >= 5) this.rank = "TRUNG BINH";
            else this.rank = "KEM";
        }
        
        public double getD() {
            return d;
        }
        
        @Override
        public int compareTo(SV o) {
            return Double.compare(o.getD(), this.getD());
        }
        
        @Override
        public String toString(){
            return String.format("%s %s %.2f %s", ma, ten, d, rank);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        Scanner sc = new Scanner(System.in);
        ArrayList<SV> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            l.add(new SV(sc.nextLine(), Double.parseDouble(sc.nextLine()), 
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(l);
        for (SV i : l){
            System.out.println(i);
        }           
    }
}
