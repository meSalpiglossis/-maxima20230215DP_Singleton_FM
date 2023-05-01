package singleton;

public class SingleLogger {

    private static SingleLogger sLogger;

    private SingleLogger() {
        System.out.println("singleton.SingleLogger constructor. New object: " + this.toString());
    }

    public static synchronized SingleLogger getLogger() {
        if (sLogger != null) {
            return sLogger;
        }

        return sLogger = new SingleLogger();
    }

    public void makeRecord (String data) {
        System.out.println(sLogger.toString() + " 'makeRecord' method call with parameter " + data);
    }
}
