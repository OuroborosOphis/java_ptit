/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2;

/**
 *
 * @author DELL 7510
 */
public class Oto extends PTGT implements IPTGT{
    private int soCho;
    private double dongCo;

    public Oto() {
    }

    public Oto(String hang, String ngayLanBanh, double giaGoc,int soCho, double dongCo) {
        super(hang, ngayLanBanh, giaGoc);
        this.soCho = soCho;
        this.dongCo = dongCo;
    }
    
    public int getSoCho() {
        return soCho;
    }

    public double getDongCo() {
        return dongCo;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public void setDongCo(double dongCo) {
        this.dongCo = dongCo;
    }
    @Override
    public void setMa(){
        String s = getHang().substring(0,2).toUpperCase();
        super.setMa();
        super.setMa(s + "-" + getMa());
    }
    
    @Override
    public double getGiaBan() {
        double gia = getGiaGoc();
        double giaban;
        int nam = Integer.parseInt(getNgayLanBanh().substring(3));
        if (2023 - nam == 0) giaban = gia + gia*0.1;
        else if (2023 - nam <= 2) giaban = gia*0.9;
        else if (2023 - nam <= 5) giaban = gia * 0.8;
        else giaban = gia * 0.7;
        return giaban;   
    }
    
    @Override
    public String toString(){
        return getMa() + " " + getHang() + " " + getNgayLanBanh() + " " + getSoCho() + " " + String.format("%.0f", getGiaBan());
    }
    
}
