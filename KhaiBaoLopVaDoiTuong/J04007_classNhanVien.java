
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class nhanVien1 {
    private String maNV, name, sex, bd, adr, tax, cd;
    
    void input() {
        Scanner input = new Scanner(System.in);
        maNV = "00001";
        name = input.nextLine();
        sex = input.nextLine();
        bd = input.nextLine();
        adr = input.nextLine();
        tax = input.next();
        cd = input.next();
    }
    
    void output() {
        System.out.printf("%s %s %s %s %s %s %s", maNV, name, sex, bd, adr, tax, cd);
    }
}

public class J04007_classNhanVien {
    public static void main(String[] args) {
        nhanVien1 nv = new nhanVien1();
        
        nv.input();
        nv.output();
    }
}
