
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class tuyenSinh {
    private String maTS, name, status;
    private double d1, d2, d3, dut, d;

    public tuyenSinh(String maTS, String name, double d1, double d2, double d3) {
        this.maTS = maTS;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        
        if (maTS.contains("KV1")) this.dut = 0.5;
        else if (maTS.contains("KV2")) this.dut = 1.0;
        else if (maTS.contains("KV3")) this.dut = 2.5;
        
        this.d = d1 * 2 + d2 + d3;
        
        if (this.d + this.dut >= 24) this.status = "TRUNG TUYEN";
        else this.status = "TRUOT";
    }
    @Override
    public String toString(){
        String bonus, total;
        if (this.dut == (int) this.dut) bonus = String.valueOf((int)this.dut);
        else bonus = String.format("%.1f", this.dut);
        if (this.d == (int) this.d) total = String.valueOf((int)this.d);
        else total = String.format("%.1f", this.d);
        String res = this.maTS + " " + this.name + " " + bonus + " " + total + " " + this.status;
        return res;
    }
}

public class J04013_baiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double d1 = Double.parseDouble(sc.nextLine());
        double d2 = Double.parseDouble(sc.nextLine());
        double d3 = Double.parseDouble(sc.nextLine());
        tuyenSinh ts = new tuyenSinh(ma, ten, d1, d2, d3);
        System.out.println(ts);
    }
}
