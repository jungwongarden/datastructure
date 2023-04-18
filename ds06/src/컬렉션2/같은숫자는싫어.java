package 컬렉션2;

import java.util.Arrays;
import java.util.Stack;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] num = { 1, 1, 3, 3, 0, 1, 1 };
		
		Stack<Integer> stack = new Stack<>();
		stack.push(num[0]);
		for (int x : num) {
			if(stack.peek() != x) {
				stack.push(x);
			}
		}
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
