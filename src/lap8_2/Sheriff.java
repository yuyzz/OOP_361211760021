package lap8_2;

public class Sheriff extends Person {
    private String workstate;

    public Sheriff(String name, String dateofBirth,String workstate) {
        super(name, dateofBirth);
        this.workstate = workstate;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I work at"+this.workstate);
    }

    //getter and setter

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }
    //toString

    @Override
    public String toString() {
        return "Sheriff{" +
                "workstate='" + workstate + '\'' +
                "} " + super.toString();
    }
}




