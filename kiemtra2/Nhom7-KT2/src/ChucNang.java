
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public interface ChucNang {
    public void nhapGDVang(Scanner in);
    public void nhapGDTT(Scanner in);
    public void out();
    
    public void xoa(String ma);
    public void suaVang(String ma,Scanner in);
    // giao cac e
    public void timVangTheoLoai(String loaiVang);
    public void timVangTheoThanhTien(double tu, double den);
    public int demGDTTTheoLoaiTien(String loaiTien);
    public double tongTienGDTheoNam(int nam);
    public void sapxepTheoMa(); // giam dan
    public void sapxepTheoSoLuong(); // tang dan
    public void sapxepVangTheoThanhTien();
    public void sapxepTTTheoGia();
    public void sapxepTTTheoNgay(); // moi len tren cu xuong 
}
