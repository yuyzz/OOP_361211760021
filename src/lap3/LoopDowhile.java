package lap3;

import java.util.Scanner;

public class LoopDowhile {
    public static void main(String[] args) {
        //do-while -> ทำงานเช่นเดียวกับ while แต่จะทำคำสั่งในลูปก่อน 1 ครั้งเสมอจำงทดสอบเงื่อนไข
        //ดังนั้นจะหมายความว่า ไม่ว่าเงื่อนไขจะเป็นจริงหรือเท็จ คำสั่งในลูปจะถูกทำงานแล้วอย่างน้อย 1 ครั้ง

        //do
        //   คำสั่งเมื่อเงื่อนไขเป็นจริง;
        // } while (เงื่อนไข);

        Scanner Sc= new Scanner(System.in);
        int x =1;
        do {
            System.out.print("Enter an number: ");
            x = Sc.nextInt();
        }while (x !=0);

        System.out.println("Good bye.");

        }
    }
