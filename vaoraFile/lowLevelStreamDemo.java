/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DELL 7510
 */
public class lowLevelStreamDemo {
    public static void main(String[] args) {
       
        final char BLANK = 32;
        final String filename = "LStream.txt";
        int[] a = {1, 2, 3, 4, 5};
        char n = '5';
        // cac gia tri nay khong the lon hon 127 vi chi cac byte thap hon duoc ghi vao file
        try { 
            // Write data to file
            FileOutputStream os = new FileOutputStream(filename);
            os.write(n); // bat dau ghi 
            os.write(BLANK);
            for (int i = 0; i < 5; i++) {
                os.write(a[i]);
                os.write(BLANK);
            }
            for (int i = 0; i < filename.length(); i++){
                os.write(filename.charAt(i));
            }
            os.close();
            // read data from file
            FileInputStream is = new FileInputStream(filename);
            int count = is.available();
            System.out.println("The size of file is " + count + " bytes");
            System.out.println("The content of file: ");
            // read first char
            byte[] bytes = new byte[1];
            is.read(bytes);
            System.out.print(new String(bytes));
            //read blank
            is.read(bytes);
            System.out.print(new String(bytes));
            // read int number
            for (int i = 0; i < 5; i++){
                int tmp = is.read();
                is.read(bytes);
                System.out.print(tmp + new String(bytes));
            }
            bytes = new byte[11];
            is.read(bytes);
            System.out.print(new String(bytes));
            is.close();
        } catch (IOException e) {
        }
    }
}
