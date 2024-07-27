package KhaiBaoLopVaDoiTuong;

import java.util.*;
import java.text.*;

class sinhVien {

    String maSV, name, lop, date;
    float gpa;

    public sinhVien() {
        maSV = "B20DCCN001";
    }

    void input(Scanner input) {
        this.name = input.nextLine();
        this.lop = input.next();
        this.date = input.next();
        this.gpa = input.nextFloat();
        if (date.charAt(1) == '/') {
            date = "0" + date.substring(0);
        }
        if (date.charAt(4) == '/') {
            date = date.substring(0, 3) + "0" + date.substring(3);
        }
    }

    void output() {
        /*SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date(date);
        this.date = f.format(d);*/
        System.out.printf("%s %s %s %s %.2f", maSV, name, lop, date, gpa);
    }
}

public class J04006_classSinhVien {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        sinhVien sv = new sinhVien();

        sv.input(input);
        sv.output();
    }
}
