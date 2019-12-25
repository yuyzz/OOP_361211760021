package lap3;

import java.util.Scanner;

public class ExerciseLab3 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("  Enter an number 1:");
        double num1 = SC.nextDouble();
        System.out.print("Enter an number 2:");
        double num2 = SC.nextInt();

        //test condition
        if (num1<num2) {
            System.out.println(num1+"moer than"+num2);
        }else {
            System.out.println(num1+"less than"+num2);


        }
    }//main
}//class
