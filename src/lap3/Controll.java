package lap3;

import java.util.Scanner;

public class Controll {
    public static void main(String[] args) {
        //if -> เป็นคำสั่งที่เลือกทำเมื่อเงื่อนไขเป็นจริงเท่านั่น
        //โครงสร้างคำสั่ง if
        //if (เงื่อนไข){
        //คำสั่งของ if จะทำงานเมื่อเงื่อนไขเป็นจริง
        // }
        //2คำสั่ง ใส่เครื่อง{}

        int x = 10;
        if (x<50) {
            System.out.println("Yes");
            System.out.println("Yes 2");
        }
        System.out.println("Good bye.");

        Scanner SC = new Scanner(System.in);
        System.out.print("How old are you? : ");
        int age = SC.nextInt();
        if (age > 60){
            System.out.println("Your are old (คุณแก่แล้ว)");
        }


    }//main
}//class


