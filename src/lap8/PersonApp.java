package lap8;

public class PersonApp {
    public static void main(String[] args) {
        //create object
        Student std1 = new Student("1234567899999",
                "Romnalin Chimnu",
                "STD021",
                "Information Tecnology");
        Person p1 =new Person("0000000000000","Piyapong Senaus");

        System.out.println(std1.getName());
        System.out.println(p1.getName());
    }
}
