package array_1_2_dimension;

import java.util.Scanner;


public class Ex03 {
	
	
	
	public char solution(int a, int b) {
		char answer = 0;
		
		if(a<b) {
			answer = 'B';
			if(a==1 &&b==3)
				answer = 'A';
		}
		else if(a>b) {
			answer = 'A';
			if(a==3 && b ==1)
				answer = 'B';
		}
		else if(a==b)
			answer = 'D';
		
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex03 T = new Ex03();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    int[] a= new int[count];
	    int[] b= new int[count];
	    for(int i = 0; i<count ; i++) { 
	    	a[i] = kb.nextInt();
	    }
	    for(int i = 0; i<count ; i++) { 
	    	b[i] = kb.nextInt();
	    }
	    for(int i = 0;i<count;i++) {
	    System.out.println(T.solution(a[i],b[i]));
	    }
	}
		
}
