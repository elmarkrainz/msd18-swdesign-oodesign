package at.fhj.msd.swdesign.demo.dip;

public class DIPButton {

    private boolean on;
    private Switchable switchableSensor;


    public DIPButton(Switchable sensor) {

        switchableSensor = sensor;
        this.on = false;
    }


    public boolean isOn() {
        return this.on;
    }


    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            switchableSensor.turnOff();
            this.on = false;
        } else {
            switchableSensor.turnOn();
            this.on = true;
        }
    }
}
