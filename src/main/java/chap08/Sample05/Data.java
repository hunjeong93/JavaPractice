package chap08.Sample05;

public class Data {
	String name;
	int age;
	
	public Data() {
		System.out.println("Data 초기화합니다.");
		this.name="이지은";
		this.age=30;
				
	}
	
	/**
	 * 초기화 된 내용을 출력하기 위한 메서드
	 */
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
}
