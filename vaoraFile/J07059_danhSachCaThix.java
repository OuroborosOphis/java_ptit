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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL 7510
 */
public class J07059_danhSachCaThix {
    static class CT implements Comparable<CT>{
        private String ma, id;
        private String ngay, gio;
        private static int stt = 1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm");

        public CT(String ngay, String gio, String id) {
            this.ma = String.format("C%03d", stt++);
            this.id = id;
            this.ngay = ngay;
            this.gio = gio;
        }

        public String getNgay() {
            return ngay;
        }

        public String getGio() {
            return gio;
        }

        public String getMa() {
            return ma;
        }
        

        @Override
        public int compareTo(CT o) {
            try {
                Long o1 = sdf.parse(this.getNgay() + " " + this.getGio()).getTime();
                Long o2 = sdf.parse(o.getNgay() + " " + o.getGio()).getTime();
                if (o1 != o2) return Long.compare(o1, o2);
                return this.getMa().compareToIgnoreCase(o.getMa());
            } catch (ParseException ex) {
                return 0;
            }
        }

        @Override
        public String toString() {
            return String.format("%s %s %s %S", ma, ngay, gio, id);
        }
        
        
    }
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        Scanner sc = new Scanner(new File("CATHI.in"));
        Scanner sc = new Scanner(System.in);
        ArrayList<CT> l = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-- > 0){
            l.add(new CT(sc.nextLine(),
            sc.nextLine(),
            sc.nextLine()));
        }
        Collections.sort(l);
        for (CT i : l){
            System.out.println(i);
        }           
    }
}
