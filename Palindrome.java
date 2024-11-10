package Interviewprogrms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Entered  value is :");
		String nextInt = scan.next();
		System.out.println(nextInt);
		if (nextInt.equals("praising")) {
			System.out.println("Its a palindrome");
		} else {
			System.out.println("Its a  not palindrome");

		}
		

	}

}
