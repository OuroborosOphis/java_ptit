package helloWorld.fuck_you_world;


import java.text.DecimalFormat;
import java.util.Scanner;
public class ptbac1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            
            if (a == 0) {
                if (b == 0)
                    System.out.println("VSN");
                else 
                     System.out.println("VN");
            }
            else {
                double x = -b / a;
                DecimalFormat formatted = new DecimalFormat("0.00");
                String fomattedX = formatted.format(x);
                System.out.println(fomattedX);
             }     
        }
    }
}
