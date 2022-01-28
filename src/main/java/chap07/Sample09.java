package chap07;

import java.util.Scanner;

public class Sample09 {

	public static void main(String[] args) {
		System.out.print("계절을 알고싶은 월을 입력하세요.(1~12) :");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		String season = switch(month) {
		case 12, 1, 2 	-> "겨울";
		case 3, 4, 5 	-> "봄";
		case 6, 7, 8 	-> "여름";
		case 9, 10, 11 	-> "가을";
		default 		-> "기후온난화";
		
		
		};
		System.out.println(season);

	}

}
