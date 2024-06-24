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
		int[]a= {1,2,2,3,4,5,5,5,6,7,1};
		function(a);
		

	}

}
