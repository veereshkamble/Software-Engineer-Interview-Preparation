package HashTables;
import java.util.*;

public class Logger {

    public int timestamp;
    public String message;
    HashMap<String, Integer> loggerMap;

    /** Initialize your data structure here. */
    public Logger() {
        this.timestamp = 0;
        this.message = " ";
        this.loggerMap = new HashMap<String, Integer>();

    }

    public Logger(int timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {

        if(loggerMap.containsKey(message)) {
            int lastPrintedTime = loggerMap.get(message);
            if(timestamp - lastPrintedTime >= 10) {
                loggerMap.put(message, timestamp);
                return true;
            } else {
                return false;
            }
        } else {
            loggerMap.put(message, timestamp);
        }
        return true;
    }

    public static void main(String[] args) {
        Logger logger = new Logger();

        System.out.println(logger.shouldPrintMessage(1, "foo"));
        System.out.println(logger.shouldPrintMessage(2, "bar"));
        System.out.println(logger.shouldPrintMessage(3, "foo"));
        System.out.println(logger.shouldPrintMessage(8, "bar"));
        System.out.println(logger.shouldPrintMessage(10, "foo"));
        System.out.println(logger.shouldPrintMessage(10, "bar"));
        System.out.println(logger.shouldPrintMessage(10, "cat"));
        System.out.println(logger.shouldPrintMessage(12, "bar"));


    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
