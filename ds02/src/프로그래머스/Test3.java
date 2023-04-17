package 프로그래머스;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		
		Arrays.sort(s);
		
		System.out.println(Arrays.toString(s));
		
		//배열을 ArrayList로
		//1) String[]은 Arrays.asList()로 ArrayList로 변환가능 
		//2) 새로운 ArrayList로 옮겨줌.
		String[] s2 = {"aaa", "bbb", "ccc"};
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
	
		//불가능!int[] --> List<Integer>
//		List<Integer> list2 = Arrays.asList(s);
//		System.out.println(list2);

		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < s2.length; i++) {
			list3.add(s[i]);
		}
		System.out.println("리스트>> " + list);
		
		//ArrayList를 배열로 
		String[] list2 = (String[]) list.toArray();
		System.out.println("배열>> " + Arrays.toString(list2));
		
	}

}
