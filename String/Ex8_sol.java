package String;

import java.util.Scanner;

public class Ex8_sol {

	public String solution(String str) {
		String answer="NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");	//���Խ� ��� ����
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex8_sol T = new Ex8_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(T.solution(sentence));
	}

}
