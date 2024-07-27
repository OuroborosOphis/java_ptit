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

class salary implements Comparable<salary>{
    private String maNV = "NV", name;
    private double luong, luongThang, thuong, phuCap;
    private int ngayCong;
    private String chucVu;
    public static int stt = 1;

    public salary(String name, double luong, int ngayCong, String chucVu) {
        this.name = name;
        this.luong = luong;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
        this.maNV += String.format("%02d",stt++);
        luongThang = luong * ngayCong;
        if (ngayCong >= 25){
            thuong = luongThang * 0.2;
        } else if (ngayCong >= 22){
            thuong = luongThang * 0.1;
        } else thuong = 0;
        if (chucVu.equalsIgnoreCase("GD")){
            this.phuCap = 250000;
        } else if (chucVu.equalsIgnoreCase("PGD")){
            this.phuCap = 200000;
        } else if (chucVu.equalsIgnoreCase("TP")){
            this.phuCap = 180000;
        } else this.phuCap = 150000;
    }
    
    public double getLuong(){
        return luongThang + thuong + phuCap;
    }
    
    @Override
    public String toString(){
        return maNV + " " + name + " " + (int)luongThang + " " + (int)thuong + " " + (int)phuCap + " " + (int)(luongThang + thuong + phuCap);
    }

    @Override
    public int compareTo(salary o) {
        return (int)(o.getLuong() - this.getLuong());
    }
}
public class J05038_bangKeTienLuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<salary> list = new ArrayList<>();
        while(n-- > 0){
            list.add(new salary(sc.nextLine(),
            Double.parseDouble(sc.nextLine()), 
            Integer.parseInt(sc.nextLine()),
            sc.nextLine()));
        }
        Collections.sort(list);
        double cnt = 0;
        for (salary i : list){
            System.out.println(i);
            cnt += i.getLuong();
        }
        System.out.println("Tong chi phi tien luong: " + (int)cnt);
    }
}
