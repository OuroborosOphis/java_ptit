
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL 7510
 */
public class CauChung {
    public static void main(String[] args) {
        NganHang n = new NganHang();
        n.out();
        
        Scanner in = new Scanner(System.in);
        //1
        String loai = in.nextLine();  // 9999
        n.timVangTheoLoai(loai);
        //2
        double tu, den;
        tu = Double.parseDouble(in.nextLine());
        den = Double.parseDouble(in.nextLine());
        n.timVangTheoThanhTien(tu, den); // 1000 - 3000
        System.out.println("Loai USD:" + n.demGDTTTheoLoaiTien("USD"));
        int nam = Integer.parseInt(in.nextLine());
        System.out.println("Nam "+nam+" tong tien :"+n.tongTienGDTheoNam(nam));
    }
}
