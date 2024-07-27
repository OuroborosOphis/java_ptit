package JavaCanBan;
import java.util.Scanner;

// so ky tu cua xau X[n] chinh la so fibonacci thu n 
// 1 1 2 3 5 8 13 21
// vd: xau x[8] thi co thi co fibo[8] = 21 ky tu
// fibo[n] = fibo[n - 2] + fibo[n - 1]
// ta can xac dinh vi tri thu k trong n la 0 hay 1
// k trong pham vi cua X[n]
// neu k > fibo[n - 2] tuc la k trong fibo[n - 1]
// else: k trong fibo[n - 2]



public class J01022_xaunhiphan {
    
    static long fibo[] = new long[93];
    
    public static int Try(int n, long k) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (k > fibo[n - 2]) {
            return  Try(n - 1, k - fibo[n - 2]);
        } else {
            return Try(n - 2, k);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        fibo[1] = 1l;
        fibo[2] = 1l;
        for (int i = 3; i < 93; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        
        int t = sc.nextInt();
        
        while (t --> 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
