package 컬렉션;

import java.util.Arrays;

public class String에서char배열로옮기기 {

	public static void main(String[] args) {
		String s = "aaabbbccc";
		char[] c = new char[3]; //0~2
		s.getChars(2, 5, c, 0); 
		//원본 String s에서 인덱스 2~4까지를
		//c배열에 옮겨라.
		System.out.println(Arrays.toString(c));
		System.out.println(s.charAt(0));
	}
}
