package array_1_2_dimension;

import java.util.Scanner;


public class Ex05 {
	
	
	
	public int solution(int count) {
		int answer = 0;
		
		//count까지의 소수 개수
		for(int i= 2; i<count ; i++) {
			if(!(count % i == 0)) {
					
			}
		}
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex05 T = new Ex05();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    System.out.println(T.solution(count));
	}
	
		
}
