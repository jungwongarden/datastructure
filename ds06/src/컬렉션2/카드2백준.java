package 컬렉션2;

import java.util.LinkedList;
import java.util.Queue;

public class 카드2백준 {

	public static void main(String[] args) {
		int x = 5;
		
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= x; i++) {
			queue.add(i);
		}
		System.out.println(queue);
		for (int i = 0; i <= queue.size(); i++) {
			queue.remove();
			System.out.println("remove> " + queue);
			queue.add(queue.poll());
			System.out.println("add> " + queue);
		}
		queue.remove();
		System.out.println("final> " + queue);

	}
}
