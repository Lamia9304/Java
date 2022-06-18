import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_220617_서장원_문제4 {

	public static void main(String[] args) {

		String engUpperRegex = "[A-Z]"; // 대문자
		String engLowerRegex = "[a-z]"; // 소문자

		// 숫자를 판별하는 정규표현
		String numRegex = "[0-9]";

		// 특수문자(!@#$%) 판별하는 정규표현식
		String specRegex = "[!@#$%]";

		String regExpPw = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9ㄱ-힣]).{8,20}$";

		String lengthRegex = "^[A-Za-z0-9!@#$%]{8,16}$";

//		Scanner sc= new Scanner(System.in);

		// String input=sc.nextLine();
		// boolean matcher=regExpPw.matches(input);

		// System.out.println(matcher);

		while (true) {
			System.out.println("패스워드 입력: ");
			Scanner sp = new Scanner(System.in);
			String password = sp.next();

			int securityLevel = 0;

			if (Pattern.matches(lengthRegex, password)) {
				if (Pattern.compile(engUpperRegex).matcher(password).find()) {

					securityLevel++;
				}

				if (Pattern.compile(engLowerRegex).matcher(password).find()) {

					securityLevel++;
				}

				if (Pattern.compile(numRegex).matcher(password).find()) {

					securityLevel++;
				}

				if (Pattern.compile(specRegex).matcher(password).find()) {

					securityLevel++;
				}

			} else {
				System.out.println(password + " : 영문자,숫자,특수문자 조합 8~16자 필수!");
			}

			switch (securityLevel) {
			case 4:
				System.out.println("안전!");
				break;
			case 3:
				System.out.println("보통!");
				break;
			case 2:
				System.out.println("위험!");
				break;
			case 1:
				System.out.println("사용 불가능한 패스워드!");
				break;
			}

		}

	}

}
