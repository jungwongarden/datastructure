package 정렬;

public class 퀵정렬 {

	static void swap(int[] data, int pl, int pr) {
		int temp = data[pl];
		data[pl] = data[pr];
		data[pr] = temp;
	}

	static void quickSort(int[] data, int left, int right) { 
		int pl = left;
		int pr = right;
		int pivot = data[(pl + pr) / 2]; 

		do {
			while (data[pl] < pivot) { 
				pl++;
			}
			while (data[pr] > pivot) { 
				pr--;
			}
			if (pl <= pr) { 
				swap(data, pl++, pr--);
			}
		} while (pl <= pr);

		if (left < pr)
			quickSort(data, left, pr); 
		if (pl < right)
			quickSort(data, pl, right); 
	}

	public static void main(String[] args) {
		int[] x = { 5, 7, 1, 4, 6, 2, 3, 9, 8 };

		quickSort(x, 0, x.length - 1);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
