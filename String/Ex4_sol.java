package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_sol {

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			String tmp = new StringBuilder(x)
		}
		
		
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
