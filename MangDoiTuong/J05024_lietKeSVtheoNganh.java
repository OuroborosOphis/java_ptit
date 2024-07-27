
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class SV5{
    private String maSV, name, lop, email;

    public SV5() {
    }
   
    public SV5(String maSV, String name, String lop, String email) {
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

public class J05024_lietKeSVtheoNganh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV5> sv = new ArrayList<>();
        while(n-- > 0){
            sv.add(new SV5(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String lop = sc.nextLine().toUpperCase();
            String code = "";
            if (lop.equals("KE TOAN")) code = "DCKT";
            else if (lop.equals("CONG NGHE THONG TIN")) code = "DCCN";
            else if (lop.equals("AN TOAN THONG TIN")) code = "DCAT";
            else if (lop.equals("VIEN THONG")) code = "DCVT";
            else if (lop.equals("DIEN TU")) code = "DCDT";
            System.out.println("DANH SACH SINH VIEN NGANH " + lop + ":");
            for (SV5 i : sv){
                if (i.getMa().substring(3, 7).equals(code)){
                    if (code.equals("DCCN") || code.equals("DCAT")) {
                        if (!i.getLop().substring(0,1).equals("E")){
                            System.out.println(i);
                        }
                    } 
                    else System.out.println(i);
                }
            }
        }
    }
}
