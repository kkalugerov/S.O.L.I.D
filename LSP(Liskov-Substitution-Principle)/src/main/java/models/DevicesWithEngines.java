package models;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class DevicesWithEngines extends TransportationDevice {
    Engine engine;

    public Engine getEngine(){
        return engine;
    };

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void startEngine() {};
}
