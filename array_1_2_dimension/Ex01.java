package array_1_2_dimension;

import java.util.Scanner;


public class Ex01 {
	
	
	
	public String solution(int[] num) {
		String answer = ""; 
		for(int i =0; i<num.length-1;i++) {
			if(i == 0)
				answer += num[i] + " ";
			else if(num[i]<num[i+1])
				answer += num[i+1]+ " ";
		}
		answer = answer.substring(0, answer.length()-1);
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex01 T = new Ex01();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    int[] num= new int[count+1];
	    for(int i = 0; i<count ; i++) 
	    	num[i] = kb.nextInt();
	    System.out.println(T.solution(num));
	 }
		
}
