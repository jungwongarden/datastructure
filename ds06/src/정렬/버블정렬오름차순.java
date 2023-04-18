package 정렬;

import java.util.Arrays;

public class 버블정렬오름차순 {

	public static void main(String[] args) {
		int[] array = { 6, 4, 2, 1, 3, 5 };
		// 4, 6, 2, 1, 3, 5
		// 4, 2, 6, 1, 3, 5
		// 4, 2, 1, 6, 3, 5
		// 4, 2, 1, 3, 6, 5
		// 4, 2, 1, 3, 5, 6

		// 2, 4, 1, 3, 5, 6
		// 2, 1, 4, 3, 5, 6
		// 2, 1, 3, 4, 5, 6
		// 2, 1, 3, 4, 5, 6

		// 1, 2, 3, 4, 5, 6
		int temp = 0; // 교환용 임시 변수

		// 배열의 길이 -1 (마지막 숫자 제외)
		//정렬개수가 정렬할 때마다 줄어든다 --> 그래서, 가장 많은 개수부터 시작
		for (int i = array.length - 1; i >= 0; i--) { // i = 5 → 4 → 3 → 2 → 1 → 0
			for (int j = 0; j < i; j++) { // i = 5 : j = 0 → 1 → 2 → 3 → 4
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
