package helloWorld.fuck_you_world;

import java.util.Scanner;
public class hcn {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int length = input.nextInt();
            int width = input.nextInt();
            
            if (length <= 0 || width <= 0) {
                System.out.println(0);
            } else {
                int perimeter = (length + width) * 2;
                int area = length * width;
                System.out.println(perimeter + " " + area);
            }
        }
    }
}
