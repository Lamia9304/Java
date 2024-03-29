import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장한 후
		 * 해당 문자열에 대한 간단한 암호화 작업
		 * - 문자열을 분리하여 저장한 배열을 메서드 encrypt()에 전달
		 * - 전달받은 배열의 문자에 대해 아스키코드값 3만큼 증가한 문자를
		 *   별도의 배열에 저장 후 문자열로 변환하여 리턴
		 *   ex) 'A'(65) => 'D'(68)
		 *   ex) "Hello" -> 'H', 'e', 'l', 'l', 'o' 형태로 배열에 저장됨
		 *        암호화 작업 결과물 : 'K', 'h', 'o', 'o', 'r'
		 *        리턴되는 데이터: "Khoor"
		 */
		
		String str = "admin123";
		
		// String 타입 문자열을 char 타입 배열로 변환 : toCharArray() 사용
		char[] chArr = str.toCharArray();
				
		// Test인스턴스를 생성
		Test ex = new Test();
		// => 만약, encrypt() 메서드를 정적 메서드로 설정한다면 
		//    참조변수를 통하지 않고도 접근 가능
		
		// encrypt() 메서드 호출
		String encryptResult = ex.encrypt(chArr);
		
		// 암호화 전 : [a, d, m, i, n, 1, 2, 3]
		System.out.println("암호화 전 : " + Arrays.toString(chArr));
		// 암호화 후 : [d, g, p, l, q, 4, 5, 6]
		System.out.println("암호화 후 : " + encryptResult);
		
	}
	
	public String encrypt(char[] chArr) {
		// encrypt() 메서드를 호출하여 배열을 전달하고
		// 리턴되는 배열을 전달받아 반복문으로 모든 문자 출력
		// - 전달받은 배열 내의 모든 문자 값에 +3을 수행하여 새 배열에 저장 후 문자열로 결합하여 리턴
		// - 전달받은 배열의 크기를 새 배열 크기로 지정
		char[] encryptedArr = new char[chArr.length];
		
		for(int i = 0; i < chArr.length; i++) {
			encryptedArr[i] = (char)(chArr[i] + 3);
		}
				
//		return Arrays.toString(encryptedArr);
		// => 결합한 문자열 형태 [ ] 로 표현
		
		// char[] 배열을 문자열로 변환
		// 1. 새 인스턴스 생성
//		String str = new String(encryptedArr);
		
		// 2. String 클래스의 valueOf() 메서드 또는 copyValueOf() 메서드 활용
//		String str = String.valueOf(encryptedArr);
		String str = String.copyValueOf(encryptedArr);
		return str;
	
	}

}






