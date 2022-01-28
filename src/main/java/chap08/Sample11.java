package chap08;

public class Sample11 {
	
	void localMethod() {
		int age = 30;
		
		class LocalClass {
			public void howOldAreYou() {
				System.out.printf("훈정이는 %d살", age);
			}
		}
		
		LocalClass innerClass = new LocalClass();
		innerClass.howOldAreYou();
	}
	
	public static void main(String[] args) {
		Sample11 outer = new Sample11();
		outer.localMethod();
	}
}
