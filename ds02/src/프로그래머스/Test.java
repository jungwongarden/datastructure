package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
		
		int centerIndex = s.length /2; 
		//  7 / 2 ==> 3(인덱스)
		System.out.println(centerIndex);
		
		System.out.println(s[centerIndex]);
		
		
	}

}
