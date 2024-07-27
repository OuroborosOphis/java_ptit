
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class matHang {
    private String maMH = "MH", tenMH, dvt; 
    private int giaMua, giaBan, lai;
    public static int sMa = 1;

    public matHang(String tenMH, String dvt, int giaMua, int giaBan) {
        this.tenMH = tenMH;
        this.dvt = dvt;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.maMH += String.format("%03d", sMa++);
        this.lai = giaBan - giaMua;
    }
    
    public int getLai(){
        return this.lai;
    }
    
    public String getMaMH(){
        return this.maMH;
    }
    
    @Override
    public String toString(){
        return this.maMH + " " + this.tenMH + " " + this.dvt + " " + this.giaMua + " " + this.giaBan + " " + this.lai;
    }
}

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<matHang> a = new ArrayList<>();
        while(t-- > 0){
            a.add(new matHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a, (matHang o1, matHang o2) -> {
            if (o1.getLai() == o2.getLai()) {
                return o1.getMaMH().compareToIgnoreCase(o2.getMaMH());
            }
            else if(o1.getLai() > o2.getLai()) return -1;
            else return 1;
        });
        for (matHang i : a){
            System.out.println(i);
        }
    }
}
