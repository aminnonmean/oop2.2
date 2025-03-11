import java.time.LocalDateTime;

public class SimpleLogger implements logger {
    @Override
    public void log(String msg) {
        System.out.printf("["+LocalDateTime.now()+"] %s\n", msg);
    }
}
