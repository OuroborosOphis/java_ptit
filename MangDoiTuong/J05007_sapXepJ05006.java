
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NV{
    private String maNV, ten, sex, dob, addr, tax, date;
    public static int sMa = 1;

    public NV(String ten, String sex, String dob, String addr, String tax, String date) {
        this.ten = ten;
        this.sex = sex;
        this.dob = dob;
        this.addr = addr;
        this.tax = tax;
        this.date = date;
        this.maNV = String.format("%05d", sMa ++);
    }
    
    public String getDob(){
        return this.dob;
    }
    
    @Override
    public String toString(){
        return this.maNV + " " + this.ten + " " + this.sex + " " + this.dob + " " + this.addr + " " + this.tax + " " + this.date;
    }
    
}

public class J05007_sapXepJ05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NV> a = new ArrayList<>();
        while (n-- > 0){
            a.add(new NV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a, (NV o1, NV o2) -> {
            String[] s1 = o1.getDob().split("/");
            String[] s2 = o2.getDob().split("/");
            if (s1[2].compareToIgnoreCase(s2[2]) == 0){
                if(s1[1].compareToIgnoreCase(s2[1])== 0){
                    if(s1[0].compareToIgnoreCase(s2[0]) == 0){
                        return s1[0].compareToIgnoreCase(s2[0]);
                    } else {
                        return s1[0].compareToIgnoreCase(s2[0]);
                    }
                } else{
                    return s1[1].compareToIgnoreCase(s2[1]);
                }
            } else{
                return s1[2].compareToIgnoreCase(s2[2]);
            }
        });
        for (NV i : a){
            System.out.println(i);
        }
    }
}
