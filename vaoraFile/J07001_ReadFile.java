
package vaoraFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class J07001_ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
        }
    }
}
