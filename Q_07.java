import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        Date today=new Date();
        SimpleDateFormat date=new SimpleDateFormat("MMMM dd,yyyy");
        SimpleDateFormat day=new SimpleDateFormat("EEEE,") ;
        System.out.print(day.format(today));
        System.out.print(date.format(today));
    }
}
