package hackerPractice;

import java.util.Scanner;

public class JOFormatting {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] stringValue = new String[3];
		int[] intValue = new int[3];

		for (int i = 0; i < 3; i++) {
			stringValue[i] = sc.next();
			intValue[i] = sc.nextInt();
		}
		System.out.println("================================");
		for (int i = 0; i < intValue.length; i++) {
			System.out.printf("%-14s %-03d", stringValue[i], intValue[i]);
			System.out.printf("\n");

		}
		System.out.println("================================");
		System.out.printf("%14s %03d", stringValue[2], intValue[2]);


	}

}
