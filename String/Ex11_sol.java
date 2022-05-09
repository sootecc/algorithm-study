package String;

import java.util.Scanner;

public class Ex11_sol {

	public String solution(String str) {
		// 다를 경우 바로 answer에 반영한다.
		// 기존 처음 짠 코드로 해결하려면 맨 뒤에 빈 문자를 추가해주면 된다.
		
		String answer = "";
		str = str + " ";
		int cnt = 1; 
		for(int i = 0; i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
				
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex11_sol T = new Ex11_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
