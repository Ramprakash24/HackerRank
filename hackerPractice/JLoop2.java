package hackerPractice;

import java.util.Scanner;

public class JLoop2 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int[] n = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			n[i] = in.nextInt();
		}
		for (int i = 0; i < t; i++) {
			int sum = a[i] + b[i];
			for (int j = 1; j <= n[i]; j++) {
				System.out.print(sum + " ");
				sum = (int) (sum + Math.pow(2, j) * b[i]);
			}
			System.out.print("\n");
		}
		in.close();
	}
}
