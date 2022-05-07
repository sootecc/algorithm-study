package String;

import java.util.Scanner;

public class Ex6_sol {

	public String solution(String str) {
		String answer="";
		for(int i = 0;i<str.length();i++) {
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			//인덱스와 자기 위치가 같으면 통과, 다르면 제거
			if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		
		}	
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex6_sol T = new Ex6_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
