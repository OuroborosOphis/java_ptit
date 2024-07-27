package Mang;

import java.util.LinkedList;
import java.util.Scanner;
public class J02017_thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        LinkedList<Integer> stack = new LinkedList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            int x = sc.nextInt();
            if (stack.isEmpty()) stack.push(x);
            else {
                int a = stack.poll();
                if ((a + x) % 2 != 0){
                    stack.push(a);
                    stack.push(x);
                }
            }
        }
        System.out.println(stack.size());
    }
}
