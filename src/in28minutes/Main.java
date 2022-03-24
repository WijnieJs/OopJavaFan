package in28minutes;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Fan fan = new Fan("Ja", 3.2, "red");



        fan.switchOn();
        fan.changeSpeed(1);

        System.out.println(fan.toString());
    }
}
