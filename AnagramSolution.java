package stringsAnagram;

import java.util.*;

public class AnagramSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

	public static int numberNeeded(String first, String second) {
		
		String firstLoop = first;
		
		for (int i = 0; i < firstLoop.length(); i++) {
			char letter = firstLoop.charAt(i);
			if (second.contains("" + letter)) {
				first = removeLetter(letter, first);
				second = removeLetter(letter, second);
			}
		}
		return first.length() + second.length();
	}

	public static String removeLetter(Character letter, String target) {

		int indexLocation = target.indexOf(letter);
		if (indexLocation == target.length() - 1) {
			return target.substring(0, indexLocation);
		}
		if (indexLocation == 0) {
			return target.substring(indexLocation + 1, target.length());
		}
		return target.substring(0, indexLocation) + target.substring(indexLocation + 1, target.length());

	}
}
