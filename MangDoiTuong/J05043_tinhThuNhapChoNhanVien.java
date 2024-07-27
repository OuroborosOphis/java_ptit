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
public class J05043_tinhThuNhapChoNhanVien {
    static class NV implements Comparable<NV>{
        private String ma, ten, cv;
        private long lcb, n, pc, tu;
        private static int stt = 1;

        public NV(String ten, String cv, long l, long n) {
            this.ma = String.format("NV%02d", stt++);
            this.ten = ten;
            this.cv = cv;
            if (cv.equalsIgnoreCase("GD")) this.pc = 500;
            else if (cv.equalsIgnoreCase("PGD")) this.pc = 400;
            else if (cv.equalsIgnoreCase("TP")) this.pc = 300;
            else if (cv.equalsIgnoreCase("KT")) this.pc = 250;
            else this.pc = 100;
            this.lcb = l;
            this.n = n;
            if ((this.pc + l * n) * 2 / 3 < 25000) this.tu = Math.round((double)((this.pc + l * n) * 2 / 3) / 1000) * 1000;
            else this.tu = 25000;
        }

        public String getCv() {
            return cv;
        }
        
        public long getThuNhap(){
            return this.lcb * this.n + this.pc;
        }
        
        @Override
        public String toString() {
            return ma + " " + ten + " " + this.pc + " " + (this.lcb * this.n) + " " + this.tu + " " + (this.pc + this.lcb * this.n - this.tu);
        }

        @Override
        public int compareTo(NV o) {
            return (int) (o.getThuNhap() - this.getThuNhap());
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NV> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new NV(sc.nextLine(), sc.nextLine(), 
                    Integer.parseInt(sc.nextLine()), 
            Integer.parseInt(sc.nextLine())));
        }
//        String s = sc.nextLine();
        Collections.sort(list);
        for (NV i : list){
//            if (i.getCv().equalsIgnoreCase(s))
            System.out.println(i);
        }
    }
}
