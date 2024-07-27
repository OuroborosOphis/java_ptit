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

class TT{
    private String maSV, ten, lop, email, dn;
    private int stt;
    public static int t = 1;

    public TT(String maSV, String ten, String lop, String email, String dn) {
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
        this.stt = t++;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }

    public String getDn() {
        return dn;
    }

    public int getStt() {
        return stt;
    }
    
    @Override
    public String toString(){
        return stt + " " + maSV + " " + ten + " " + lop + " " + email + " " + dn;
    }
    
}
public class J05034_danhSachThucTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TT> tt = new ArrayList<>();
        while(n-- > 0 ){
            tt.add(new TT(
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine(),
            sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String s = sc.nextLine();
            ArrayList<TT> loc = new ArrayList<>();
            for (TT i : tt){
                if (i.getDn().equalsIgnoreCase(s)){
                    loc.add(i);
                }
            }
            Collections.sort(loc, new Comparator<TT>(){
                @Override
                public int compare(TT o1, TT o2) {
                    return  o1.getMaSV().compareToIgnoreCase(o2.getMaSV());
                }
                
            });
            for(TT i : loc){
                System.out.println(i);
            }
        }
    }
}
