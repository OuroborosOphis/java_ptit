/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt2;

/**
 *
 * @author DELL 7510
 */
public class XeTai extends PTGT implements IPTGT{
    private boolean thung;
    private double trongTai;

    public XeTai() {
    }

    public XeTai(String hang, String ngayLanBanh, double giaGoc, double trongTai, boolean thung) {
        super(hang, ngayLanBanh, giaGoc);
        this.thung = thung;
        this.trongTai = trongTai;
    }

    public boolean isThung() {
        return thung;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setThung(boolean thung) {
        this.thung = thung;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }
    
    @Override
    public void setMa(){
        super.setMa();
        super.setMa("T-" + super.getMa());
    }
    @Override
    public double getGiaBan(){
        double gia = getGiaGoc();
        double giaban;
        int nam = Integer.parseInt(getNgayLanBanh().substring(3));
        if (2023 - nam <= 0) giaban = gia*1.1;
        else if (2023 - nam < 3) giaban = gia*0.9;
        else giaban = gia * 0.8;
        if (isThung()) giaban *= 1.1;
        return giaban;   
    }
    @Override
    public String toString(){
        return super.getMa() + " " + super.getHang() + " " + super.getNgayLanBanh() + " " + getTrongTai()+ " " + String.format("%.0f", getGiaBan());
    }
    
}
