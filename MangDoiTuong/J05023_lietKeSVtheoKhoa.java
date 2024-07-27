
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class SV4{
    private String maSV, name, lop, email;

    public SV4() {
    }
   
    public SV4(String maSV, String name, String lop, String email) {
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


public class J05023_lietKeSVtheoKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV4> sv = new ArrayList<>();
        while(n-- > 0){
            sv.add(new SV4(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + lop + ":");
            for (SV4 i : sv){
                if (i.getMa().substring(1, 3).equalsIgnoreCase(lop.substring(2))){
                    System.out.println(i);
                }
            }
        }
    }
}
