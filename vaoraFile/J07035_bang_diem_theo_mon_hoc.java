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


public class J07035_bang_diem_theo_mon_hoc {
    static class MH{
        String id, ten;
        int tc;

        public MH(String id, String name, int tc) {
            this.id = id;
            this.ten = name;
            this.tc = tc;
        }

        public String getId() {
            return id;
        }

        public String getTen() {
            return ten;
        }
        
        
    }
    
    static class SV{
        String id, ten, lop, email;

        public SV(String id, String ten, String grade, String email) {
            this.id = id;
            String[] s = ten.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : s){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ten = res.trim();
            this.lop = grade;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public String getTen() {
            return ten;
        }

        public String getLop() {
            return lop;
        }

        public String getEmail() {
            return email;
        }
        
    }
    
    static class BD implements Comparable<BD>{
        private SV sv;
        private MH mh;
        private double mark;

        public BD(double mark) {
            this.mark = mark;
        }

        public SV getSv() {
            return sv;
        }

        public void setSv(SV sv) {
            this.sv = sv;
        }

        public MH getMh() {
            return mh;
        }

        public void setMh(MH mh) {
            this.mh = mh;
        }

        public double getMark() {
            return mark;
        }

        public void setMark(double mark) {
            this.mark = mark;
        }

        @Override
        public String toString() { 
            String s = String.format("%s %s %s ", sv.id, sv.ten, sv.lop);
            if (mark == (int) mark) s += String.format("%d", (int) mark);
            else s += String.format("%s", mark);
            return s;
        }

        @Override
        public int compareTo(BD o) {
            return Double.compare(o.getMark(), this.getMark());
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("MONHOC.in"));
        Scanner sc3 = new Scanner(new File("BANGDIEM.in"));
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
        int t = Integer.parseInt(sc1.nextLine());
        ArrayList<SV> sv = new ArrayList<>();
        ArrayList<MH> mh = new ArrayList<>();
        ArrayList<BD> bd = new ArrayList<>();
        while(t-- > 0){
            sv.add(new SV(sc1.nextLine(),sc1.nextLine(),
                    sc1.nextLine(),sc1.nextLine()));
        }
        t = Integer.parseInt(sc2.nextLine());
        while(t-- > 0){
            mh.add(new MH(sc2.nextLine(),sc2.nextLine(),
                    Integer.parseInt(sc2.nextLine())));
        }
        t = Integer.parseInt(sc3.nextLine());
        while(t-- > 0){
            String maSV = sc3.next();
            String maMH = sc3.next();
            double mark = Double.parseDouble(sc3.nextLine());
            BD x = new BD(mark);
            bd.add(x);
            for (SV i : sv){
                if (i.getId().equals(maSV)){
                    x.setSv(i);
                    break;
                }
            }
            for (MH i : mh){
                if (i.getId().equals(maMH)){
                    x.setMh(i); break;
                }
            }
        }
        Collections.sort(bd);        
        t = Integer.parseInt(sc3.nextLine());
        while(t-- > 0){
            String id = sc3.nextLine();
            String mon = "";
            for (MH i : mh){
                if (id.equals(i.getId())){
                    mon = i.getTen();
                }
            }
            System.out.printf("BANG DIEM MON %s:\n", mon);
            for (BD i : bd){
                if (i.getMh().getId().equals(id)){
                    System.out.println(i);
                } 
            }
        }
    }
}
