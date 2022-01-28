package chap08;

public class Sample17 {

	public static void main(String[] args) {
		Student st = new Student("훈정", 30, 1);
		System.out.println(st.toString());

	}

}


class Student {
	String name;
	int age;
	int grade;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}