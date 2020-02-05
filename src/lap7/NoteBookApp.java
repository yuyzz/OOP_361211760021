package lap7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBookApp {
    public static void main(String[] args) {

        List<NoteBook> myList = new ArrayList<NoteBook>();
        System.out.println(myList);
        myList = AddNoteBook(myList);

        System.out.println(myList);
        myList = AddNoteBook(myList);
        System.out.println(myList);



    }//main

    private static List<NoteBook>AddNoteBook(List<NoteBook> myList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand");
        String brand = sc.nextLine();
        System.out.println("Enter model");
        String model = sc.nextLine();
        System.out.println("Enter CPU");
        String cpu = sc.nextLine();
        System.out.println("Enter GPU");
        String gpu = sc.nextLine();
        System.out.println("Enter RAM");
        String ram = sc.nextLine();
        System.out.println("Enter Display");
        String display = sc.nextLine();
        System.out.println("Enter HDD");
        String hdd = sc.nextLine();
        System.out.println("Enter OS");
        String os = sc.nextLine();
        System.out.println("Enter Price");
        double price = sc.nextDouble();

        //create object
        NoteBook np = new NoteBook(brand, model, cpu, gpu, ram, display, hdd, os, price);
        //add object into List
        myList.add(np);

        return myList;

    }
}//class
