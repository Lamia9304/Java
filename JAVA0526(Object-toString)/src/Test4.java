
public class Test4 {

	
	/*
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		 char chArr[]={'A','b','5',' ','#'};
		 
		 for(int i=0; i<chArr.length;i++) {
			 
			if(Character.isUpperCase(chArr[i])) {
				System.out.println("대문자");
			}else if(Character.isLowerCase(chArr[i])) {
				System.out.println("소문자");
			}else if(Character.isDigit(chArr[i])){
				System.out.println("숫자");
			}else if (Character.isWhitespace(chArr[i])) {
				System.out.println("공백 문자");
			}else {
				System.out.println("기타문자!");
			}
		 }
	}
	

}
