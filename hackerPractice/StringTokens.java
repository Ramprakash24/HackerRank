package hackerPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringTokens {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		if (!scan.hasNext())
			System.out.println(0);
		else {
		String input = scan.nextLine();
		String[] arrayA = input.trim().split("[ !,?._'@]+");
		List<String> listofString = new ArrayList<String>(Arrays.asList(arrayA));
		System.out.println(listofString.size());
		for (String s : listofString) {
			System.out.println(s);
			}
		}
		scan.close();
	}
}
