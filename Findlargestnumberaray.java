package Interviewprogrms;

import java.util.Arrays;

public class Findlargestnumberaray {
	
	
	
	 private void largest() {
		int arr[]= {2,5,4,3,65};
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Largest number is:"+max);
	 }
	
	public static void main(String[] args) {
		Findlargestnumberaray array=new Findlargestnumberaray();
		array.largest();
		
	}

}
