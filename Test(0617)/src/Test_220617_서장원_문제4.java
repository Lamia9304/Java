import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_220617_서장원_문제4 {
	
	public static void main(String[] args) {
		
		 String regExpPw = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9ㄱ-힣]).{8,20}$";
		
		Scanner sc= new Scanner(System.in);
		
		String input=sc.nextLine();
		boolean matcher=regExpPw.matches(input);
		
		System.out.println(matcher);
		
		
	}
	

	
}