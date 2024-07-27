
package ThucHanh1;

import java.util.Scanner;

class Sinhvien {
    private String maSV, hoTen;
    int age;
    double d1, d2, gpa;
    
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        this.maSV = ma.toUpperCase();
        this.hoTen = sc.nextLine();
        int age = sc.nextInt();
        this.age = 2023 - age;
        this.d1 = sc.nextDouble();
        this.d2 = sc.nextDouble();
        this.gpa = (d1 + 2 * d2) / 3;
    }
    
 
    public void out(){
        System.out.print(this.maSV + " " + this.hoTen + " " + this.age + " ");
        System.out.printf("%.01f", this.gpa);
    }
}
public class taoLopSinhVien {
    public static void main(String[] args) {
        Sinhvien sv=new Sinhvien();
        //input
        sv.input();
        //output
        sv.out();
    }
}
