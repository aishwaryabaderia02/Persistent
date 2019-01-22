package Day3;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RepeatCalender {
	public static void main(String[] args) {
		
	String[] Week = {"Sun","Mon","Tues","Wed","Thus", "Fri","Sat"};
	int interval = 0;
	Calendar cal = Calendar.getInstance();
	cal.set(2000, 01, 01);
	int numDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println(cal.get(Calendar.DAY_OF_YEAR));
	
		for(int year = 2001 ;year < 2100 ; year++){
			
		Calendar calen = Calendar.getInstance();
		calen.set(year, 01, 01);
		int numOfDays = calen.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		//if(Week[d.getDay()].compareTo(Week[p.getDay()]) == 0){

		//	if(numDays == numOfDays){
		//		System.out.println(interval);
				interval = 0;
		//	}				

		}
		interval++;
		
	
	
	}
}
