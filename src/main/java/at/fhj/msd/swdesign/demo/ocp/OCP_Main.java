package at.fhj.msd.swdesign.demo.ocp;

public class OCP_Main

{
    public static void main(String[] args) {


        Logger logger = new Logger();
        logger.setLogType(Logger.LOG_TYPE_CONSOLE);
        logger.log("program start");
        logger.log("program do");
        logger.log("program end");


        // New Logger with abstract base-class


    }


}


