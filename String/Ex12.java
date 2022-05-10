package String;

import java.util.Scanner;

public class Ex12 {

	public String solution(int count, String str) {
		
		String answer = "";
		// # -> 1, * ->0
		int[] sub = new int[7];
		String[] result = new String[count]; 
		String[] result2 = new String[count];
		char[] character = new char[count]; 
		//substring ÀÌ¿כ
		for(int i = 0 ; i< count;i++) {
			result[i] = str.substring(7*i,7*i+7);
			
		}
		for(int i = 0 ; i< count ; i++) {
			for(int j= 0 ;j<result[i].length() ; j++) {
				if(result[i].charAt(j) == '#') 
					result2[i]+= 1;
				else {
					result2[i] += 0;
				}
			}
			  System.out.println(Integer.parseInt(result2[i]));
		}
		
		
		
			
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex12 T = new Ex12();
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String sentence = sc.next();
		System.out.print(T.solution(count,sentence));
		
		
	}

}
