package low_level;

import abstraction.Switchable;

public class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan turned on...");
    }

    public void turnOff() {
        System.out.println("Fan turned off...");
    }
}
