
package kt2;


public class PTGT {

    private String ma, hang, ngayLanBanh;
    private double giaGoc;
    
    public static int t = 1;

    public PTGT() {
    }
    
    public PTGT(String hang, String ngayLanBanh, double giaGoc) {
        this.hang = hang;
        this.ngayLanBanh = ngayLanBanh;
        this.giaGoc = giaGoc;
    }

    public String getMa() {
        return ma;
    }

    public String getHang() {
        return hang;
    }

    public String getNgayLanBanh() {
        return ngayLanBanh;
    }

    public double getGiaGoc() {
        return giaGoc;
    }
    
    public void setMa(){
        this.ma = String.format("%03d", t);
        t++;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setNgayLanBanh(String ngayLanBanh) {
        this.ngayLanBanh = ngayLanBanh;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }
    
    
}
