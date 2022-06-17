
public class Test_220617_서장원_문제1 {

	public static void main(String[] args) {

		String id = "admin";
		String jumin = "901010-1234567";
		String company = "아이티윌 부산 교육센터";

		if (id.compareToIgnoreCase("ADMIN") == 0) {
			System.out.println("아이디가 일치합니다.");

		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}

		char genderNum = jumin.charAt(7);

		// if문을 사용하여 판별
		if (genderNum == '1' || genderNum == '3') {
			System.out.println("남성입니다.");
		} else if (genderNum == '2' || genderNum == '4') {
			System.out.println("여성입니다.");
		} else if ((genderNum == '5' || genderNum == '6')) {
			System.out.println("외국인입니다.");

		}
		
	
		
		
		System.out.println(company.substring(company.indexOf('부'),company.indexOf('부')+2));
	}
}
