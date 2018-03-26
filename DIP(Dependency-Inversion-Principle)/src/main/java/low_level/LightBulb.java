package low_level;

import abstraction.Switchable;

public class LightBulb implements Switchable {

    public void turnOn() {
        System.out.println("LightBulb turned on...");
    }

    public void turnOff() {
        System.out.println("LightBulb turned off...");
    }
}
