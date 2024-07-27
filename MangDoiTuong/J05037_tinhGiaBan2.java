/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */

class CP2{
    private String maMH = "MH", ten, dv;
    private int giaNhap, sl;
    private long ship, thanhTien, ban;
    
    public static int stt = 1;

    public CP2(String ten, String dv, int giaNhap, int sl) {
        this.ten = ten;
        this.dv = dv;
        this.giaNhap = giaNhap;
        this.sl = sl;
        this.ship = Math.round(giaNhap * sl * 0.05);
        this.thanhTien = Math.round(this.ship + giaNhap * sl);
        this.ban = (long) Math.ceil((this.thanhTien * 1.02 / sl) / 100.0) * 100; // lam tron den hang tram nen chia cho 100
        // roi nhan lai voi 100
        this.maMH += String.format("%02d", stt++);
    }

    public double getBan() {
        return ban;
    }
    
    
    
    @Override
    public String toString(){
        return maMH + " " + ten + " " + dv + " " + ship + " " + thanhTien + " " + ban;
    }
    
    
}

public class J05037_tinhGiaBan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CP2> cp = new ArrayList<>();
        while(n-- > 0){
            cp.add(new CP2(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        cp.sort(Comparator.comparing(CP2::getBan).reversed());
        for(CP2 i : cp){
            System.out.println(i);
        }
    }
}
