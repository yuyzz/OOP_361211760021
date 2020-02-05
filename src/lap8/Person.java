package lap8;

public class Person {
    private String id;
    private String name;

    //constructor
    //public Person(){
    // }

    public  Person (String id,String name){
        this.id =id;
        this.name =name;
    }
    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString()

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}//class
