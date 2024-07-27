
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GV{
    private String ten, mon, maGV = "GV";
    public static int stt = 1;
    
    public GV(String ten, String mon) {
        this.ten = ten;
        String[] a = mon.split("\\s+");
        String x = "";
        for (String i : a){
            x += i.substring(0, 1).toUpperCase();
        }
        this.mon = x;
        this.maGV += String.format("%02d", stt++);
    }
    
    public String getTen(){
        String[] a = this.ten.split("\\s+");
        return a[a.length - 1];
    }
    
    public String getMa(){
        return this.maGV;
    }
    
    public String getMon(){
        return this.mon;
    }

    @Override
    public String toString() {
        return maGV + " " + ten + " " + mon;
    }   
}

public class J05025_sapXepDanhSachGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV> gv = new ArrayList<>();
        while(n-- > 0){
            gv.add(new GV(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(gv, new Comparator<GV>(){
            @Override
            public int compare(GV o1, GV o2) {
                if (o1.getTen().equals(o2.getTen())){
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o1.getTen().compareTo(o2.getTen());
            }            
        });
        for (GV i : gv){
            System.out.println(i);
        }
    }
}
