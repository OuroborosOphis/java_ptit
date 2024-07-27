
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Scanner;

class GV2{
    private String ten, mon, maGV = "GV";
    public static int stt = 1;
    
    public GV2(String ten, String mon) {
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

public class J05026_DanhSachGiangVienTheoBoMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GV2> gv = new ArrayList<>();
        while(n-- > 0){
            gv.add(new GV2(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String[] s = sc.nextLine().split("\\s+");
            String x = "";
            for (String i : s){
                x += i.substring(0, 1).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + x + ":");
            for (GV2 i : gv){
                if (i.getMon().equals(x)){
                    System.out.println(i);
                }               
            }
        }      
    }
}
