
package vaoraFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    private TreeSet<String> ts;
    
    public WordSet(String s) throws IOException{
        Scanner sc = new Scanner(new File(s));
        TreeSet<String> ts = new TreeSet<>();
        while (sc.hasNext()){
            ts.add(sc.next().toLowerCase());
        }
        this.ts = ts;
    }
    
    @Override
    public String toString() {
        String res = "";
        for (String i : ts){
            res += i + "\n";
        }
        return res;
    }
}

public class J07007_lietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
