package lap2;

import lap1.Hello;

public class basicjava1 {
    public static void main(String[] args) {

        //variables
        //integer
            int x;
            x=10;
            System.out.println(x);
            int y= -100;
            System.out.println(y);

            System.out.println(x+y);
            //floating
        float f = 10.00f;
        double d = 100.12345;
        System.out.println(f);
        System.out.println(d);
        double n = f * d;
        System.out.println(n);
        //charector
        char c = 'h';
        System.out.println(c);
        System.out.println(c+ "Hello");

        //String
        String s = "romnailn chimnu";
        System.out.println(s);
        String msg = "@ Saiyai";
        String t = s +msg;
        System.out.println(t);
        System.out.println(t.length());

        System.out.println(s.concat(msg));

        System.out.println(t.toUpperCase()); //ตัวพิมใหญ่

        System.out.println();
    }

}//class
