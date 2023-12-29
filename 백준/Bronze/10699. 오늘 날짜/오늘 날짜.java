import java.text.SimpleDateFormat;
import java.util.Date;

class Main{
    public static void main(String[] args) {
        SimpleDateFormat x = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(x.format(new Date()));
    }
}