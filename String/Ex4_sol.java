package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_sol {

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}	//중요한 방법!! 
			String tmp = String.valueOf(s);	//s를 string화 시켜줌
			answer.add(tmp);
		}

		
		//쉬운 풀이
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();	//StringBuilder -> 객체를 String의 연산처럼 여러개 만들지 않아도 된다.
//			answer.add(tmp);
//		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ex4_sol T = new Ex4_sol();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		
	}

}
