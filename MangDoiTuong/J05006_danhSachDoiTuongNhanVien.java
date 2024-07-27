
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class nv{
    private String maNV, ten, sex, dob, addr, tax, date;
    public static int sMa = 1;

    public nv(String ten, String sex, String dob, String addr, String tax, String date) {
        this.ten = ten;
        this.sex = sex;
        this.dob = dob;
        this.addr = addr;
        this.tax = tax;
        this.date = date;
        this.maNV = String.format("%05d", sMa ++);
    }
    
    @Override
    public String toString(){
        return this.maNV + " " + this.ten + " " + this.sex + " " + this.dob + " " + this.addr + " " + this.tax + " " + this.date;
    }
    
}
public class J05006_danhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<nv> a = new ArrayList<>();
        while (n-- > 0){
            a.add(new nv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for (nv i : a){
            System.out.println(i);
        }
    }
}
