package chap07;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.가위 , 2.바위 , 3.보자기 내고 싶은 숫자를 입력 0.종료 :");
		
		while(sc.hasNextInt()) {
			
			int my = sc.nextInt();
			if(my ==0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		
		int com = (int)(Math.random() * 3+1);
		System.out.printf("컴퓨터 %d\n", com);
		
		String result = (my - com)==0 ? "비김" : (my - com) == -1 ? "you lose" : "you win";
		System.out.println(result);
		System.out.print("짱 깬 뽀 ! :");
	
		sc.close();
		}
	}

}
