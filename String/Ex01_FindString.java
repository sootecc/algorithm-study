package String;

import java.util.Scanner;

public class Ex01_FindString {
	 
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    
	    //���� ���ڿ� ���� lowercase
	    String str = in.next();
	    str = str.toLowerCase();
	    
	    //���� ���� lowercase
	    char alphabet = in.next().charAt(0);
	    alphabet = Character.toLowerCase(alphabet);
	    
	    //���ڿ��� char �迭�� 
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
