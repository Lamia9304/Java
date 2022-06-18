import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_220617_서장원_문제4 {
	
	public static void main(String[] args) {
		
		
		
		String engRegex="[a-zA-Z]"; // 영문자
		
		// 숫자를 판별하는 정규표현
		String numRegex = "[0-9]";
		
		//특수문자(!@#$%) 판별하는 정규표현식
		String specRegex = "[!@#$%]";
		
		 String regExpPw = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9ㄱ-힣]).{8,20}$";
		
		Scanner sc= new Scanner(System.in);
		
	//	String input=sc.nextLine();
		//boolean matcher=regExpPw.matches(input);
		
	//	System.out.println(matcher);
		
		Scanner sp = new Scanner(System.in);
		String password = sp.next();
		int securityLevel = 0;
		
		if(Pattern.matches(engRegex, password)) {
			System.out.println(password + " : 길이 규칙 적합!");
			if(Pattern.compile(engUpperRegex).matcher(password).find()) {
				System.out.println("영문자가 포함되어 있으므로 보안 등급 +1 증가");
				securityLevel++;
			}

			
			if(Pattern.compile(numRegex).matcher(password).find()) {
				System.out.println("숫자가 포함되어 있으므로 보안 등급 +1 증가");
				securityLevel++;
			}
			
			if(Pattern.compile(specRegex).matcher(password).find()) {
				System.out.println("특수문자가 포함되어 있으므로 보안 등급 +1 증가");
				securityLevel++;
			}
			
			
		} else {
			System.out.println(password + " : 길이 규칙 부적합!");
		}
		
		System.out.println("보안 등급은 " + securityLevel + "");
		
		switch(securityLevel) {
			case 4 : System.out.println("안전!"); break;
			case 3 : System.out.println("보통!"); break;
			case 2 : System.out.println("위험!"); break;
			case 1 : System.out.println("사용 불가능한 패스워드!"); break;
		}
		
		
	}
		
	}
	

	
}