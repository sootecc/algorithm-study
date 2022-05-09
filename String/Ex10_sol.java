package String;

import java.util.Scanner;

public class Ex10_sol {

	public int[] solution(String str, char c) {
		//�����ʿ��� ���� ���鼭 e ���� ������ 0���� �ʱ�ȭ, �� �ܿ��� 1�� ����
		//�ݴ� �������ε� ���鼭 ���� ���� ��, ������ ����
		int[] answer = new int[str.length()];
		int p = 110;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)==c) { 
				p = 0;
				answer[i] = p;
				}
			else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 110;
		for(int i = str.length()-1; i>=0;i--) {
			if(str.charAt(i)==c) 
				p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex10_sol T = new Ex10_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		char c = sc.next().charAt(0);
		for(int x : T.solution(sentence, c)) {
			System.out.print(x + " ");
		}
	}

}
