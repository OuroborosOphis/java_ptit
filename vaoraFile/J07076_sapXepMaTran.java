/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL 7510
 */
public class J07076_sapXepMaTran {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt() - 1;
            int[][] a = new int[n][m];
            int[] b = new int[n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < m; ++j) {
                    a[i][j] = sc.nextInt();
                    if (j == k) b[i] = a[i][j];
                }
            Arrays.sort(b);
            for (int i = 0; i < n; ++i) a[i][k] = b[i];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) System.out.printf("%d ", a[i][j]);
                System.out.println();
            }
        }
    }
}
