/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J05060_ketQuaXetTuyen {
    static class PH implements Comparable<PH>{
        private String ma, ten, loai;
        private double lt, th;
        private int tuoi, mark;
        private static int stt = 1;

        public PH(String ten, String dob, double lt, double th) {
            this.ma = String.format("PH%02d", stt++);
            this.ten = ten;
            this.lt = lt;
            this.th = th;
            this.tuoi = 2021 - Integer.parseInt(dob.substring(6));
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

        @Override
        public int compareTo(PH o) {
            return o.getMark() - this.getMark();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<PH> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            list.add(new PH(sc.nextLine(), sc.nextLine(), 
                    Double.parseDouble(sc.nextLine()), 
            Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for (PH i : list){
            System.out.println(i);
        }
    }
}
