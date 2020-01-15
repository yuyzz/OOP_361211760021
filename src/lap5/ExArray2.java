package lap5;

import java.util.Scanner;

public class ExArray2 {

    //user input data to array  ออกข้อสอบด้วยนะคะ เรื่องอาเรย์


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x[] =new int[5];

        //for
        for (int i = 0; i < x.length ; i++){
            System.out.print("Enter an integer :");
            x[i] = sc.nextInt();
        }

        //display data in array
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);

        //for
        System.out.println("Data in array:");
        for (int i =0; i< x.length ; i++){
            System.out.println(x[i]);
        }
        //foreach
        System.out.println("Data in array (foreach):");
        for (int val : x){  //x คืออาเรย์ ตัวแปล # อ่านค่าข้อมูลใน array ทีละตำแหน่งมาเก็บในตัวแปร val
            System.out.println(val);

        }

        ShowDataArray(x);
        totalDataArray(x);

    }//main
    private static void totalDataArray(int[] x){
        int total = 0;
        for (int val:x){
            total +=val;
        }
        System.out.println("The total value in array:" +total);
        System.out.println("The average value is:"+(total/x.length));
    }





    private static void ShowDataArray(int[]x){
        System.out.println("Data in array:");
        for (int i = 0; i <x.length; i++){
            System.out.println(x[i]);
        }
    }
    //สร้างเมธอดสำหรับแสดงผลรวมของข้อมูลทั้งหมดใน Array





}//class
