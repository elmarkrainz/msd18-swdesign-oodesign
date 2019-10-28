package at.fhj.msd.swdesign.demo.ocp;

public class ConsoleLogger extends  AbstractLogger{


    void log(String logMessage) {
        System.out.print(this.sysInfos);  // von basislasse
        System.out.println("LOGGING: " + logMessage);
    }
}
