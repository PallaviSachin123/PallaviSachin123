package logicalProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String s1 = "krishna kanha kanhaiya";
		String s1 = "pallavi";
		char[] a = s1.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		// Logic character are inserted as keys and the respected count inserted as
		// values.
		// if map already contains character then increase the value by 1.
		// (k,1)
		for (Character ch : a) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}

		}
		// loop through
		Set<Character> keys = charMap.keySet();

		for (Character ch : keys) {
			if (charMap.get(ch) > 1) {
				System.out.println("Character " + ch + " = " + charMap.get(ch));
			}
			/*
			 * else { System.out.println("Character "+ch+" = 1"); }
			 */
		}
	}

}
