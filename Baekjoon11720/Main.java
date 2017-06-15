package Baekjoon11720;

import java.util.Scanner;

public class Main {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		int N = scanner.nexts
		if (N<1 || N>100 ){
			System.exit(0);
		}
		
		int array = scanner.nextInt();
		int sum=0;
		
		for (int i=0;i<N;i++){
			sum=sum+array%10;
			array = (array-array%10)/10;
		}
		
		System.out.println(sum);
	}
}
