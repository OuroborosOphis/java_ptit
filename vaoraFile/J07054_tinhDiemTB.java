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
public class J07054_tinhDiemTB {
    static class SV implements Comparable<SV>{
        private String ma, ten;
        private double d1, d2, d3, d;
        private int rank;
        private static int stt = 1;

        public SV(String ten, double d1, double d2, double d3) {
            this.ma = String.format("SV%02d", stt++);
            String[] word = ten.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : word){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ten = res.trim();
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.d = (d1 * 3 + d2 * 3 + d3 * 2) / 8;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public String getMa() {
            return ma;
        }

        public double getD() {
            return d;
        }

        @Override
        public int compareTo(SV o) {
            if (Double.compare(o.getD(), this.getD()) == 0){
                return this.getMa().compareToIgnoreCase(o.getMa());
            }
            return Double.compare(o.getD(), this.getD());
        }
        
        @Override
        public String toString(){
            return String.format("%s %s %.2f %d", ma, ten, d, rank);
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
        double currentValue = 0;   
        int currentRank = 0, tmp = 0;
        for (SV i : l){
            if (Double.compare(i.getD(), currentValue) == 0){
                i.setRank(currentRank);
                tmp++;
            } else {
                currentRank += tmp + 1;
                i.setRank(currentRank);
                tmp = 0;
            }
            currentValue = i.getD();
        }
        for (SV i : l){
            System.out.println(i);
        }
    }
}
