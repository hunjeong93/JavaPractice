package chap02;

public class Sample14 {
	public static void main(String[] args) {
		final float PI; //정의하지 않고 PI를 상수로 선언했다.
		PI = 3.14f; // 최초 값을 선언. 이후 PI 값 변경 시 오류발생
		//PI = 3.14f; The final local variable PI may already have been assigned
		
		int radius = 10;
		
		float area = radius * radius * PI;
		
		System.out.printf("원의 넓이 : %f", area);
	}
}
