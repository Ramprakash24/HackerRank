package hackerPractice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntax {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String[] pattern = new String[testCases];

		for (int i = 0; i < testCases; i++) {
			pattern[i] = in.nextLine();
		}

		int i = 0;

		while (i < testCases) {
			try {
				Pattern.compile(pattern[i]);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			i++;
		}

		in.close();
	}
}
