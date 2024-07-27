
package helloWorld.fuck_you_world;

import java.util.Scanner;
import java.util.Arrays;

class IntArrayHandler {
    private int[] array;

    public IntArrayHandler() {
        array = new int[0];
    }

    public void inputIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào dãy số nguyên (cách nhau bởi dấu cách): ");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
    }

    public int findMinNonNegative() {
        int minNonNegative = Integer.MAX_VALUE;
        for (int num : array) {
            if (num >= 0 && num < minNonNegative) {
                minNonNegative = num;
            }
        }
        return minNonNegative;
    }

    public void sortDescendingFromThirdToBeforeLast() {
        if (array.length < 3) {
            return;
        }
        Arrays.sort(array, 2, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void findSubArraysWithSumK(int k) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                int[] subArray = Arrays.copyOfRange(array, i, j);
                if (Arrays.stream(subArray).sum() == k) {
                    System.out.println(Arrays.toString(subArray));
                }
            }
        }
    }
}

    
class Xau {

    private String s;

    public Xau() {
        s = "";
    }

    public void nhapXau() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    public void xuatXau() {
        System.out.println(s);
    }

    public int demTu() {
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                dem++;
            }
        }
        return dem + 1;
    }

    public int demCau() {
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                dem++;
            }
        }
        return dem;
    }
}
class MatrixHandler {
    private int[][] matrix;

    public void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        int columns = scanner.nextInt();
        matrix = new int[rows][columns];
        System.out.println("Nhập vào các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void transposeMatrix() {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < columns; i++){
            for (int j = 0; j < rows; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Menu {
    public static void main(String[] args) {
        IntArrayHandler intArrayHandler = new IntArrayHandler();
        Xau text = new Xau();
        MatrixHandler matrixHandler = new MatrixHandler();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nhập dãy số nguyên");
            System.out.println("2. Số nhỏ nhất không âm");
            System.out.println("3. Dãy số sắp xếp giảm dần");
            System.out.println("4. Các dãy con có tổng bằng k");
            System.out.println("5. Nhập dòng văn bản");
            System.out.println("6. Đưa ra số từ");
            System.out.println("7. Đưa ra số câu");
            System.out.println("8. Nhập ma trận chữ nhật");
            System.out.println("9. Đưa ra ma trận chuyển vị");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng (1-9): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    intArrayHandler.inputIntArray();
                    break;
                case 2:
                    int minNonNegative = intArrayHandler.findMinNonNegative();
                    System.out.println("Số nhỏ nhất không âm: " + minNonNegative);
                    break;
                case 3:
                    intArrayHandler.sortDescendingFromThirdToBeforeLast();
                    break;
                case 4:
                    System.out.print("Nhập k: ");
                    int k = scanner.nextInt();
                    intArrayHandler.findSubArraysWithSumK(k);
                    break;
                case 5:
                    scanner.nextLine(); // Consume newline
                    text.nhapXau();
                    break;
                case 6:
                    int st = text.demTu();
                    System.out.println(st);
                    break;
                case 7:
                    int sc = text.demCau();
                    System.out.println(sc);
                    break;
                case 8:
                    matrixHandler.inputMatrix();
                    break;
                case 9:
                    matrixHandler.transposeMatrix();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }
}
