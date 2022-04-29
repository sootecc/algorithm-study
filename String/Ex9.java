package String;

import java.util.Scanner;

public class Ex9 {

	public String solution(String str) {
		
		String answer = "";
		char[] tmp = str.toCharArray();
		
		
		
		for(int i=0;i<tmp.length;i++) {
			if(Character.isDigit(tmp[i])) {
				answer += tmp[i];
			}
		}
		
		for(int i=0;i<answer.length();i++) {
			if(answer.charAt(i)!=0)
				answer +=	// answer에 0 뺀 값을 넣어야 함
		}
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex9 T = new Ex9();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
