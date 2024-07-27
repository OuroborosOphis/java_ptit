/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
class N{
    private String ten, ngay, thang, nam;

    public N(String ten, String dob) {
        this.ten = ten;
        String[] d = dob.split("/");
        this.ngay = d[0];
        this.thang = d[1];
        this.nam = d[2];
    }

    public String getTen() {
        return ten;
    }

    public String getNgay() {
        return ngay;
    }

    public String getThang() {
        return thang;
    }

    public String getNam() {
        return nam;
    }

    
    
    
}

public class J05032_treNhat_giaNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<N> al = new ArrayList<>();
        while(n-- > 0){
            String[] a = sc.nextLine().split("\\s+");
            al.add(new N(a[0], a[1]));
        }
        String nn, ln;
        Collections.sort(al, new Comparator<N>(){
            @Override
            public int compare(N o1, N o2) {
                if (o1.getNam().equalsIgnoreCase(o2.getNam())){
                    if (o1.getThang().equalsIgnoreCase(o2.getThang())){
                        return o1.getNgay().compareToIgnoreCase(o2.getNgay());
                    } else return o1.getThang().compareToIgnoreCase(o2.getThang());
                } else return o1.getNam().compareToIgnoreCase(o2.getNam());
            }
            
        });
        
        System.out.println(al.get(al.size() - 1).getTen());
        System.out.println(al.get(0).getTen());

    }
}
