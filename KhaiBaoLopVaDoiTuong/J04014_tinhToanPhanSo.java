
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class ps {
    private long tu, mau;

    public ps(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public void rutgon(){
        long x = gcd(this.tu, this.mau);
        while (x != 1){
            this.tu /= x;
            this.mau /= x;
            x = gcd(this.tu, this.mau);
        }
    }
    
    public ps cong(ps a){
        long t = this.tu * a.mau + this.mau * a.tu;
        long m = this.mau * a.mau;
        ps c = new ps(t, m);
        c.rutgon();
        return c;
    }
    
    public ps nhan(ps a){
        long t = this.tu * a.tu;
        long m = this.mau * a.mau;
        ps d = new ps(t, m);
        d.rutgon();
        return d;
    }
    
    @Override
    public String toString(){
        String res = this.tu + "/" + this.mau;
        return res;
    }
}

public class J04014_tinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long t1 = sc.nextLong();
            long m1 = sc.nextLong();
            long t2 = sc.nextLong();
            long m2 = sc.nextLong();
            ps a = new ps(t1, m1);
            ps b = new ps(t2, m2);
            ps c = a.cong(b).nhan(a.cong(b));
            ps d = a.nhan(b).nhan(c);
            System.out.println(String.format("%s %s", c, d));
        }
    }
}
