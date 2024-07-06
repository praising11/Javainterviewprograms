package Interviewprogrms;

public class Lengthofstring {
	public static void main(String[] args) {
		String name="praising";
		
		//System.out.println(name.length());
		
		char[] charArray = name.toCharArray();
		int length=0;
		for(char c:charArray) {
			length++;
		}
			System.out.println(length);
		}
	}


