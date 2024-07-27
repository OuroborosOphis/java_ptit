
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class Student {
    String name, date;
    float p1, p2, p3, s;
    
    void input(Scanner input) {
        this.name = input.nextLine();
        this.date = input.nextLine();
        this.p1 = input.nextFloat();
        this.p2 = input.nextFloat();
        this.p3 = input.nextFloat();
        this.s = p1 + p2 + p3;
    }
    void ouput() {
        System.out.printf("%s %s %.1f", name, date, s);
    }
}

public class J04005_classStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student stu = new Student();
        stu.input(input);
        stu.ouput();
    }
}
