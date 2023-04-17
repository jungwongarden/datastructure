package 문자열;

import java.util.Arrays;
import java.util.Random;

public class 정리문제_기본2 {

	public static void main(String[] args) {
		Random r = new Random(5);
		
		int[] n = new int[20]; //{0,0,0,...,0,0}
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(900);//0~899
		}
		Arrays.sort(n); //오름차순 
		//1,2,3,...,100 오름차순
		//100,...,3,2,1 내림차순 
		System.out.println(n[19]);
	}
}
