
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class GV1{
    private String ten, mon, maGV = "GV";
    public static int stt = 1;
    
    public GV1(String ten, String mon) {
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
//        String[] a = this.ten.split("\\s+");
//        return a[a.length - 1];
          return this.ten;
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

public class J05027_timKiemGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV1> gv = new ArrayList<>();
        while(n-- > 0){
            gv.add(new GV1(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (GV1 i : gv){
                if (i.getTen().toLowerCase().contains(s.toLowerCase())){
                    System.out.println(i);
                }               
            }
        }      
    }
}
