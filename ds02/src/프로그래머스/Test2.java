package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(10);
		list.add(6);
		
		System.out.println(list);
		Collections.reverse(list);
		Collections.sort(list);
		System.out.println(list);
		
		int centerIndex = list.size() /2; 
		//  7 / 2 ==> 3(인덱스)
		System.out.println(centerIndex);
		
		System.out.println(list.get(centerIndex));
	}
}
