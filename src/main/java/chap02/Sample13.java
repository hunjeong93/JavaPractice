package chap02;

/**
 * <p> var 을 이용해 자료형을 추론한다. </p>
 * <p> 첫 번쨰 p tag만 discription에 보여집니다.
 * @author 곽훈정 팀장
 *
 */
public class Sample13 {
	public static void main(String[] args) {
		// var name; //자료형을 추론할 때 리터럴이 없으면 추론할 수 없어서 에러가 발생
		var name ="나어때";
		var age = 28;
		var height = 159.9f;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 :" + height);
		
	}
	
	/**
	 * <p>생성자의 설명을 적습니다. </p>
	 * <p>아직 생성자를 배우지 않아서 뭔지 모릅니다. ??난 배움 ㅋ</p>
	 */
	public Sample13() {}
	
	/**
	 *<p>뭔가를 처리합니다.</p>
	 *<p>반환값은 없습니다.</p>
	 * @since 1.0
	 */
	public void doSomething() {
		
	}
}
