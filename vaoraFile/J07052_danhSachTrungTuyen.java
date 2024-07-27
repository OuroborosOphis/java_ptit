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
public class J07052_danhSachTrungTuyen {
    static class TS implements Comparable<TS>{
        private String ma, ten, status;
        private double d1, d2, d3, d, d0;

        public TS(String ma, String ten, double d1, double d2, double d3) {
            this.ma = ma;
            String[] word = ten.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : word){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ten = res.trim();
            String kv = ma.substring(0, 3);
            if (kv.equalsIgnoreCase("KV1")) d0 = 0.5;
            else if (kv.equalsIgnoreCase("KV2")) d0 = 1.0;
            else d0 = 2.5;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            this.d = d1 * 2 + d2 + d3 + d0;
        }

        public double getD() {
            return d;
        }

        public String getMa() {
            return ma;
        }

        public void setStatus(String status) {
            this.status = status;
        }        
        
        @Override
        public String toString() {
            return ma + " " + ten + " " + 
                    ((int) this.d0 == this.d0 ? String.format("%d", (int)d0) : String.format("%.1f", d0))+ " " + 
                    ((int) this.d == this.d ? String.format("%d", (int)d) : String.format("%.1f", d)) + " " + status;
        }

        @Override
        public int compareTo(TS o) {
//            if (this.getD() == o.getD()){
//                return this.getMa().compareToIgnoreCase(o.getMa());
//            } 
//            return (int)(o.getD() - this.getD());
              return -Double.compare(this.getD(), o.getD());
        }                       
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<TS> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new TS(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), 
                    Double.parseDouble(sc.nextLine()), 
            Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        double diemChuan = list.get(q - 1).getD();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getD() >= diemChuan) {
                list.get(i).setStatus("TRUNG TUYEN");
            } else {
                list.get(i).setStatus("TRUOT");
            }          
        }
        System.out.printf("%.1f\n", diemChuan);
        for (TS i : list){
            System.out.println(i);
        }
    }
}
