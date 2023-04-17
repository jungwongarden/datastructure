package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test6 {

	public static void main(String[] args) {
		int x = 1234;
		String x2 = String.valueOf(x);
		String[] x3 = x2.split("");
		System.out.println(Arrays.toString(x3));
		
		int sum = 0;
		for (String s : x3) {
			int s2 = Integer.parseInt(s);
			sum = sum + s2;
		}
		System.out.println(sum);
	}
}
