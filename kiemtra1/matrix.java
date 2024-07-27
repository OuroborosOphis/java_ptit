
package kiemtra1;

import java.util.Scanner;


public class matrix {
    private int [][] mt;
    
    public void nhapMT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua ma tran: ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int col = sc.nextInt();
        mt = new int[row][col];
        System.out.println("Nhap vao cac phan tu cua ma tran:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                mt[i][j] = sc.nextInt();
            }
        }     
    }
    public void chuyenvi(){
        int row = mt.length;
        int col = mt[0].length;
        int[][] res = new int[col][row];
        for (int i = 0; i < row; i ++){
            for (int j = 0; j < col; j++){
                res[j][i] = mt[i][j];
            }
        }
        for (int i = 0; i < row; i ++){
            for (int j = 0; j < col; j++){
                System.out.print(res[i][j] + " ");
            }System.out.println();
        }
    }
    public boolean nt(int n){
        if (n < 2) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public boolean check(int[] row){
        for (int i : row) {
            if (!nt(i)) return false;
        }
        return true;
    }
    
    public void hangNT() {
        int row = mt.length;
        int ok = 0;
        for (int i = 0; i < row; i++){
            if (check(mt[i])) {
                ok = 1;
                for (int j = 0; j < mt[i].length; j++){
                    System.out.print(mt[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (ok == 0) System.out.println("Khong co.");
    }
}
