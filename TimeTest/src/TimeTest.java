import java.time.LocalTime;

public class TimeTest {
    public static void main(String[] args) {
        LocalTime ltime = LocalTime.now();

        if (ltime.getHour() == 23 ) {
            System.out.println("zeit stimmt " + ltime);
        }else {
            System.out.println("zeit stimmt nicht");
        }
    }
}
