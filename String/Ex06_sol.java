package String;

import java.util.Scanner;

public class Ex06_sol {

	public String solution(String str) {
		String answer="";
		for(int i = 0;i<str.length();i++) {
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			//�ε����� �ڱ� ��ġ�� ������ ���, �ٸ��� ����
			if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
		
		}	
		
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex06_sol T = new Ex06_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
