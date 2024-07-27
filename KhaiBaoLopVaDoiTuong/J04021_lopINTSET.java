
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
import java.util.TreeSet;

class IntSet {
    private int[] a; 

    public IntSet(int a[]) {
        this.a = a;
    }
    
    public IntSet union(IntSet b){
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i : b.a){
            ts.add(i);
        }
        for (int i : this.a) {
            ts.add(i);
        }
        int i = 0;
        int[] c = new int[ts.size()];
        for (Integer x : ts){
            c[i] = x;
            i++;
        }
        return new IntSet(c);
    }
    
    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i < a.length; i++){
            res += a[i] + " ";
        }
        return res;
    }
}

public class J04021_lopINTSET {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
