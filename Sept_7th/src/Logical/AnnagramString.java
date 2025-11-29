package Logical;

import java.util.Arrays;

public class AnnagramString {

	public static void main(String[] args) {
		// listen
		// silent

		String S1 = "listen"; // l=0, i=1
		String S2 = "SILENT";
		
		S2 =S2.toLowerCase();

		if (S1.length() != S2.length()) {

			System.out.println(S1 + " Is not annagram of " + S2);
			return;
		}
		char[] arr1 = S1.toCharArray();

		char[] arr2 = S2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {

			System.out.println(S1 + " Is annagram of " + S2);
		}

		else {
			System.out.println(S1 + "Is notannagram of " + S2);
		}

	}

}
