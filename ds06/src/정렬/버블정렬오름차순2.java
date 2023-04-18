package 정렬;

import java.util.Arrays;

public class 버블정렬오름차순2 {

	public static void main(String[] args) {
		long n = 642135;
		String s = String.valueOf(n);
		char[] array = s.toCharArray();
		char temp = ' '; // 교환용 임시 변수

		// 배열의 길이 -1 (마지막 숫자 제외)
		//정렬개수가 정렬할 때마다 줄어든다 --> 그래서, 가장 많은 개수부터 시작
		for (int i = array.length - 1; i >= 0; i--) { 
			for (int j = 0; j < i; j++) { 
				if (array[j] > array[j + 1]) { 
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;  
				}

			}
		}

		System.out.println(Arrays.toString(array)); 
	}

}
