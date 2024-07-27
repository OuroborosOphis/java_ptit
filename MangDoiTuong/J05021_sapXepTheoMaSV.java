
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SV2{
    private String maSV, name, lop, email;

    public SV2(String maSV, String name, String lop, String email) {
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

public class J05021_sapXepTheoMaSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SV2> sv = new ArrayList<>();
        
        while(sc.hasNextLine()){
            String id = sc.nextLine();
            if (id.isEmpty()) break;
            sv.add(new SV2(id, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new Comparator<SV2>(){
            @Override
            public int compare(SV2 o1, SV2 o2) {               
                return o1.getMa().compareToIgnoreCase(o2.getMa());               
            }           
        });
        for (SV2 i : sv){
            System.out.println(i);
        }
    }
}
