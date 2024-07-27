
package helloWorld.fuck_you_world;

import java.util.Scanner;

public class BSC_USC {
    long USC (long a, long b) {
        if (b == 0) return a;
        return USC (b, a % b);
    }
    long BSC (long a, long b) {
        return a * b / USC(a, b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BSC_USC obj = new BSC_USC();
        
        int t = input.nextInt();
        long a, b;
        while (t --> 0) {
            a = input.nextLong();
            b = input.nextLong();
            System.out.println(obj.BSC(a, b) + " " + obj.USC(a, b));
        }
        input.close();
    }
}
