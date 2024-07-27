
package MangDoiTuong;

import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Scanner;

class sv2{
    private String maSV = "B20DCCN", ten, dob, lop;
    private double gpa;
    public static int sMa = 1;

    public sv2(String ten, String lop, String dob, double gpa) {
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
    
    @Override
    public String toString(){
        return this.maSV + " " + getTen() + " " + this.lop + " " + getDob() + " " + String.format("%.2f", this.gpa);
    }

}

public class J05004_danhSachDoiTuongSInhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sv2> a = new ArrayList<>();
        while (n-- > 0){
            a.add(new sv2(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        for (sv2 i : a){
            System.out.println(i);
        }
    }
}
