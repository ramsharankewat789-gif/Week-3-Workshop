package Workshop;
class Lamp {
    private boolean isOn;
    public void turnOn() {
        isOn = true;
        System.out.println("Lamp is ON: " + isOn);
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Lamp is OFF: " + isOn);
    }
    public boolean getStatus() { return isOn; }
}
public class Question6 {
    public static void main(String[] args) {
        Lamp obj = new Lamp();
        obj.turnOn();
        obj.turnOff();
    }
}