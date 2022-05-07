package String;

import java.util.Scanner;

public class Ex04 {

	public String solution(String word) {
		String answer = "";
		
		for(int i = 0 ; i< word.length(); i++)
			answer += word.charAt(word.length()-i-1);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex04 T = new Ex04();
		Scanner sc = new Scanner(System.in);
		
		int wordCount = sc.nextInt();
		String word;
		for(int i = 0; i<wordCount; i++) {
			System.out.println(T.solution(word = sc.next()));
		}
		
		
	}

}
