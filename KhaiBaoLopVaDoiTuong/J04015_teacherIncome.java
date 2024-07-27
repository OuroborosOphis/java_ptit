
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class Wage {
    String maNgach, hoTen;
    int luongCoBan, bacLuong, phuCap, thuNhap;
    
    void input() {
        Scanner sc = new Scanner(System.in);
        maNgach = sc.nextLine();
        hoTen = sc.nextLine();
        luongCoBan = sc.nextInt();
        if (maNgach.substring(0, 2).equals("HT")) {
            phuCap = 2000000;
        }
        else if (maNgach.substring(0, 2).equals("HP")) {
            phuCap = 900000;
        } 
        else phuCap = 500000;
        bacLuong = (maNgach.charAt(2) - '0') * 10 + (maNgach.charAt(3) - '0');
        thuNhap = luongCoBan * bacLuong + phuCap;
    }
    
    void output() {
        System.out.printf("%s %s %d %d %d", maNgach, hoTen, bacLuong, phuCap, thuNhap);
    }
}

public class J04015_teacherIncome {
    public static void main(String[] args) {
        Wage w = new Wage();
        
        w.input();
        w.output();
    }
}
