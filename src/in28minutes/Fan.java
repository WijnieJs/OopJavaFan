package in28minutes;

public class Fan {

    private String make;
    private double radius;
    private String color;
    private Boolean isOn = false;
    private int speed;


    public Fan(String make, double radius, String color ) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }
    public void switchOn() {
        this.isOn = true;
    }
    public void switchOf() {
        this.isOn = false;
    }

    public void changeSpeed(int speed) {
        this.speed = speed;
    }
    public String toString() {
        return String.format("make - %s, radius  - %f, color - %s" ,
                make, radius, color);
    }
}
