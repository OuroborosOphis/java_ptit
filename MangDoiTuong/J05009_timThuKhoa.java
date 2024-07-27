
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class TS{
    private int maTS;
    private String ten, dob;
    private double d1, d2, d3, d;
    public static int stt = 1;

    public TS(String ten, String dob, double d1, double d2, double d3) {
        this.ten = ten;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d = d1 + d2 + d3;
        this.maTS = stt++;
    }
    
    public double getd(){
        return this.d;
    }
    
    public int getMa(){
        return this.maTS;
    }
    
    @Override
    public String toString(){
        return this.maTS + " " + this.ten + " " + this.dob + " " + this.d;
    }
    
}
public class J05009_timThuKhoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TS> ts = new ArrayList<>();
        while(n-- > 0){
            ts.add(new TS(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ts, (TS o1, TS o2) -> {
            if (o1.getd() > o2.getd()) return 1;
            else if (o1.getd() < o2.getd()) return -1;
            else {
                return o1.getMa() > o2.getMa() ? 1 : -1;
            }
        });
        double max = ts.get(ts.size() - 1).getd();
        for (TS i : ts){
            if (i.getd() >= max) System.out.println(i);          
        }
    }
}
