package String;

import java.util.Scanner;

public class Ex03 {
	
	public String solution(String sentence) {
			
		String words[] = sentence.split(" ");
		String answer = "";
		
		for(int i = 0 ; i<words.length; i++) {
			if(words[i].length() > answer.length())
				answer = words[i];
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03 T = new Ex03();
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		System.out.println(T.solution(sentence));
		
		
		
		
		
		
		
		
		
	}

}
