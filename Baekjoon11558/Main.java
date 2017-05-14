package Baekjoon11558;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt(); // Test case number
		
		for (int t=0; t<T; t++){ // Start test case
			
			int N = scanner.nextInt(); // the number of player
			if (N<1 || N>10000) System.exit(0); // exception 
			
			ArrayList<Integer> array=new ArrayList<Integer>();
			
			for (int i=0; i<N; i++){
				int pointNum = scanner.nextInt(); // Number what player points out
				if (pointNum <1 || pointNum>N) System.exit(0); // exception
				array.add(i, pointNum);
			}
			int count=0;
			int currentNum=0;
			
			while (count<N){
				if (array.get(currentNum)==N){
					System.out.println(count+1); 
					break;
				}
				else{
					count++;
					currentNum = array.get(currentNum)-1;
				}
			}
			if (count == N) System.out.println(0);
		}
		scanner.close();
	}
}
