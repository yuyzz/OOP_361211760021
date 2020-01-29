package lap7;

public class Dog {
    //Attributes คือ คุณลักษณะของวัตถุ
    private String name;
    private int age;
    private String hairColor;
    //constructor คือเมธอดที่มีชื่อเดียวกันกับชื่อคลาส เมื่อมีการสร้างวัตถุ จะเป็นดารเรียกใช้งาน แนืหะพีแะนพ เสมอ
    //1. default constructor
    public Dog(){}
    //2.constructor ที่สร้างขึ้นมาใหม่
    public Dog (String name,int age,String hairColor){
        this.name = name;
        this.age =age;
        this.hairColor = hairColor;

    }

    //Behavior คือ พฤติกรรมของวัตถุ
    public void barking (){
        System.out.println("Dog barking");
    }
    public void sleeping (){
        System.out.println("Dog sleeping");
    }
    public void eating (){
        System.out.println("Dog eating");
    }

    //getter and setter methods ใช้สำหรับการอ่านและปรับปรุงข้อมูลใน attributes ของคลาส
    //getter .ช้อ่านข้อมูล
    //setter ใช้ปรังปรุงหรือเปลี่ยนแปลงข้อมูล
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

}//class
