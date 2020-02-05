package lap7;

public class NoteBook {
    private String brand;
    private String mode1;
    private String cpu;
    private String gpu;
    private String ram;
    private String display;
    private String hdd;
    private String os;
    private double price;

    //constructor //การเจน กด Alt+Insert ค้างไว้

    public NoteBook() {

    }

    public NoteBook(String brand, String mode1, String cpu, String gpu, String ram, String display,
                    String hdd, String os, double price) {
        this.brand = brand;
        this.mode1 = mode1;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.display = display;
        this.hdd = hdd;
        this.os = os;
        this.price = price;
    }

    //getter and setter //การเจน กด Alt+Insert ค้างไว้

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMode1() {
        return mode1;
    }

    public void setMode1(String mode1) {
        this.mode1 = mode1;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //toString() -> Display data in object //การเจน กด Alt+Insert ค้างไว้

    @Override
    public String toString() {
        return "NoteBook{" +
                "brand='" + brand + '\'' +
                ", mode1='" + mode1 + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", display='" + display + '\'' +
                ", hdd='" + hdd + '\'' +
                ", os='" + os + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
