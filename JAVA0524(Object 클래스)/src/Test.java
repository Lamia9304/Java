
public class Test {
	
	public static void main(String[] args) {
		
		/*
		 * String 객체(문자열) 생성 방법 두 가지
		 * 1. 리터럴 할당을 통해 생성하는 방법(일반적으로 사용하는 방법)
		 * 
		 * 			=> 상수풀(Constant Pool)에서 동일한 문자열이 존재하는지 검사 후 
		 * 			   존재하지 않으면 새로 생성하고, 존재하면 해당 주소 값을 리턴함
		 * 2. 일반적인 클래스 인스턴스를 생성하는 방법(new 연산자를 사용하는 방법)
		 *    => new 연산자에 의해 Heap 공간에 문자열 객체를 생성하며,
		 *       동일한 문자열을 가진 객체가 존재하더라도 무조건 새로 생성함.
		 */
		
		String s1="Hello";
		String s2="Hello";
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		
	}
}
