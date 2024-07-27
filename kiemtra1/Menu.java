
package kiemtra1;

import java.util.Scanner;



public class Menu {
    public static void main(String[] args) {
        matrix mt = new matrix();
        sothuc f = new sothuc();
        Xau s = new Xau();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Nhap vao 1 xau\n2.Kiem tra xem co phai maSV PTIT k\n3.Tach cac tu trong xau"
                    + "\n4.Chuan hoa doan van ban\n5.Nhap vao 1 ma tran chu nhat A\n6.Viet ra ma tran chuyen vi cua A"
                    + "\n7.Dua ra cac hang chi co so nguyen to\n8.Nhap vao x va epsilon(la 2 so thuc, co epsilon rat nho)"
                    + "\n9.Tinh cos x= "
                    + "\n0.Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:                   
                    s.nhapXau();
                    break;
                case 2:
                    break;
                case 3:
                    s.tachTu();
                    break;
                case 4:
                    break;
                case 5:
                    mt.nhapMT();
                    break;
                case 6:
                    mt.chuyenvi();
                    break;
                case 7:
                    mt.hangNT();
                    break;
                case 8:
                    f.nhapSoThuc();
                    break;
                case 9:
                    break;
                case 0:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Chon tu 0 - 9");
            }
        } while (choice != 0);
    }
}
