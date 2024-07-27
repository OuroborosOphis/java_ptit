package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class phanSo {

    long a;
    long b;
    
    void input(Scanner input) {
        this.a = input.nextLong();
        this.b = input.nextLong();
    }
    
    long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    void rutgon() {
        long x = gcd(a, b);
        while (x != 1) {       
            a = a / x;
            b = b / x;
            x = gcd(a, b);
        }
    }
    
    
    void ouput() {
        System.out.println(a + "/" + b);
    }
}

public class J04003_phanSo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        phanSo x = new phanSo();
        
        x.input(input);
        x.rutgon();
        x.ouput();
    }
}
