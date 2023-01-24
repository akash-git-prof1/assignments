import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class _23_dateString {

	public static void main(String[] args) throws ParseException {
		
	    String sDate1="25/12/2022";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
	    System.out.println(sDate1+"\t"+date1);  

	}

}
