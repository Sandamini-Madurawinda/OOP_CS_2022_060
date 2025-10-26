import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_06 {
    public static void main(String[] args) {
         Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));

    }
}
