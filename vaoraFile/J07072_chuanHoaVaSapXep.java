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
public class J07072_chuanHoaVaSapXep {
    static class Ten implements Comparable<Ten>{
        private String ho, ten, ht, tendem;

        public Ten(String s) {
            String[] word = s.trim().toLowerCase().split("\\s+");
            String res = "";
            for (String i : word){
                res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
            }
            this.ht = res.trim();
            int t = word.length;
            this.ho = word[0];
            this.ten = word[t - 1];
            if (t > 2) {
                this.tendem = word[1];
                for (int i = 2; i < t; i++) this.tendem += " " + word[i];
            } else this.tendem = "";
        }

        public String getHo() {
            return ho;
        }

        public String getTen() {
            return ten;
        }

        public String getHt() {
            return ht;
        }

        public String getTendem() {
            return tendem;
        }
        

        @Override
        public int compareTo(Ten o) {
            if (!o.getTen().equalsIgnoreCase(this.getTen())) return this.getTen().compareTo(o.getTen());
            if (!o.getHo().equalsIgnoreCase(this.getHo())) return this.getHo().compareTo(o.getHo());
            return this.getTendem().compareTo(o.getTendem());
        }

        @Override
        public String toString() {
            return ht;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
//        Scanner sc = new Scanner(System.in);       
        ArrayList<Ten> list = new ArrayList<>();
        while(sc.hasNextLine()){
            list.add(new Ten(sc.nextLine()));
        }
        Collections.sort(list);
        
        for (Ten i : list){
            System.out.println(i);
        }
        
    }
}
