
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class nhanVien {
    private String maNV, name, chucVu;
    private int luong, ngayCong, thuong, phuCap, thuNhap;

    public nhanVien(String name, int luong, int ngayCong, String chucVu) {
        this.maNV = "NV01";
        this.name = name;
        this.chucVu = chucVu;
        this.luong = luong;
        this.ngayCong = ngayCong;
        if (ngayCong >= 25) {
            this.thuong = (int) (0.2 * luong * ngayCong);
        } 
        else if (ngayCong >= 22){
            this.thuong = (int) (0.1 * luong * ngayCong);
        } else this.thuong = 0;
        
        if (chucVu.compareToIgnoreCase("GD") == 0) this.phuCap = 250000;
        else if (chucVu.compareToIgnoreCase("PGD") == 0) this.phuCap = 200000;
        else if (chucVu.compareToIgnoreCase("TP")== 0) this.phuCap = 180000;
        else this.phuCap = 150000;
        
        this.thuNhap = luong * ngayCong + this.thuong + this.phuCap;
    }
    
    @Override
    public String toString(){
        String res = this.maNV + " " + this.name + " " + (this.luong * this.ngayCong) + " " + this.thuong + " " + this.phuCap + " " + this.thuNhap;
        return res;
    }
}

public class J04012_baiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        int l = Integer.parseInt(sc.nextLine());
        int nc = Integer.parseInt(sc.nextLine());
        String cv = sc.nextLine();
        nhanVien nv = new nhanVien(ten, l, nc, cv);
        System.out.println(nv);
    }
}
