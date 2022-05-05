package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {

	public String solution(String str) {
		
		String answer = "";
		char[] tmp = str.toCharArray();
		ArrayList<Character> c = new ArrayList<Character>();
		
		
		for(int i=0;i<tmp.length;i++) {
			if(Character.isDigit(tmp[i])) {
				c.add(tmp[i]);
			}
		}
		
		while(c.get(0)=='0') {
			c.remove(0);
		}
		
		for(int i =0; i<c.size();i++) {
			answer += c.get(i);
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
