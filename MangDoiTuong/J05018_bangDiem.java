
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class HS{
    private String maHS = "HS", ten, loai;
    private float dtb;
    public static int stt = 1;

    public HS(Scanner sc) {
        this.maHS += String.format("%02d", stt++);
        this.ten = sc.nextLine();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();
        float d4 = sc.nextFloat();
        float d5 = sc.nextFloat();
        float d6 = sc.nextFloat();
        float d7 = sc.nextFloat();
        float d8 = sc.nextFloat();
        float d9 = sc.nextFloat();
        float d10 = sc.nextFloat();
        sc.nextLine();
        this.dtb = Math.round((d1 * 2 + d2 * 2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10) / 12 * 10);  
        this.dtb = (float) this.dtb / 10;
        if (this.dtb >= 9) this.loai = "XUAT SAC";
        else if (this.dtb >= 8) this.loai = "GIOI";
        else if (this.dtb >= 7) this.loai = "KHA";
        else if (this.dtb >= 5) this.loai = "TB";
        else this.loai = "YEU";
    }
    
    public float getDTB(){
        return this.dtb;
    }
    
    public String getMa(){
        return this.maHS;
    }
    
    @Override
    public String toString(){
        return this.maHS + " " + this.ten + " " + String.format("%.1f", this.dtb) + " " + this.loai;
    }
}
public class J05018_bangDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HS> hs = new ArrayList<>();
        while(n-- > 0){
            hs.add(new HS(sc));
        }
        Collections.sort(hs, new Comparator<HS>(){
            @Override
            public int compare(HS o1, HS o2) {
                if (o1.getDTB() == o2.getDTB()){
                    return o1.getMa().compareToIgnoreCase(o2.getMa());
                }
                return o1.getDTB() > o2.getDTB() ? -1 : 1;
            }
            
        });
        for (HS i : hs) {
            System.out.println(i);
        }
    }
}
