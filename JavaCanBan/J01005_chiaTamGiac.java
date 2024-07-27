/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCanBan;

import java.util.Scanner;


// https://www.geeksforgeeks.org/split-given-isosceles-triangle-of-height-h-into-n-equal-parts/

public class J01005_chiaTamGiac {
    static void findPoint(int n, int h)
    {
 
//        Chia tam giác sao cho (x i / h) 2 = i / N 
//       => x i = h*?(i/n) 
//       x i = chiều cao của i thứ cắt từ đỉnh trên của tam giác
        
        // Iterate over the range [1, n - 1]
        for (int i = 1; i < n; i++)
            System.out.printf("%.6f ",
                    Math.sqrt(i / (n * 1.0)) * h);
        System.out.println();
    }
 
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            findPoint(n, h);
        }
        
    }
}
