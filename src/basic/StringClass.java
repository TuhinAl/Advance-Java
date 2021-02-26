package basic;

import java.util.Date;
import java.util.Scanner;

public class StringClass {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(date.toString());
		System.out.println(date.getDate());
		System.out.println(date.getTimezoneOffset());
		
	}

}
