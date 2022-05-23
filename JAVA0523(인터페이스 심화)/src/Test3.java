
public class Test3 {
 public static void main(String[] args) {

	Photoshop p= new Photoshop();
	p.draw(new Circle());
	p.draw(new Rectangle());
	
	
}
 
 
 
}

// -------------------------------------

// 모든 도형의 그리기 기능을 제공하는 Shape 인터페이스 정의


interface Shape{
	

	// => draw() 추상 메서드 정의 (리턴값 없음, 파라미터 값 없음)
	public void draw();
}

// Shape 인터페이스를 구현하는 Circle, Rectangle 클래스 정의
//=> 추상메서드 draw()를 오버라이딩하여 각자 도형 그리기 기능을 구현
//ex) Circle은 "원 그리기! ", Rectangle은 "사각형 그리기!" 출력



/*
 * Circle 클래스 멤버
 *  -실수형 radius 멤버변수(접근제한자: private)
 *  -Setter() 메서드 정의
 *  -draw() 출력: "원 그리기! -반지름: radius에 저장된 값"
 *  
 *
 *Rectangle 클래스 멤버
 *- 실수형 멤버변수 width(가로), height(세로) 두 멤버 변수 모두 접근제한자:private
 * -Setter() 메서드 정의
 * -draw() 출력: "가로: width값, 세로: height값 의 사각형 그리기!"
 *
 *
 *
 */

class Circle implements Shape{

	
	
	double radius;
	@Override
	public void draw() {
		System.out.println("원 그리기! -반지름: "+radius);
	}




	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}




class Rectangle implements Shape{
	
	private double width,height;
	

	public void setWidth(double width) {
		this.width = width;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public void draw() {
		System.out.println("가로: "+width+"세로: "+ height+"의 사각형 그리기!");
	}
	
}


class Photoshop{
	
    public void draw(Shape shape) {
    	
    	shape.draw();
    	
    	
    }
	
	
}





