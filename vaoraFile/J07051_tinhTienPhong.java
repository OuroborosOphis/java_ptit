/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J07051_tinhTienPhong {
    static class KS implements Comparable<KS>{
        private String ma, ten, phong;
        private Date nhan, tra;
        private int dv, giaTang, phi;
        private long stay;
        private static int stt = 1;
        

        public KS(String ten, String phong, Date nhan, Date tra, int dv) {
            this.ma = String.format("KH%02d", stt++);
            String[] word = ten.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : word){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ten = res.trim();
            this.phong = phong;
            int a = Integer.parseInt(phong.substring(0, 1));
            if (a == 1) this.giaTang = 25;
            else if (a == 2) this.giaTang = 34;
            else if (a == 3) this.giaTang = 50;
            else this.giaTang = 80;
            this.nhan = nhan;
            this.tra = tra;
            this.stay = (tra.getTime() - nhan.getTime()) / (86400000) + 1;
            this.dv = dv;
            this.phi = (int)this.stay * this.giaTang + dv;
        }

        public int getPhi() {
            return phi;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + phong + " " + stay + " " + phi;
        }

        @Override
        public int compareTo(KS o) {
            return o.getPhi() - this.getPhi();
        }                     
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KS> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-- > 0){
            list.add(new KS(sc.nextLine(),
            sc.nextLine(),
            sdf.parse(sc.nextLine()),
            sdf.parse(sc.nextLine()),
            Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for (KS i : list){
            System.out.println(i);
        }
    }
}
