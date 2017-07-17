package hackerPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] c = a.toCharArray();
		Arrays.sort(c);
		char[] d = b.toCharArray();
		Arrays.sort(d);
		String A = new String(c);
		String B = new String(d);
		if (A.equals(B))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);

		System.out.println((ret) ? "Anagrams" : "Not Anagarams");

		sc.close();
		
	}
}
