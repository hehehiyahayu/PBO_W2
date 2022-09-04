package Soal5_Strings;

import java.util.*;

public class StringModify {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kata Pertama: ");
		String A = scan.next();
		
		System.out.println("Kata Kedua: ");
		String B = scan.next();
		
		System.out.println();
		
		int sum = A.length() + B.length();
		
		System.out.println(sum);
		
		int lexi = A.compareTo(B);
		
		if(lexi > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		String CapitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
		
		String CapitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
		
		System.out.println(CapitalA + " " + CapitalB);
		
		scan.close();
	}

}
