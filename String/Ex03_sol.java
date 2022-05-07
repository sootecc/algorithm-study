package String;

import java.util.Scanner;

public class Ex03_sol {
	
	public String solution(String str) {
		String answer = "";
		int m =Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(' ')) != -1) {		//���⸦ �߰� ���ϸ� -1, �߰��ϸ� �߰ߵ� ù �ε����� ��ȯ
			String tmp = str.substring(0, pos); 	//0���� pos ���� �߶󳻱�
			int len = tmp.length();					
			if(len>m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos + 1); // �߶󳻰� ���� �͵� ������ ����ֱ� 
		}
		if(str.length()>m) answer =str;	//-> ������ �ܾ�� ������ ��� �׳� �������� ������ ó�����־�� �Ѵ�.
		
		/*int max = Integer.MIN_VALUE;		   split�� �̿��Ͽ� Ǫ�� ���
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
