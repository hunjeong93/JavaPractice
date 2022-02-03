package chap12;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Test2 {

	public static void main(String[] args) {
		Season[] seasonSet = Season.values();
		for(Season season : seasonSet) {
			System.out.printf("%s\n%s%s\n"
					,season.name()
					,season.getHan()
					,season.getEng());
		}
	}

}

@AllArgsConstructor
@Getter
enum Season {
	SPRING("봄","(Spring)"),
	SUMMER("여름","(Summer)"),
	FALL("가을","(Fall)"),
	WINTER("겨울","(Winter)");
	
	private final String han;
	private final String eng;
}
