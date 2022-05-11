package array_1_2_dimension;

import java.util.Scanner;


public class Ex04 {
	
	
	
	public String solution(int count) {
		String answer="";
		int a = 1;
		int b = 1;
		int tmp = 0;
		answer += a + " ";
		answer += b + " ";
		
		for(int i = 3;i<=count ; i++) {
			tmp = a+b; 
			answer += tmp+ " ";
			a = b;
			b = tmp;
		}
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex04 T = new Ex04();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    System.out.println(T.solution(count));
	}
	
		
}
