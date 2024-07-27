
package helloWorld.fuck_you_world;

import java.util.Scanner;

public class tonggiaithua {
    long giaithua(int n) {
        long gt = 1;
        for (int i = 2; i <= n; ++i) {
            gt *= i;
        }
        return gt;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        tonggiaithua obj = new tonggiaithua();
        
        int n = input.nextInt();
        long sum = 1;
        for (int i = 2; i <= n; ++i) {
            sum += obj.giaithua(i);
        }
        System.out.println(sum);
        input.close();
    }
}
