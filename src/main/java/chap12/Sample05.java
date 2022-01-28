package chap12;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Sample05 {

	public static void main(String[] args) {
		FLOWER flower = FLOWER.ROSE;
		System.out.printf("I have a %s", flower.getName());
	}
}


@RequiredArgsConstructor
@Getter
enum FLOWER {
	SUNFLOWER("sunflower"), ROSE("rose"); //세미콜론 필수
	
	private final String name;
	
	/**
	private FLOWER(String flowerName) {
		this.name = flowerName;
	}
	
	public String getName() {
		return name;
	}
	*/
}