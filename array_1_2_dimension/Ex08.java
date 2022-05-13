package array_1_2_dimension;

import java.util.Scanner;


public class Ex08 {
	
	
	
	public String solution(int[] count) {
		String answer="";
		int[] rank = new int[count.length];
		int tmp = 0;
		for(int i =0 ; i< count.length ; i++) {
			for(int j = 0 ; j<count.length;j++) {
				if(i == j) continue;
				if(count[i]<count[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i <count.length;i++) {
			for(int j = i+1 ; j <count.length;j++) {
				if(rank[i] == rank[j]) {
					rank[i] = tmp;
					rank[j] ++;
					rank[i] ++;
				}
			}
			tmp = 0;
			answer += (rank[i]+1)+" ";
		}
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex08 T = new Ex08();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    int[] score = new int[count];
	    for(int i =0 ;i< count ; i++) {
	    	score[i] = kb.nextInt();
	    }
	    System.out.println(T.solution(score));
	}
	
		
}
