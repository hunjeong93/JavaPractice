package chap12;

public class Sample03 {

	public static void main(String[] args) {
		Color1 inputColor = Color1.RED;
		Size1 inputSize = Size1.MIDIUM;
		System.out.println(inputColor.equals(Color1.RED) ? "Red" : "Not red");
		System.out.println(inputSize.equals(Size1.SMALL) ? "Small" : "Not Small");
	}

}

//색 집합
enum Color1 {
	RED, BLUE, ORANGE
}

//크기 집합
enum Size1 {
	SMALL, MIDIUM, LARGE;
}

