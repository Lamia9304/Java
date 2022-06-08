import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Format_ex {

	
	public static void main(String[] args) {
		
		
		Date date=new Date();
		
		
		Calendar calndar=Calendar.getInstance();
		
		String pattern="yyyy년 MM월 dd일 EEEE HH시 mm분";
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		System.out.println(sdf.format(date));
		
	}
	
}
