/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong;

/**
 *
 * @author DELL 7510
 */
public class J05046_bangKeNhapKho {
    static class LH{
        private String ma, ten;
        private int sl, gia;
        private static int stt = 1;

        public LH(String ma, String ten, int sl, int gia) {
            String[] word = ten.split("\\s+");
            this.ma = word[0].substring(0, 1).toUpperCase() + word[1].substring(0, 1).toUpperCase();
            this.ma += String.format("%02d", stt++);
            this.ten = ten;
            this.sl = sl;
            this.gia = gia;
        }              
    }
    public static void main(String[] args) {
        
    }
}
