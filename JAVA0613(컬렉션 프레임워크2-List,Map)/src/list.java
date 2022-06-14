import java.util.ArrayList;
import java.util.List;

public class list {

		public static void main(String[] args) {
			
			/*
			 * 
			 * 2. List 계열
			 * - 저장 데이터의 순서 유지 0, 중복 허용 0
			 * - 저장되는 데이터는 저장 시점에서 자동으로 인덱스가 부여됨
			 * => 배열과 동일하게 인덱스 번호가 0번부터 시작
			 * - 기본적인 메서드 대부분 Set
			 * => 단, 인덱스를 활용하는 메서드가 많음
			 * - 대표적인 구현체 클래스 : ArrayList, Vector, LinkedList 등
			 * - Collections 클래스의 메서드를 통해 List 객체의 부가적인 처리 가능
			 * (sort 및 shuffle 기능 등 제공)
			 * 
			 * 
			 * 
			 */
			
//			List<int> List=new ArrayList();
			// <>: 제네릭(generic) 타입을 강제하여 원하는 타입의 값을 저장하기 위해 사용
			// <> 안에는 기본데이터타입을 사용할 수 없고 참조형 타입만 사용 가능
			// => Syntax error, insert "Diemensions" to complete ReferenceType
			// => int형을 참조타입으로 지정하려면 wrapper를 사용
			// => int -> Integer
			List<Integer> list=new ArrayList<Integer>();
			
			list.add(1);
			list.add(2);
			list.add(3);
			
			
			System.out.println("list 객체가 비어 있는가? "+ list.isEmpty());
			System.out.println("list 객체에 저장된 요소 개수: "+list.size());
			
			System.out.println("중복 데이터 3을 추가 가능한가? "+ list.add(3));
			}
		
		
		
}
