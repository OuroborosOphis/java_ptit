/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaoraFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author DELL 7510
 */
public class highLevelStreamDemo {
    public static void main(String[] args) {
        final char BLANK = 32;
        final String filename = "HStream.txt";
        int[] a = {1, 2, 3, 4, 5};
        char n = '5';
        try {
            FileOutputStream os = new FileOutputStream(filename);
            DataOutputStream ds = new DataOutputStream(os);
            ds.writeChar(n); // begin writing
            ds.writeChar(BLANK);
            for (int i = 0; i < 5; i++) {
                ds.writeInt(a[i]);
                ds.writeChar(BLANK);
            }
            ds.writeUTF(filename);
            ds.close();
            os.close();
            
            // read
            FileInputStream is = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(is);
            int count = is.available();
            System.out.println("The size of file is " + count + " bytes");
            System.out.println("The content of file: ");
            System.out.print(dis.readChar());
            System.out.print(dis.readChar());
            for (int i = 0; i < 5; i++) {
                System.out.print(dis.readInt());
                System.out.print(dis.readChar());
            }
            System.out.println(dis.readUTF());
            dis.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
