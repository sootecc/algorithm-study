package String;

import java.util.Scanner;

public class Ex7 {

	public String solution(String str) {
		String answer="";
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
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex7 T = new Ex7();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
