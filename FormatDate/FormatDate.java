import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

   public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.format(
                DateTimeFormatter.ofPattern("'Le' d MMM 'de l''an' yyyy 'à' HH'h'mm'm' 'et' ss's'", Locale.FRENCH));
    }

    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.format(DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN));
    }

    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null;
        }
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

}