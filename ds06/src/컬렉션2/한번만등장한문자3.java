package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class 한번만등장한문자3 {

	public static void main(String[] args) {
		String s = "bbcceew";
		String[] s2 = s.split("");
		String answer = "";
		Arrays.sort(s2);
		for (String x : s2) {
			if(s.indexOf(x) == s.lastIndexOf(x)) {
				answer += x;
			}
		}
		System.out.println(answer);
	}
}
