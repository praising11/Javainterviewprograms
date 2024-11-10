package Interviewprogrms;

public class Swapnumber {
	
	static void third() {
		int mine=25000;
		int brother=50000;
		
		System.out.println("Before swapping:"+"mine"+mine+"bro"+brother);
		
		int temp=mine;//using third integer
		
		mine=brother;//swap 
		
		brother=temp;
		
		
		
		System.out.println("After swapping:"+"mine"+mine+"bro"+brother);
	}
	
	static void without_thirdvariable() {
		
		int a=10;
		int b=25;
		System.out.println("Before swapping:"+a+b);
		a=a+b;//a=10+25=35
		b=a-b; //b=35-25=10
		a=a-b; //a=35-10=25
		System.out.println("After swapping:"+"a= "+a+ "b= "+b);
		
	}
	
	
public static void main(String[] args) {
	
	//third();
	without_thirdvariable();
	
}
}
