package 스택;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Object[] s = {1,2,3,4};
		//Integer[] s2 = (Integer[]) s;
		//System.out.println(Arrays.toString(s2));
		Object[] s3 = {"1","2","3","4"};
		String[] s4 = (String[]) s3;
		System.out.println(Arrays.toString(s4));
	}
}
