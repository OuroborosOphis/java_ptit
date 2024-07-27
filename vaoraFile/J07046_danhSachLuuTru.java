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

class KH implements Comparable<KH>{
    private String id = "KH", ten, ma;
    private Date den, di;
    private long o;
    public static int cnt = 1;

    public KH(String ten, String ma, Date den, Date di) {
        this.id += String.format("%02d", cnt++);
        this.ten = ten;
        this.ma = ma;
        this.den = den;
        this.di = di;
        this.o = (di.getTime() - den.getTime()) / (86400000);
        // getTime(): returns the number of milliseconds since January 1, 1970, 00:00:00 GTM.
    }

    public long getO() {
        return o;
    }
    
    

    @Override
    public String toString() {
        return id + " " + ten + " " + ma + " " + o;
    }

    @Override
    public int compareTo(KH a) {
        return (int) (a.getO() - this.getO());
    }
    
    
    
}
public class J07046_danhSachLuuTru {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KH> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        while(t-- > 0){
            list.add(new KH(sc.nextLine(),
                    sc.nextLine(), 
                    sdf.parse(sc.nextLine()), 
                    sdf.parse(sc.nextLine())));
        }
        Collections.sort(list);
        for (KH i : list){
            System.out.println(i);
        }
    }
}
