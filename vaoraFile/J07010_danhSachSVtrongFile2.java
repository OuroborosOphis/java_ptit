/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class sinhVien {

    String maSV = "B20DCCN", name, lop, date;
    float gpa;
    public static int stt = 1;

    public sinhVien(String name, String lop, String date, float gpa) throws ParseException {
        maSV += String.format("%03d", stt++);
        this.name = name;
        this.lop = lop;
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        this.date = f.format(f.parse(date));
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return maSV + " " + name + " " + lop + " " + date + " " + String.format("%.2f", gpa);
    }
    
}



public class J07010_danhSachSVtrongFile2 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            System.out.println(new sinhVien(sc.nextLine(),
            sc.nextLine(),
            sc.nextLine(),
            Float.parseFloat(sc.nextLine())));
        }
    }
}
