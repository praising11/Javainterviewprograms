package Interviewprogrms;


import java.util.LinkedHashSet;

public class Removeduplicates {
	
	
	static void function(int[]a) {
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
			linkedHashSet.add(a[i]);
		System.out.println(linkedHashSet);
			
		}
	
	

	public static void main(String[] args) {
		int []a= {6,10,1,8,3,8,14};
		function(a);
		

	}

}
