package 정렬;

public class 퀵정렬2주석 {

	// 배열(data)의 요소 data[pl]과 data[pr] 교환
	static void swap(int[] data, int pl, int pr) {
		int temp = data[pl];
		data[pl] = data[pr];
		data[pr] = temp;
	}

	static void quickSort(int[] data, int left, int right) { // left, right는 각 커서의 시작점
		int pl = left;
		int pr = right;
		int pivot = data[(pl + pr) / 2]; // 피벗은 각 끝의 커서의 중간 값으로 선택

		do {
			while (data[pl] < pivot) { // data[pl] 값이 pivot보다 큰 수 탐색
				pl++;
			}
			while (data[pr] > pivot) { // data[pr] 값이 pivot보다 작은 수 탐색
				pr--;
			}
			if (pl <= pr) { // pl보다 pr이 크면 교환(오름차순)
				swap(data, pl++, pr--);
			}
		} while (pl <= pr);

		// 정렬 끝난 후 나누어진 두개의 그룹에 데이터 수를 체크
		if (left < pr)
			quickSort(data, left, pr); // left가 pr보다 작으면 그룹의 수가 1개 이상이기 때문에 다시 정렬
		if (pl < right)
			quickSort(data, pl, right); // pl이 right보다 작으면 그룹의 수가 1개 이상이기 때문에 다시 정렬
	}

	public static void main(String[] args) {
		int[] x = { 5, 7, 1, 4, 6, 2, 3, 9, 8 };

		quickSort(x, 0, x.length - 1);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
