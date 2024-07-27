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
public class J05042_bangXepHang {
    static class XH implements Comparable<XH>{
        private String ten;
        private int dung, submit;

        public XH(String ten, String s) {
            this.ten = ten;
            String[] a = s.split("\\s+");
            this.dung = Integer.parseInt(a[0]);
            this.submit = Integer.parseInt(a[1]);
        }

        @Override
        public String toString() {
            return ten + " " + dung + " " + submit;
        }

        public int getDung() {
            return dung;
        }

        public int getSubmit() {
            return submit;
        }

        public String getTen() {
            return ten;
        }       

        @Override
        public int compareTo(XH o) {
            if (this.getDung() == o.getDung()){
                if (this.getSubmit() == o.getSubmit()){
                    return this.getTen().compareToIgnoreCase(o.getTen());
                } return this.getSubmit() - o.getSubmit();
            } return o.getDung() - this.getDung();
        }       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<XH> list = new ArrayList<>();
        while(t-- > 0){
            list.add(new XH(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for (XH i : list){
            System.out.println(i);
        }
    }
}
