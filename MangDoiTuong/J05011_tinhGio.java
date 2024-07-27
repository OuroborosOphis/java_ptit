
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class game {
    private String maP, ten;
    private int h, m;

    public game(String maP, String ten, String vao, String ra) {
        this.maP = maP;
        this.ten = ten;
        String[] v = vao.split(":");
        String[] r = ra.split(":");
        int h1 = Integer.parseInt(v[0]);
        int h2 = Integer.parseInt(r[0]);
        int m1 = Integer.parseInt(v[1]);
        int m2 = Integer.parseInt(r[1]);
        // tong thoi gian choi (tinh bang phut)
        int tong = h2 * 60 + m2 - (h1 * 60 + m1);
        this.h = tong / 60;
        this.m = tong - this.h * 60;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }
    
    @Override
    public String toString(){
        return this.maP + " " + this.ten + " " + this.h + " gio " + this.m + " phut";
    }
    
}
public class J05011_tinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<game> g = new ArrayList<>();
        while(n-- > 0){
            g.add(new game(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(g, new Comparator<game>(){
            @Override
            public int compare(game o1, game o2) {
                if (o1.getH() == o2.getH()){
                    return o1.getM() > o2.getM() ? -1 : 1;
                } else return o1.getH() > o2.getH() ? -1 : 1;
            }
            
        });
        for (game i : g){
            System.out.println(i);
        }
    }
}
