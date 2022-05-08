package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09_sol {

	public int solution(String str) {
//		int answer = 0;
//		for(char x:str.toCharArray() ) {
//			if(x>=48&&x<=57) answer = answer * 10 + (x-48);	//아스키 갖고 놀기
//		}
		
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
		
	}
	
	public static void main(String[] args) {
		Ex09_sol T = new Ex09_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
