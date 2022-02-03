package chap12;

public class Test3_2 {

	public static void main(String[] args) {
		Compute1.PLUS.getResult(3, 4);

	}

}


enum Compute1{
	PLUS,MINUS,TIMES,DIVIDE;
	
	public void getResult(int a, int b) {
		switch(this) {
		case PLUS -> System.out.printf("%d + %d = %d", a, b, a+b);
		}
	}
}