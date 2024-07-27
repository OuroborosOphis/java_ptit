
package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    private String s;
    
    public WordSet(String s) {
        this.s = s.toLowerCase();
    }
    
    
    
    public String union(WordSet a){
        TreeSet<String> s1 = new TreeSet<String>();
        String[] arr = this.s.split("\\s+");
        for (String x : arr){
            s1.add(x);
        }
        TreeSet<String> s2 = new TreeSet<String>();
        String[] arr2 = a.s.split("\\s+");
        for (String x : arr2){
            s2.add(x);
        }
        s1.addAll(s2);
        String res = "";
        for (String x : s1){
            res += x + " ";
        }
        return res.trim();
    }
    
    public String intersection(WordSet a){
        TreeSet<String> s1 = new TreeSet<String>();
        String[] arr = this.s.split("\\s+");
        for (String x : arr){
            s1.add(x);
        }
        TreeSet<String> s2 = new TreeSet<String>();
        String[] arr2 = a.s.split("\\s+");
        for (String x : arr2){
            s2.add(x);
        }
        s1.retainAll(s2);
        String res = "";
        for (String x : s1){
            res += x + " ";
        }
        return res.trim();
    }
}

public class J04022_wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
