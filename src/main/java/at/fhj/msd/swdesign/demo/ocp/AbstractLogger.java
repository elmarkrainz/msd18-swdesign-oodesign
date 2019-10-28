package at.fhj.msd.swdesign.demo.ocp;

public abstract class AbstractLogger {

    //1. closed for Modification
    // ** stuff for reuse
    protected String sysInfos = "System MSD";

    // not to modify


    //2. open for extension
    abstract void log(String logMessage);


}
