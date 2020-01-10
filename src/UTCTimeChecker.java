import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UTCTimeChecker {

    public static void main(String[] args){

        LocalDateTime localDateTime = new LocalDateTime.parse("dd/MM/yyyy", DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
    }
}
