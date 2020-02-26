package lap8_2;

public class Police extends Person {
    private String workcountry;

    public Police(String name, String dateofBirth,String workcountry) {
        super(name, dateofBirth);
        this.workcountry = workcountry;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I work at"+this.workcountry);
    }
    //getter and setter

    public String getWorkcountry() {
        return workcountry;
    }

    public void setWorkcountry(String workcountry) {
        this.workcountry = workcountry;
    }
    //toSering

    @Override
    public String toString() {
        return "Police{" +
                "workcountry='" + workcountry + '\'' +
                "} " + super.toString();
    }

}//class

