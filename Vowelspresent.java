package Interviewprogrms;

import java.util.ArrayList;


public class Vowelspresent {

	public static void main(String[] args) {
		{
			String name="praising";
			name=name.toLowerCase(); //converting to lowercase
			
			System.out.println("String name is:"+name);
			
			int count=0; //temp
			String vowels="aeiou";
			
		    ArrayList<Character> vow = new ArrayList<Character>(); //converting to character for looping purpose
		    
		    for (int i = 0; i < vowels.length(); i++) { 
		    	
		    	vow.add(vowels.charAt(i));
			}
		    for (int i = 0; i < name.length(); i++) {
		    	if (vow.contains(name.charAt(i))) {
		    		count++;
				}
		    
			}
			System.out.println("Total vowels present in the "+name+"is:"+count);
		}

	}

}
