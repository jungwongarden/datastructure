package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		String s = "aaabbbcdddefe";
		HashSet<String> set = new HashSet<>();
		String[] s2 = s.split("");
		for (String c : s2) {
			set.add(c);
		}
		System.out.println(set);
		
		List<String> list = Arrays.asList(s2);
		
		String answer = "";
		Iterator<String> iterator =  set.iterator();
		for (int i = 0; i < set.size(); i++) {
			String x = iterator.next();
			if(Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
		System.out.println(answer);
	}
}
