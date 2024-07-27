package J04010;

import java.util.Scanner;

public class dientichhinhtronngoaitieptamgiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {
            Point a = new Point(input.nextDouble(), input.nextDouble());
            Point b = new Point(input.nextDouble(), input.nextDouble());
            Point c = new Point(input.nextDouble(), input.nextDouble());           

            double ab = a.distance(b), bc = b.distance(c), ca = c.distance(a);
            if(ab + bc <= ca || bc + ca <= ab || ab + ca <= bc){
                System.out.println("INVALID");
            }else{
                Double s = Math.sqrt((ab + bc + ca) * (ab + bc - ca) * ( - ab + bc + ca) * ( ab - bc + ca));
                double r = (ab * bc * ca) / s;
                System.out.printf("%.3f\n", r * r * Math.PI);
            }
        }
    }
}
