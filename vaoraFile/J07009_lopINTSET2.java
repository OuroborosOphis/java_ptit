
package vaoraFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class IntSet{
    private int[] arr;
    
    public IntSet(int a[]) {
        this.arr = a;
    }
    
    public IntSet intersection(IntSet s1){
        TreeSet<Integer> ts1 = new TreeSet<>();
        for (int i : s1.arr){
            ts1.add(i);
        }
        TreeSet<Integer> ts2 = new TreeSet<>();
        for (int i : this.arr) {
            ts2.add(i);
        }
        ts1.retainAll(ts2);
        int i = 0;
        int[] c = new int[ts1.size()];
        for (Integer x : ts1){
            c[i] = x;
            i++;
        }
        return new IntSet(c);
    }
    
    @Override
    public String toString(){
        String res = "";
        for (int i : this.arr){
            res += i + " ";
        }
        return res;
    }
}

public class J07009_lopINTSET2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
