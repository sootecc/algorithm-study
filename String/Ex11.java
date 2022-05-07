package String;

import java.util.Scanner;

public class Ex11 {

	public String solution(String str) {
		
		String answer = "";
		char compare = str.charAt(0);
		int k = 1;
		
		for(int i = 1; i<str.length();i++) {
			if(compare == str.charAt(i))
				k++;
			else if(k == 1) {
				answer += str.charAt(i);
				compare = str.charAt(i);
				k = 1;
			}
			else {
				answer += compare;
				answer += k;
				compare = str.charAt(i);
				k = 1;
			}
		}
		
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex11 T = new Ex11();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
