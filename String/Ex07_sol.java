package String;

import java.util.Scanner;

public class Ex07_sol {

	public String solution(String str) {
		String answer="YES";
		str = str.toUpperCase();
		int len = str.length();
		for(int i =0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1))
				return "NO";
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex07_sol T = new Ex07_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
