package String;

import java.util.Scanner;

public class Ex08_sol {

	public String solution(String str) {
		String answer="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");	//정규식 사용 가능
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex08_sol T = new Ex08_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(T.solution(sentence));
	}

}
