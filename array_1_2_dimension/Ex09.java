package array_1_2_dimension;

import java.util.Scanner;


public class Ex09 {
	
	
	
	public int solution(int[][] score, int count) {
		int answer=0;
		int[] sum = new int[2*count +2];
		
		//각 행의 합 구하기
		for(int i = 0 ; i<count;i++) {
			for(int j =0; j<count;j++) {
				sum[i] += score[i][j] ;
			}  
		}
		
		//각 열의 합 구하기
		for(int i =0; i<count ;i++) {
			for(int j =0; j<count;j++) {
				sum[count + i] += score[j][i] ;
			}  
		}
		
		// 대각선의 합 구하기
		for(int i =0; i<count ;i++) {
			for(int j =0; j<count;j++) {
				if((i+j) == count +1 ) {
				sum[2*count+i] += score[i][j] ;
				} 
			} 
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args){
	    Ex09 T = new Ex09();
	    Scanner kb = new Scanner(System.in);
	    int count = kb.nextInt();
	    int[][] score = new int[count][count];
	    for(int i =0 ;i< count ; i++) {
	    	for(int j = 0 ;j<count;j++) {
	    		score[i][j] = kb.nextInt();
	    	}
	    }
	    System.out.println(T.solution(score,count));
	}
	
		
}
