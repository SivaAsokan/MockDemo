package org;

public class StringProgram {
	public static void main(String[] args) {
		String s = "java programming";
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			reverse = reverse.concat(String.valueOf(c));
		}
		System.out.println(reverse);
	}

}
