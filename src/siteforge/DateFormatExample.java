package siteforge;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
    	String formattedDate = new SimpleDateFormat("dd-MMMM-yyyy").format(new Date());
        System.out.println(formattedDate);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        String fDate = sdf.format(new Date());
        System.out.println(fDate);
    }
}
