package String;

import java.util.Scanner;

public class Ex12_sol {

	public String solution(int count, String str) {
		
		String answer = "";
		for(int i = 0 ; i<count ; i++) {		
			String tmp = str.substring(0,7).replace('#','1').replace('*', '0');		//replace 두 번 이상 사용 가능
			int num = Integer.parseInt(tmp,2);		//2진수 값을 10진수로 
			answer += (char)num;
			str = str.substring(7);	//7부터 뒤쪽으로 갱신
		}
		
		
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex12_sol T = new Ex12_sol();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String sentence = sc.next();
		System.out.print(T.solution(count,sentence));
		
		
	}

}
