package array_1_2_dimension;

import java.util.Scanner;


public class Ex05 {
	
	
	
	public int solution(int count) {
		int answer = 0;
		
		if(count==2) {
			answer = 1;
		}else {
			answer ++;
		}
		for(int i= 3; i<count ; i++) {
			for(int j = 2 ;j<i;j++ ) {
				if(i%j==0) {
					break;
				}else if((j == i-1) &&(i%j!=0))
					answer ++;
				
				
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
