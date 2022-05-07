package String;

import java.util.Scanner;

public class Ex10 {

	public String solution(String str, char c) {
		
		String answer = "";
		int[] index = new int[100] ;
		int k =0;
		int min = Integer.MAX_VALUE;
		int tmp = 0;
		
		for(int i = 0 ; i<str.length();i++) {
			if(str.charAt(i)==c) {
				index[k] = i;
				k++;
			}
		}
		
		for(int i=0; i<str.length();i++) {
			for(int j = 0; j<k;j++){
				if(i-index[j]<0)
					tmp = index[j]-i;
				else
					tmp = i - index[j];
				if(tmp<min)
					min = tmp;
			}
			answer += min+" ";
			min = Integer.MAX_VALUE;
		}
		
		
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex10 T = new Ex10();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(T.solution(sentence,c));
	}

}
