package array_1_2_dimension;

import java.util.Scanner;


public class Ex07 {
	
	
	
	public int solution(int[] count) {
		int answer=0;
		int addition = 1;
		
		for(int i =0 ; i<count.length;i++) {
			if(count[i] == 1) {
				
				answer += addition;
				addition +=1;
			}
			else {
				addition = 1;
			}
				
		}
		
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex07 T = new Ex07();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    int[] score = new int[count];
	    for(int i =0 ;i< count ; i++) {
	    	score[i] = kb.nextInt();
	    }
	    System.out.println(T.solution(score));
	}
	
		
}
