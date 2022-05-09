package String;

import java.util.Scanner;

public class Ex11_sol {

	public String solution(String str) {
		// �ٸ� ��� �ٷ� answer�� �ݿ��Ѵ�.
		// ���� ó�� § �ڵ�� �ذ��Ϸ��� �� �ڿ� �� ���ڸ� �߰����ָ� �ȴ�.
		
		String answer = "";
		str = str + " ";
		int cnt = 1; 
		for(int i = 0; i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
				
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex11_sol T = new Ex11_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
