package Baekjoon10828;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		if (n<1 || n>10000){
			System.exit(0);
		}
		int pointer=-1;
		ArrayList<Integer> stack=new ArrayList<Integer>();
		
		for (int i=0;i<n;i++ ){
			String op= scanner.next();
			switch (op){
				case "push":
					pointer++;
					int pushNum = scanner.nextInt();
					if (pushNum<1 || pushNum>100000){
						System.exit(0);
					}
					stack.add(pointer, pushNum);
					break;
				case "pop":
					if (pointer==-1) System.out.println(pointer);
					else{
						System.out.println(stack.get(pointer));
						pointer--;
					}
					break;
				case "size":
					System.out.println(pointer+1);
					break;
				case "empty":
					if (pointer==-1) System.out.println(1);
					else System.out.println(0);
					break;
				case "top":
					if (pointer==-1) System.out.println(-1);
					else System.out.println(stack.get(pointer));
					break;
				}		
			}
	}	
}