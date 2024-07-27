
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;


public class J07003_tachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        String s = sc.nextLine();
        while (s.length() != 1){
            BigInteger a = new BigInteger(s.substring(0, s.length()/2));
            BigInteger a1 = new BigInteger(s.substring(s.length() / 2));
            s = String.valueOf(a.add(a1));
            System.out.println(s);
        }
    }
}
