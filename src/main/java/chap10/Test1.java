package chap10;

import lombok.Builder;

public class Test1 {
	public static void main(String[] args) {
		Person iu = Person.builder()
							.name("이지은")
							.age(30)
							.hight(161)
							.weight(48)
							.phone("010-1234-5678")
							.build();
		System.out.println(iu.toString());
		
							
		
	}
}

class Person {
	private String name;
	private int age;
	private int hight;
	private int weight;
	private String phone;
	
	@Builder
	public Person(String name, int age, int hight, int weight, String phone) {
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
		this.phone = phone;
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hight=" + hight + ", weight=" + weight + ", phone=" + phone
				+ "]";
	}
	
}