package String;

import java.util.Scanner;

public class Ex10_sol {

	public int[] solution(String str, char c) {
		//오른쪽에서 왼쪽 가면서 e 만날 때마다 0으로 초기화, 그 외에는 1씩 증가
		//반대 방향으로도 가면서 앞의 값과 비교, 작으면 변경
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
