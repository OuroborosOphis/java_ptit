
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SV1{
    private String maSV, name, lop, email;

    public SV1(String maSV, String name, String lop, String email) {
        this.maSV = maSV;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }
    
    public String getMa(){
        return this.maSV;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    @Override
    public String toString(){
        return this.maSV + " " + this.name + " " + this.lop + " " + this.email;
    }
}
public class J05020_sapXepSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV1> sv = new ArrayList<>();
        while(n-- > 0){
            sv.add(new SV1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new Comparator<SV1>(){
            @Override
            public int compare(SV1 o1, SV1 o2) {
                if(o1.getLop().compareToIgnoreCase(o2.getLop()) == 0){
                    return o1.getMa().compareToIgnoreCase(o2.getMa());
                } else {
                    return o1.getLop().compareToIgnoreCase(o2.getLop());
                }
            }           
        });
        for (SV1 i : sv){
            System.out.println(i);
        }
    }
}
