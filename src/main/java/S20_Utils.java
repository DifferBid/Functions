
import java.util.Date;

public class S20_Utils {

    public static boolean isSaturday(Date date) {
        return date.getDay() == 6;
    }

    public static void todayIsSaturday(){
        Date date = new Date();
        boolean saturday = isSaturday(date);
        System.out.println("Сегодня суббота? " + saturday);
    }

    public static void main(String[] args) {
        todayIsSaturday();
    }

}

