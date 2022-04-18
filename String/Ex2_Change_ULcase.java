package String;

import java.util.Scanner;

public class Ex2_Change_ULcase {
	
	public  String solution(String str) {
		
		String answer = "";
		for(char x : str.toCharArray()) {
			/*if(Character.isLowerCase(x)) {
				answer +=Character.toUpperCase(x);
			}else {
				answer +=Character.toLowerCase(x);
			}*/
			
			//ASCII 65 ~ 90 대문자, 97~ 122 소문자 차이는 32
			
			if(x>=97 && x<122) 	//소문자
				answer += (char)(x-32);
			else
				answer += (char)(x+32);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Ex2_Change_ULcase T = new Ex2_Change_ULcase();
		Scanner kb=new Scanner(System.in);
	    String str = kb.next();
	    System.out.println(T.solution(str));
	    
	}
}
