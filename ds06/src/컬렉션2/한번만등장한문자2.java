package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자2 {

	public static void main(String[] args) {
		String s = "badefaaacb";
		HashSet<String> set = new HashSet<>();
		String[] s2 = s.split("");
		Arrays.sort(s2);
		System.out.println(Arrays.toString(s2));
		for (String x : s2) {
			set.add(x); 
		}
		System.out.println(set.size());
		System.out.println(set);
		
		Object[] set2 = set.toArray();
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		String answer = "";
		for (Object x : set2) {
			if(Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
		System.out.println(answer);
	}
}
