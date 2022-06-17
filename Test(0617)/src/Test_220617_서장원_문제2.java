import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test_220617_서장원_문제2 {
	
	public static void main(String[] args) {
		Set<Integer> thisWeekLotto = new TreeSet<Integer>(Arrays.asList(35, 21, 29, 10, 3, 44));
		System.out.println("이번주 로또 1등 번호 : " + thisWeekLotto);
		
		Set<Integer> myLotto = new TreeSet<Integer>();
		
		// 1 ~ 45 사이의 난수(로또번호) 6개를 중복되지 않는 범위에서 저장
		Random r = new Random();
		for(int i = 1; i <= 6; i++) {
			int rNum = r.nextInt(45) + 1;
						
//			if(myLotto.contains(rNum)) { // myLotto 객체에 난수 rNum이 있으면
//				System.out.println("중복되는 번호 발생! - " + rNum);
//				// 중복 번호가 발생했으므로 카운팅을 하지 않도록 i를 1 감소
//				i--;
//			} else {
//				myLotto.add(rNum);
//			}
			
			if(!myLotto.add(rNum)) { // add() 메서드의 리턴값이 boolean, 추가되면 true 중복이면 false
				System.out.println("중복되는 번호 발생! - " + rNum);
				i--;
			} 
			
		}
		
		System.out.println("나의 로또 번호 : " + myLotto);
		
		/* 4. 기존의 myLotto 에 저장된 번호와 1등 당첨번호를 비교하여
		 *    일치하는 번호 개수와 등수 출력
		 *    => ex) 번호가 3개(11, 15, 23) 일치 시
		 *           "일치하는 번호 개수 : 3개(4등)"
		 *    => 6개 일치: 1등, 5개: 2등, 4개: 3등, 3개: 4등, 나머지는 꽝
		 */
		// 당첨번호가 일치하면 증가시킬 count 변수 선언 및 초기화
		int count=0;
		
//		// 1. 향상된 for문 사용
//		for(int num :myLotto ) { // 나의 로또 번호에서 번호 1개 꺼내기
//			// 꺼낸 번호와 1등 당첨 번호를 비교
//			if(thisWeekLotto.contains(num)) {
//			 count++;
//			 
//			}
//			
//		}
		
		// 2. Iterator 사용
		// 1) Iterator 객체 생성
		// 2) while문 사용 .hasNext(), .next() 메서드 활용
		Iterator<Integer>ite=myLotto.iterator();
		while(ite.hasNext()) {
			int num=ite.next();
			
			//꺼낸 번호와 1등 당첨 번호를 비교
			if(thisWeekLotto.contains(num)) {
				count++;
			}
		}
		
		// ================================================================
		// 카운팅 결과에 따른 로또 추첨 결과 출력
		switch(count) {
			case 6:
				System.out.println("1등");
				break;
			case 5:
				System.out.println("2등");
				break;
			case 4:
				System.out.println("3등");
				break;
			case 3:
				System.out.println("4등");
				break;
			default:
				System.out.println("꽝!");
			
		}

	}
	
	
}
