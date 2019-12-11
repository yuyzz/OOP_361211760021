package lap2;

import java.util.Scanner;

public class basicjava2 {
    public static void main(String[] args) {
        //input ชื่อ
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your name:");
       String name = sc.nextLine();
        System.out.print("your name is"+name);

        //input อีเมล์
        System.out.print("Enter your Email:");
        String Email = sc.nextLine();
        System.out.print("your name is"+Email);

        //input อายุ
        System.out.print("Enter your Age:");
        String Age = sc.nextLine();
       System.out.print("your number is "+Age);

        //input integer and floating
        System.out.print("Enter an number: ");
        int num = sc.nextInt();
        System.out.print("your entered number: +num");

        System.out.print("Enter a real number: ");
        double d = sc.nextDouble();
        System.out.print(d);
    }
}
