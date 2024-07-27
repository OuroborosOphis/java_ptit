
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class sv3{
    private String maSV = "B20DCCN", ten, dob, lop;
    private double gpa;
    public static int sMa = 1;

    public sv3(String ten, String lop, String dob, double gpa) {
        this.ten = ten;
        this.dob = dob;
        this.lop = lop;
        this.gpa = gpa;
        this.maSV += String.format("%03d", sMa++);
    }
    
    public String getTen(){
        String[] a = this.ten.trim().toLowerCase().split("\\s+");
        for (int i = 0; i < a.length ; i++){
            a[i] = a[i].substring(0,1).toUpperCase() + a[i].substring(1);
        }
        return String.join(" ", a);
    }
    
    public String getDob(){
        String[] a = this.dob.split("/");
        for (int i = 0; i < 3; i++){
            if (a[i].length() < 2){
                a[i] = "0" + a[i];
            }
        }
        return String.join("/", a);
    }
    
    public double getGpa(){
        return this.gpa;
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + getTen() + " " + this.lop + " " + getDob() + " " + String.format("%.2f", this.gpa);
    }

}

public class J05005_danhSachDoiTuongSinhVien3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sv3> a = new ArrayList<>();
        while (n-- > 0){
            a.add(new sv3(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(a, (sv3 o1, sv3 o2) -> o1.getGpa() > o2.getGpa() ? -1 : 1);
        for (sv3 i : a){
            System.out.println(i);
        }
    }
}
