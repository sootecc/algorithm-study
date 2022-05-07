package String;

import java.util.Scanner;

public class Ex5 {

	public String solution(String sentence) {
		String answer="";
		char[] temp;
		char change;
		
		temp = sentence.toCharArray();
		int limit = temp.length-1;
		
		for(int i=0; i< temp.length;i++) {
			if((temp[i]>=65 && temp[i]<91)||(temp[i]>=97 && temp[i]<123)) {
				for(int j = 0; j<temp.length; j++) {
					if((temp[limit-j]>=65 && temp[limit-j]<91)||(temp[limit-j]>=97 && temp[limit-j]<123)) {
						change = temp[i];
						temp[i] = temp[limit-j];
						temp[limit-j] = change;
						if(limit == limit-j)
							limit-=1;
						else
							limit = limit - j;
						break;
					}
				}
			}
			answer += temp[i];
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		Ex5 T = new Ex5();
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		System.out.println(T.solution(sentence));
	}

}
