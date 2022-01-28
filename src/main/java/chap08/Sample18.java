package chap08;

public class Sample18 {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("지은", 30, 2);
		students[1] = new Student("은지", 29, 1);
		students[2] = new Student("훈정", 30, 2);
		
		
		for(Student student : students) {
			System.out.println(student.toString());
		}
	}
}
