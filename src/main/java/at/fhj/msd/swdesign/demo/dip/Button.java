package at.fhj.msd.swdesign.demo.dip;


/**
 * BAD Example for DIP
 *
 * Button has direct connection to sensor
 *
 */
public class Button {

    private Sensor sensor;
    private boolean on;


    public Button(Sensor sensor) {
        this.sensor = sensor;
        this.on = false;
    }


    public boolean isOn() {
        return this.on;
    }


    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            sensor.turnOff();
            this.on = false;
        } else {
            sensor.turnOn();
            this.on = true;
        }
    }
}
