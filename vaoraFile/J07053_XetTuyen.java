/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J07053_XetTuyen {
    static class PH{
        private String ma, ten, loai;
        private double lt, th;
        private int tuoi, mark;
        private static int stt = 1;

        public PH(String ten, String dob, double lt, double th) {
            this.ma = String.format("PH%02d", stt++);
            String[] word = ten.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : word){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ten = res.trim();
            this.lt = lt;
            this.th = th;
            this.tuoi = 2021 - Integer.parseInt(dob.substring(dob.length() - 4));
            double bonus = 0;
            if (lt >= 8 && th >= 8) bonus = 1;
            else if (lt >= 7.5 && th >= 7.5) bonus = 0.5;
            this.mark = (int) Math.round((lt + th) / 2 + bonus);
            if (this.mark > 10) this.mark = 10;
            if (this.mark >= 9) this.loai = "Xuat sac";
            else if (this.mark >= 8) this.loai = "Gioi";
            else if (this.mark >= 7) this.loai = "Kha";
            else if (this.mark >= 5) this.loai = "Trung binh";
            else this.loai = "Truot";
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + tuoi + " " + mark + " "+loai;
        }       

        public int getMark() {
            return mark;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PH> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            list.add(new PH(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), 
            Double.parseDouble(sc.nextLine())));
        }
        for (PH i : list){
            System.out.println(i);
        }
    }
}
