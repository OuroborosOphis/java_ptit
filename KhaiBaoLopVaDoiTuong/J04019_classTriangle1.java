package KhaiBaoLopVaDoiTuong;



import java.util.Scanner;

public class J04019_classTriangle1 {

    static class Point {
        private double d1;
        private double d2;

        public Point(double a, double b) {
            d1 = a;
            d2 = b;
        }

        public static Point nextPoint(Scanner s) {
            double t1 = s.nextDouble();
            double t2 = s.nextDouble();
            return new Point(t1, t2);
        }

        public double getD1() {
            return d1;
        }

        public double getD2() {
            return d2;
        }

        public void setD1(double a) {
            d1 = a;
        }

        public void setD2(double b) {
            d2 = b;
        }
    }

    static class Triangle {

        private Point p1;
        private Point p2;
        private Point p3;

        public Triangle(Point a, Point b, Point c) {          
              p1 = a;
              p2 = b;
              p3 = c;
        }

        public boolean valid() {
            double d1 = Math.sqrt(Math.pow((p2.getD1() - p1.getD1()), 2) + Math.pow((p2.getD2() - p1.getD2()), 2));
            double d2 = Math.sqrt(Math.pow((p3.getD1() - p1.getD1()), 2) + Math.pow((p3.getD2() - p1.getD2()), 2));
            double d3 = Math.sqrt(Math.pow((p3.getD1() - p2.getD1()), 2) + Math.pow((p3.getD2() - p2.getD2()), 2));
            return (d1 + d2 > d3 && d1 + d3 > d2 && d3 + d2 > d1);
        }

        public String getPerimeter() {
            double d1 = Math.sqrt(Math.pow((p2.getD1() - p1.getD1()), 2) + Math.pow((p2.getD2() - p1.getD2()), 2));
            double d2 = Math.sqrt(Math.pow((p3.getD1() - p1.getD1()), 2) + Math.pow((p3.getD2() - p1.getD2()), 2));
            double d3 = Math.sqrt(Math.pow((p3.getD1() - p2.getD1()), 2) + Math.pow((p3.getD2() - p2.getD2()), 2));
            double cv = d1 + d2 + d3;
            return String.format("%.3f", cv);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}