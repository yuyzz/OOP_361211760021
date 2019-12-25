package lap2;

import java.util.Scanner;
                                //คำนวณน้ำหนัก*ส่วนสูง
public class ExerciseLab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double w = sc.nextDouble ();
        System.out.print("Enter your height (Meter):");
        double h = sc.nextDouble();

        double bmi = w/(h*h);
        System.out.println("Your BMI is:" +bmi);

    }
}//class
