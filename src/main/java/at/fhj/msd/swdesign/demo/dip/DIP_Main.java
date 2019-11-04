package at.fhj.msd.swdesign.demo.dip;


public class DIP_Main {

    public static void main(String[] args) {

        Button button = new Button(new Sensor());

        button.press();
        button.press();
        button.press();
        button.press();

        // DIP

        DIPButton dipButton = new DIPButton(new DIPSensor());

        dipButton.press();
        dipButton.press();
        dipButton.press();
        dipButton.press();



    }
}
