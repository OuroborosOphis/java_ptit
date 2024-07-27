package KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

//class Point {
//
//    double x, y;
//
//    void input(Scanner input) {
//        this.x = input.nextDouble();
//        this.y = input.nextDouble();
//    }
//
//    double distance(Point p) {
//        double x0 = this.x - p.x;
//        double y0 = this.y - p.y;
//        return Math.sqrt(x0 * x0 + y0 * y0);
//    }
//
//    double findPerimeter(Point a, Point b) {
//        double A = this.distance(a);
//        double B = this.distance(b);
//        double C = a.distance(b);
//
//        if (A + B > C && A + C > B && B + C > A) {
//            return A + B + C;
//        } else {
//            return -1;
//        }
//    }
//}
//
//public class J04008_chuvitamgiac {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int t = input.nextInt();
//
//        while (t-- > 0) {
//            Point a = new Point();
//            Point b = new Point();
//            Point c = new Point();
//            a.input(input);
//            b.input(input);
//            c.input(input);
//
//            double k = a.findPerimeter(c, b);
//
//            if (k != -1) {
//                System.out.printf("%.3f\n", k);
//            } else {
//                System.out.println("INVALID");
//            }
//        }
//    }
//}
