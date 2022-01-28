package chap09;

public class Sample06 {

	public static void main(String[] args) {
		Villa a = new Villa();
		float area = a.compute(30); //30평
		System.out.printf("빌라의 면적은 %f 제곱미터입니다.", area);
		
		area = a.toPyung(area);
		System.out.printf("%n%n빌라의 면적은 %f 제곱미터입니다.", area);
		
	}
}

class Villa implements IExcute{
	
	@Override
	public float compute(int area) {
		//평을 제곱미터로 환산
		//	pyung++;	
		return area * pyung;
	}
}


abstract interface IExcute{
	
	float pyung = 3.3f;
	float compute(int area);
	default float toPyung(float area) {
		return area / pyung;
	}
}