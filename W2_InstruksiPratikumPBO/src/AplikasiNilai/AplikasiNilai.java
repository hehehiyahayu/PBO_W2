package AplikasiNilai;

import java.util.Scanner;

public class AplikasiNilai {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nilai Tugas: ");
		byte nilaiTugas = scan.nextByte();
		
		if(nilaiTugas > 100) {
			System.out.print("Data nilai tugas harus kurang dari 100");
			scan.close();
			return;
		}
		
		System.out.print("Nilai UTS: ");
		byte nilaiUTS = scan.nextByte();
		
		if(nilaiUTS > 100) {
			System.out.print("Data nilai UTS harus kurang dari 100");
			scan.close();
			return;
		}
		
		System.out.print("Nilai UAS: ");
		byte nilaiUAS = scan.nextByte();
		
		if(nilaiUAS > 100) {
			System.out.print("Data nilai UAS harus kurang dari 100");
			scan.close();
			return;
		}
		
		byte nilaiTotal = (byte) setNilaiAkhir(nilaiTugas, nilaiUTS, nilaiUAS);
		
		char grade = setGrade(nilaiTotal);
		
		System.out.println("Nilai Total: " + nilaiTotal);
		
		System.out.println("Grade : " + grade);
		
		scan.close();
	}
	public static int setNilaiAkhir(byte Tugas, byte UTS, byte UAS) {
		int nilaiTugasTotal = (20 * Tugas) / 100;
		
		int nilaiUTSTotal = (35 * UTS) / 100;
		
		int nilaiUASTotal = (45 * UAS) / 100;
		
		int nilaiTotal = nilaiTugasTotal + nilaiUTSTotal + nilaiUASTotal;
		
		return nilaiTotal;
	}
	
	public static char setGrade(byte nilaiAkhir) {
		if(nilaiAkhir >= 85) {
			return 'A';
		}else if(nilaiAkhir <= 84 && nilaiAkhir >= 75){
			return 'B';
		}else if(nilaiAkhir <= 74 && nilaiAkhir >= 65){
			return 'C';
		}else if(nilaiAkhir <= 64 && nilaiAkhir >= 49){
			return 'D';
		}else {
			return 'E';
		}
	}
}
