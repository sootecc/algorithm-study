package String;

import java.util.Scanner;

public class Ex02_Change_ULcase_sol {
	
	public static char[] solve(String input) {
		
		char[] array = input.toCharArray();
		
		for(int i = 0; i<array.length; i++){
			if(Character.isUpperCase(array[i])) {
				array[i] = Character.toLowerCase(array[i]);
			}else if(Character.isLowerCase(array[i])) {
				array[i] = Character.toUpperCase(array[i]);
			}
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    String input = in.next();
	    System.out.println(solve(input));
	    
	}
}
