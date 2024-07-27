
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MH{
    private int maMH;
    private String ten, nhom;
    private double giaMua, giaBan, lai;
    public static int stt = 1;

    public MH(String ten, String nhom, double giaMua, double giaBan) {
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.maMH = stt++;
        this.lai = giaBan - giaMua;
    }
    
    public double getLai(){
        return this.lai;
    }
    
    @Override
    public String toString(){
        return this.maMH + " " + this.ten + " " + this.nhom + " " + String.format("%.2f",this.lai);
    }
    
}
public class J05010_sapXepJ05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MH> mh = new ArrayList<>();
        while(n-- > 0){
            mh.add(new MH(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(mh, (MH o1, MH o2) -> o1.getLai() > o2.getLai() ? -1 : 1);
        for (MH i : mh){
            System.out.println(i);
        }
    }
}
