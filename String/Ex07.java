package String;

import java.util.Scanner;

public class Ex07 {

	public String solution(String str) {
		String answer="";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";

		/*
		 String answer = "YES";
		str = str.toUpperCase();
		char[] tmp = str.toCharArray();
		answer = "YES";
		
		int i=0;
		while(i<tmp.length-i) {
			if(tmp[i]==tmp[tmp.length-i-1])
				i++;
			else {
				answer = "NO";
				return answer;
			}
		}
		*/
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex07 T = new Ex07();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
