package array_1_2_dimension;

import java.util.Scanner;


public class Ex02 {
	
	
	
	public int solution(int[] num) {
		int answer = 1; 
		int max = num[0];
		
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
				answer ++;
			}
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex02 T = new Ex02();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    int[] num= new int[count];
	    for(int i = 0; i<count ; i++) 
	    	num[i] = kb.nextInt();
	    System.out.println(T.solution(num));
	 }
		
}
