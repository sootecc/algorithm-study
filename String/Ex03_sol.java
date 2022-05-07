package String;

import java.util.Scanner;

public class Ex03_sol {
	
	public String solution(String str) {
		String answer = "";
		int m =Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(' ')) != -1) {		//띄어쓰기를 발견 못하면 -1, 발견하면 발견된 첫 인덱스를 반환
			String tmp = str.substring(0, pos); 	//0부터 pos 까지 잘라내기
			int len = tmp.length();					
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); // 잘라내고 남은 것들 앞으로 당겨주기 
		}
		if(str.length()>m) answer =str;	//-> 마지막 단어는 공백이 없어서 그냥 지나가기 때문에 처리해주어야 한다.
		
		/*int max = Integer.MIN_VALUE;		   split을 이용하여 푸는 방법
		String[] words = sentence.split(" ");
		
		for(String x : words) {
			int len = x.length();
			if(len>max) {
				max = len;
				answer = x;
			}
		}*/
		return answer;
	}
	
	public static void main(String[] args) {
		Ex03_sol T = new Ex03_sol();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(T.solution(sentence));
	}

}
