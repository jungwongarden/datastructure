package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		String[] s = {"a", "b", "c"};
		String[] s2 = { "com", "b", "d", "p", "c" };
		System.out.println(Arrays.equals(s, s2));

		List<String> list = Arrays.asList(s);
		List<String> list2 = Arrays.asList(s2);
		int answer = 0;
		for (String s3 : list) {
			if(list2.contains(s3)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
