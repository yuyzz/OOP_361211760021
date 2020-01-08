package lap4;

public class MethodsEx {

    //1.No return No parameter : คือ เมธอดที่ไม่มีการับค่าพารามิเตอร์
    // และไม่คืนค่าใดหลังจาก process แล้ว
    //2.No return I or more parameter : คือ เมธอดที่มีการรับพารามิเตอร์ตั้งแต่ 1 หรือมากกว่า
    //และไม่คืนค่าใดกลับหลังจาก process แล้ว
    //3.Return 1 value,1 or more parameter : คือ เมธอดที่มีการรับค่าพารามิเตอร์ตั้งแต่1 หรือมากกว่า
    //และมีการคืนค่ากลับไปยังส่วนที่เรียกใช้งาน (เรียกใช้จากที่ไหน คืนค่าไปที่นั่น)
    public static void main(String[] args) {      //mainเป็นคำสั่งที่เรียกใช้งานก่อนเสมอ

        System.out.println("Hello from main().");
        //ce;;ing method A()
        A();
        A();
        A();
        //calling method B()
        B("MIT","RUTS");
        //calling method C()
        //1.ประกาศตัวแปรชนิดเดียวกันมาเก็บค่าที่เมธอดส่งกลับมาให้
        int summation = C(10,20);
        System.out.println("The summation of x and y :"+summation);
        //2. เรียกใช้เมธอดโดยไม่ประกาศตัวแปรใด มาเก็บค่าที่ส่งกลับมา
        System.out.println("The summation of x and y (2):"+C(50,50));

    }//main
    public static void A(){
        System.out.println("Hello from A().");
    }//A
    public static void B(String msg,String msg2){
        System.out.println("Hello from B().");
        System.out.println("Message:"+msg);
        System.out.println("Message2:"+msg);

    }//B

    public static int C(int x, int y){
        System.out.println("Hello from C().");
        int sum = x+y;
        return sum;
    }
}//class
