package hackerPractice;

import java.util.Scanner;

public class JavaDataTypes {
	public static String numberFit(String numString) {
		String answer = "";
		try{
		long num = Long.parseLong(numString);
		if ((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE))
				answer = answer.concat(numString + " can be fitted in:\n* byte\n* short\n* int\n* long");
		else if ((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE))
				answer = answer.concat(numString + " can be fitted in:\n* short\n* int\n* long");
		else if ((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE))
				answer = answer.concat(numString + " can be fitted in:\n* int\n* long");
		else
				answer = answer.concat(numString + " can be fitted in:\n* long");
		}
		catch (NumberFormatException e) {
			answer = numString + " can't be fitted anywhere.";
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String[] number = new String[t];
		for (int i = 0; i < t; i++) {
			number[i] = sc.nextLine();

		}
		for (int i = 0; i < t; i++) {
			System.out.println(numberFit(number[i]));
		}
		sc.close();
	}
}
