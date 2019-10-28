package at.fhj.msd.swdesign.demo.ocp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * BAD EXAMPLE
 * <p>
 * Logger does to much
 */

public class Logger {


    public static final int LOG_TYPE_CONSOLE = 0;
    public static final int LOG_TYPE_File = 1;

    private int logType;

    public Logger() {

    }

    public void setLogType(int logType) {
        this.logType = logType;
    }

    public void log(String logMessage) {

        switch (logType) {

            case LOG_TYPE_File:
                // log to file
                logToFile(logMessage);
                break;
            case LOG_TYPE_CONSOLE:
                // log to Console
                logToConsole(logMessage);
                break;
            default:
                // log to somewhere
                break;
        }
    }

    private void logToConsole(String logMessage) {
        System.out.println(logMessage);
    }

    private void logToFile(String logMessage) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("logfile.txt", true);

            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf(logMessage);
            printWriter.printf("\n");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
