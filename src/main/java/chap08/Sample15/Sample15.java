package chap08.Sample15;


public class Sample15 {

	public static void main(String[] args) {
		Student.Score score = new Student.Score("훈정");
		score.eng = 35;
		score.mat = 39;
		
		score.showInfo();
	}
}
