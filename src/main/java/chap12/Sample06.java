package chap12;

import java.util.EnumSet;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class Sample06 {

	public static void main(String[] args) {
		System.out.println("=== 우리 동물원에 있는 조류의 수 ===");
		EnumSet<BIRD> birds = EnumSet.allOf(BIRD.class); //모든 열거셋을 가져옴
		
		for(BIRD bird : birds) {
			System.out.printf("%s, %d 마리 \n", bird.getName(), bird.getCount());
		}
		
		
		/**
		System.out.printf("%s, %d 마리 \n", BIRD.SPARROW.getName(), BIRD.SPARROW.getCount());
		System.out.printf("%s, %d 마리 \n", BIRD.PARROT.getName(), BIRD.PARROT.getCount());
		System.out.printf("%s, %d 마리 \n", BIRD.EAGEL.getName(), BIRD.EAGEL.getCount());
		System.out.printf("%s, %d 마리 \n", BIRD.FALCON.getName(), BIRD.FALCON.getCount());
		*/
	}

}
@RequiredArgsConstructor
@Getter
enum BIRD{
	SPARROW("참새", 33), PARROT("앵무새", 27), EAGEL("독수리", 2), FALCON("매", 8);
	
	private final String name;
	private final int count;
	
	
	}
