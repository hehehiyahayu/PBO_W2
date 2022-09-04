package Soal1_DataTypes;

//import java.io.*;
import java.util.*;

public class DataTypes {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		
		if(N >= -128 && N <= 127) {
			System.out.println(N + " can be fitted in:");
			System.out.println("* byte");
			System.out.println("* short");
			System.out.println("* int");
			System.out.println("* long");
		}else if(N >= -32768 && N <= 32767) {
			System.out.println(N + " can be fitted in:");
			System.out.println("* short");
			System.out.println("* int");
			System.out.println("* long");
		}else if(N >= -2147483648 && N <= 2147483647) {
			System.out.println(N + " can be fitted in:");
			System.out.println("* int");
			System.out.println("* long");
		}else if(N >= Long.MIN_VALUE && N <= Long.MAX_VALUE) {
			System.out.println(N + " can be fitted in:");
			System.out.println("* long");
		}else{
			System.out.println(N + " berjumlah diluar batas yang ada");
		}
		
		scan.close();
	}
}
