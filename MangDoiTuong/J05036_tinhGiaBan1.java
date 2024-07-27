/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */

class CP{
    private String maMH = "MH", ten, dv;
    private int giaNhap, sl;
    private double ship, thanhTien, ban;
    
    public static int stt = 1;

    public CP(String ten, String dv, int giaNhap, int sl) {
        this.ten = ten;
        this.dv = dv;
        this.giaNhap = giaNhap;
        this.sl = sl;
        this.ship = giaNhap * sl * 0.05;
        this.thanhTien = this.ship + giaNhap * sl;
        this.ban = this.thanhTien * 1.02;
        this.maMH += String.format("%02d", stt++);
    }
    
    @Override
    public String toString(){
        return maMH + " " + ten + " " + dv + " " + Math.round(ship) + " " + Math.round(thanhTien) + " " + Math.round(ban);
    }
    
    
}

public class J05036_tinhGiaBan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CP> cp = new ArrayList<>();
        while(n-- > 0){
            cp.add(new CP(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        for(CP i : cp){
            System.out.println(i);
        }
    }
}
