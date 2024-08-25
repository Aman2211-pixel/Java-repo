package code;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if (boolean expression T or F){
        // body
        }else
        {
        do this
        }
         */
//        int salary = 24500;
//        if (salary > 20000) {
//            salary=salary+2000;
//        }
//        else {
//            salary=salary+1000;
//        }
     // multiple if-else statement
//        if (salary > 10000) {
//            salary += 2000;
//        } else if (salary>20000) {
//            salary += 3000;
//
//        }else {
//            salary += 1000;
//        }
//        System.out.println(salary);
        //Switch statement:
        Scanner in = new Scanner(System.in);
        int dayofweek = in.nextInt();
        switch (dayofweek){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("unndfsnjifv");
                break;

        }
    }
}
