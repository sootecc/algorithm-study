package String;

import java.util.Scanner;

public class Ex01_FindString {
	 
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    
	    //받은 문자열 전부 lowercase
	    String str = in.next();
	    str = str.toLowerCase();
	    
	    //받은 문자 lowercase
	    char alphabet = in.next().charAt(0);
	    alphabet = Character.toLowerCase(alphabet);
	    
	    //문자열을 char 배열로 
	    char[] array1 = str.toCharArray();
	    
	    int count = 0;
	    
	    for(int i = 0; i<array1.length;i++) {
	    	if(array1[i] == alphabet) {
	    		count ++;
	    	}
	    }
	    System.out.println(count);
	 }
		
}
