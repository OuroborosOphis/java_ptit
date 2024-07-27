
package Collection;


public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double gpa;
    
    public SinhVien(String maSinhVien, String hoTen, String lop, double gpa){
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public double getGpa() {
        return gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString() {
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + String.format("%.02f", this.gpa);
    }
}
