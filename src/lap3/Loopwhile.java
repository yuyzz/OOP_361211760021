package lap3;

import java.util.Scanner;

public class Loopwhile {
    public static void main(String[] args) {

        //Loop while: ใช้สำหรับการทำงานซ้ำในกรณีที่ไม่ทราบจำนวนรอบที่แน่นอน
        //โครงสร้าง while
        //while (เงื่อนไข){
        //คำสั่งเมื่อเงื่อนไขเป็นจริง;
        // }

        Scanner SC = new Scanner(System.in);
        int x =1;

        while (x !=0){
            System.out.print("Enter an number :");
            x = SC.nextInt();
        }
        System.out.println("Good bye.");

    }//main
}//class
