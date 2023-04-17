package 컬렉션;

public class p와y의개수 {

	public static void main(String[] args) {
		String s = "pPopoyY";
		int pCount = 0, yCount = 0;
		boolean answer = false;
		String[] array = s.toLowerCase().split(""); 
		// 소문자로 바꿔서 잘라서 배열에 넣음

		for (int i = 0; i < array.length; i++) { 
			// for문 돌리면서 p 와 y 카운터 세기
			if ("p".equals(array[i])) {
				pCount++;
			} else if ("y".equals(array[i])) {
				yCount++;
			}
		}
		if (pCount == yCount) {
			answer = true;
		}
		System.out.println(answer);
	}
}
