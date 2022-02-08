package Chap13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sample06 {

	public static void main(String[] args) {
		System.out.println("금액을 입력");
		Scanner sc = new Scanner(System.in);
		double myMoney = sc.nextInt();
		
		DecimalFormat df = new DecimalFormat("(수익)##,###,##0;(손실)##,###,##0");
		System.out.println(df.format(myMoney));

	}

}
