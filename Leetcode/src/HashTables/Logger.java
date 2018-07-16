package HashTables;
import java.util.*;

public class Logger {

    public int timestamp;
    public String message;

    /** Initialize your data structure here. */
    public Logger() {
        this.timestamp = 0;
        this.message = " ";
    }

    public Logger(int timestamp, String message) {
        this.timestamp = timestamp;
        this.message = message;
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        HashMap<String, Integer> loggerMap = new HashMap<String, Integer>();

        if(loggerMap.containsKey(message)) {
            int lastPrintedTime = loggerMap.get(message);
            if(timestamp - lastPrintedTime >= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            loggerMap.put(message, timestamp);
        }
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
