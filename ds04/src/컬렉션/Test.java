package 컬렉션;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String letter = "할머니 사랑해요.!";
		String[] result = letter.split("");
		System.out.println(Arrays.toString(result));
		
		String[] result2 = letter.split(" ");
		System.out.println(Arrays.toString(result2));
		
	}

}
