
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class SV3{
    private String maSV, name, lop, email;

    public SV3() {
    }
   
    public SV3(String maSV, String name, String lop, String email) {
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

class ListSV{
    private ArrayList<SV3> list;

    public ListSV() {
        this.list = new ArrayList<>();
    }
        
    
    public void nhap(Scanner sc){
        SV3 sv = new SV3(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());       
        list.add(sv);
    }
    
    public void lietKeTheoLop(String lop){
        System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
        for (SV3 i : list){
            if (i.getLop().equalsIgnoreCase(lop)) {
                System.out.println(i);
            }
        }
    }
}

public class J05022_lietKeSinhVienTheoLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ListSV list = new ListSV();
        while(n-- > 0){
            list.nhap(sc);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String lop = sc.nextLine();
            list.lietKeTheoLop(lop);
        }

    }
}
