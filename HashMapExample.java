package HashMap;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}

		Boolean truth = hasWords(magazine, ransom);

		if (truth) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	public static boolean hasWords(String[] magazine, String[] ransom) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		if (ransom.length > magazine.length) {
			return false;
		}

		for (int i = 0; i < magazine.length; i++) {
			if (map.containsKey(magazine[i])) {
				map.replace(magazine[i], map.get(magazine[i]) + 1);
			} else {
				map.put(magazine[i], 1);
			}
		}
		for (int i = 0; i < ransom.length; i++) {
			if (map.containsKey(ransom[i])) {
				if (map.get(ransom[i]) != 0) {
					map.replace(ransom[i], map.get(ransom[i]) - 1);
				} else {
					return false;
				}
			}
		}

		return true;
	}
}
