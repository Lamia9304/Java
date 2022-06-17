
public class Test {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 문자열을 char[] 배열에 분리하여 저장한 후 
		 * 해당 문자열에 대한 간단한 암호화 작업
		 * - 문자열을 분리하여 저장한 배열을 메서드 encrypt()에 전달
		 * - 전달받은 배열의 문자에 대해 아스키코드값 3만큼 증가한 문자를
		 *   별도의 배열에 저장 후 문자열로 변환하여 리턴
		 *   ex) 'A'(65) => 'D'(68)
		 *   ex) "Hello" -> 'H','e','l','l','o' 형태로 배열에 저장됨
		 *        암호화 작업 결과물: 'K', 'h' , 'o', 'o', 'r'
		 *        리턴되는 데이터: "Khoor" 
		 *
		 * 
		 */
		
		String str="admin123";
		
		char []arr=str.toCharArray();
		
		System.out.println(arr);
		
		
		
		
		Test test=new Test();
		

		char  newArr[]=new char[arr.length];	
		newArr=test.encrypt(arr).toCharArray();
		
		for (int i=0; i<newArr.length;i++) {
			System.out.println(newArr[i]);
		}
		
//		for(int i=0;i<newArr.length;i++) {
//			System.out.println(newArr[i]);
//		}
		
	
		
		// String 타입 문자열을 char 타입 배열로 변환
		
		//Test인스턴스의 멤버인 encrypt() 메서드 호출
		// encrypt() 메서드를 호출하여 배열을 전달하고
		// 리턴되는 배열을 전달받아 반복문으로 모든 문자 출력
		// 암호화 전: [a,d,m,i,n,1,2,3]
		// 암호화 후: [d,g,p,l,q,4,5,6]
		
		
		/*
		 * 
		 * 
		 * 
		 */
	}
	
	
	String encrypt(char arr[]) {
		
		for(int i=0; i<arr.length;i++) {
			arr[i]+=3;	
		}
		String array=new String(arr);
		return array;
	}		
}




