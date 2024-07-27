/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DN{
    private String ma, ten;
    private int amount;

    public DN(String ma, String ten, int amount) {
        this.ma = ma;
        this.ten = ten;
        this.amount = amount;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + amount;
    }        
}

public class J05029_danhSachDoanhNghiepNhanSVThucTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DN> dn = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            dn.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        int q = sc.nextInt();
        while(q-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt(); 
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            ArrayList<DN> loc = new ArrayList<>();
            for (DN i : dn){
                if (i.getAmount() >= a && i.getAmount() <= b){
                    loc.add(i);
                }
            }
            Collections.sort(loc, new Comparator<DN>(){
                @Override
                public int compare(DN o1, DN o2) {
                    if (o1.getAmount() == o2.getAmount()){
                        return o1.getMa().compareTo(o2.getMa());
                    } else{
                        return o1.getAmount() > o2.getAmount() ? -1 : 1;
                    }
                }

            });
            for(DN i : loc){
                System.out.println(i);
            }
        }                      
    }
}
