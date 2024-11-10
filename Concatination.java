package Interviewprogrms;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatination {

	public static void main(String[] args) {
		String str="praising";
		String str2="praise";
		String collect = Stream.of(str,str2).collect(Collectors.joining());
		System.out.println(collect);
	}


}
