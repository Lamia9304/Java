import java.util.Random;

public class Test_220104_서장원_문제1 {

	
	public static void main(String[] args) {
		
		Random r=new Random();
		int pee=50000;
		int age=r.nextInt(100);
		
		
		if(age<5&&age>=65) {
			pee=25000;
			System.out.println("나이가 "+ age+ "세이므로 입장료는 25000원입니다.");
		}else if(age>=5 && age<=19) {
			pee=35000;
			System.out.println("나이가 "+ age+ "세이므로 입장료는 35000원입니다.");
		}else {
			System.out.println("나이가 "+ age+ "세이므로 입장료는 50000원입니다.");
		}
		
		
		
		
		
		
	}
}




