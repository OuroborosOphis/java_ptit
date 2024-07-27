package helloWorld.fuck_you_world;

import java.io.BufferedReader;
import java.io.FileReader;

public class helloFile {

    public static void main(String[] args) throws Exception {
        // Mở file văn bản Hello.txt ở chế độ đọc
        FileReader fr = new FileReader("Hello.txt");
        BufferedReader br = new BufferedReader(fr);

        // Đọc nội dung file theo dòng
        String line;
        while ((line = br.readLine()) != null) {
            // In nội dung ra màn hình
            System.out.println(line);
        }

        // Đóng file
        fr.close();
    }
}