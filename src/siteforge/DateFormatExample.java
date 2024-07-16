package siteforge;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
    	String formattedDate = new SimpleDateFormat("dd-MMMM-yy").format(new Date());
        System.out.println(formattedDate);
    }
}
