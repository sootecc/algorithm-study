package String;

import java.util.Scanner;

public class Ex12_sol {

	public String solution(int count, String str) {
		
		String answer = "";
		for(int i = 0 ; i<count ; i++) {		
			String tmp = str.substring(0,7).replace('#','1').replace('*', '0');		//replace �� �� �̻� ��� ����
			int num = Integer.parseInt(tmp,2);		//2���� ���� 10������ 
			answer += (char)num;
			str = str.substring(7);	//7���� �������� ����
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
