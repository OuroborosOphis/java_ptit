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
public class J07071_tenVietTat {
    static class Ten implements Comparable<Ten>{
        private String ho, ten, ht;

        public Ten(String s) {
            this.ht = s;
            String[] word = s.split("\\s+");
            int t = word.length;
            this.ho = word[0];
            this.ten = word[t - 1];
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
        

        @Override
        public int compareTo(Ten o) {
            if (o.getTen().equalsIgnoreCase(this.getTen())) return this.getHo().compareTo(o.getHo());
            return this.getTen().compareTo(o.getTen());
        }

        @Override
        public String toString() {
            return ht;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
//        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Ten> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new Ten(sc.nextLine()));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());

        while(q-- > 0){
            String vt = sc.nextLine();
            for (Ten i : list){
                boolean ok = true;
                String[] word1 = i.getHt().split("\\s+");
                String[] word2 = vt.split("\\.");
                for (int j = 0; j < word1.length; j++){
                    if (word2[j].compareToIgnoreCase("*")==0) continue;
                    if (word1[j].substring(0, 1).compareToIgnoreCase(word2[j]) != 0){
                        ok = false; break;
                    }
                }
                if (ok) System.out.println(i);
            }
        }
    }
}
