package 정렬;

import java.util.Arrays;

public class 선택정렬오름차순 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2, 6 };
		int n = arr.length; //6
		for (int i = 0; i < n - 1; i++) {
			int min = i; // 바꿔줄 위치 인덱스
			//맨앞자리에 최소값을 찾아 넣어야하는데
			//맨앞자리는 반복하면서 앞으로 한칸 이동한다.
			//정렬된 나머지 오른쪽 부분에서 제일 맨앞자리를 지정해야한다.
			System.out.println("i: " + i);
			// 가장 작은 값을 찾는 반복문
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min])
					min = j; // 더 작은 값으로 인덱스 바꿔줌
			}
			System.out.println("min: " + min);
			System.out.println(Arrays.toString(arr));
			// 배열 값을 인덱스 위치의 값과 바꿔줌
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
