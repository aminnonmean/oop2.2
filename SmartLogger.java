import java.time.LocalDateTime;

public class SmartLogger implements logger {
    private int crt = 1;
    String msgInfo = "INFO";
    String msgError = "ERROR";

    @Override
    public void log(String msg) {
        if (msg.equalsIgnoreCase("error")) {
            System.out.printf("%s %d" + " [" + LocalDateTime.now() + "] %s\n", msgError, crt, msg);
            crt += 1;
        } else {
            System.out.printf("%s %d" + " [" + LocalDateTime.now() + "] %s\n", msgInfo, crt, msg);
            crt += 1;
        }
    }
}
