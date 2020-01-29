package lap6;

public class exString {
    //String เป็นข้อมูลชนิดข้อความ แต่ในภาษาจาวา String  เป็นคลาส
    //ดังนั้นการประกาศตัวแปรชนิด String (เป็นการประกาศ Object ของคลาส)
    //จึงสามารถเรียกใช้เมธอดต่างๆ ที่อยู่ในคลาส String ได้
    public static void main(String[] args) {
        String msg = "Hello, Saiyai !!!";

        //lengch()ใช้ในการนับจำนวนตัวอักษรในข้อความ ส่งค่ากลับมาเป็ฯจำนวนเต็ม (int)
        int len = msg.length();
        System.out.println(len);

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5)); // แสดงตัวอักษรตำแหน่งที่ 5 ของข้อความ

        //concatenating String คือ การต่อข้อความ
        //1.ใช้เครื่องหมาย +
        String msg2 = "RUTS";
        String msgCon =msg + msg2;
        System.out.println(msgCon);
        //2. ใช้ concet ()
        String msgCon2 = msg.concat(msg2);
        System.out.println(msgCon2);


        //compare String คือ การเปรียบเทียบข้อความ 2 ข้อความ
        String m1 = "Saiyai RUTS";
        String m2 = "Saiyai";

        //1.ใช้เครื่องหมาย == เหมือนกัน true ต่างกันเป็น false

        if (m1 == m2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(m1==m2? "Yes":"No");


        //2. equals()การทำงานจะเหมือนกับการใช้เครื่องหมาย ==
        if (m1.equals(m2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(m1.equals(m2)? "Yes":"No");


        //3. compareTo() ถ้าข้อความเหมือนเป็น 0, ข้อความซ้ายมากกว่าเป็น 1, ข้อความขวามากกว่าเป็น -1

//        String m1 = "Saiyai RUTS";
//        String m2 = "Saiyai RUTS";
        int  x = m1.compareTo(m2);
        System.out.println(x);

    }
}
