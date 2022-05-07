package String;

import java.util.Scanner;

public class Ex6 {

	public String solution(String str) {
		String answer="";
		int lt =0, rt = lt+1;
		char[] tmp = str.toCharArray();
		
		
		for(int i=lt; i<tmp.length-1;i++) {	
			rt=i+1;
			for(int j =rt; j<tmp.length;j++) {
				if(tmp[i]==tmp[j]) {
					tmp[j] = '1';
				}
			}
			
		}

		
		for(int i=0;i<tmp.length;i++) {
			answer += tmp[i];
		}
		answer = answer.replaceAll("1", "");
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex6 T = new Ex6();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
