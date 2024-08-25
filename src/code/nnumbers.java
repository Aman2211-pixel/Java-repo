package code;

import java.util.Scanner;

public class nnumbers {
    public static void main(String[] args) {
    // print the num 1 to n
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= in.nextInt();
        for (int num=1;num<=n;num++){
            System.out.println(num+" ");
            System.out.println("hello world");
        }
      in.close();
    }
}
