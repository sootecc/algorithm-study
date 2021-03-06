package String;

import java.util.Scanner;

public class Ex05_sol {

	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt]))lt++;
			else if(!Character.isAlphabetic(s[rt]))rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex05_sol T = new Ex05_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
