package String;

import java.util.Scanner;

public class Ex08 {

	public String solution(String str) {
		String answer="";
		str = str.toUpperCase();
		char[] tmp = str.toCharArray();
		answer = "YES";
		
		for(int i = 0; i<tmp.length;i++) {
			if(!Character.isAlphabetic(tmp[i])) {
				tmp[i] = '1';
			}
		}
		
		for(int i =0; i<tmp.length;i++) {
			str += tmp[i]; 
		}
		str = str.replaceAll("1", "");
		char[] tmp2 = str.toCharArray();
		
		//회문검사
		int i=0;
		while(i<tmp2.length-i) {
			if(tmp2[i]==tmp2[tmp2.length-i-1])
				i++;
			else {
				answer = "NO";
				return answer;
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex08 T = new Ex08();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();		//일단 라인을 가져와야했다.
		System.out.println(T.solution(sentence));
	}

}
