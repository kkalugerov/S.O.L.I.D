import abstraction.Switch;
import abstraction.Switchable;
import high_level.ElectricPowerSwitch;
import low_level.Fan;
import low_level.LightBulb;
import org.junit.Test;

public class ElectricPowerSwitchTest {

    @Test
    public void testPress() {
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}
