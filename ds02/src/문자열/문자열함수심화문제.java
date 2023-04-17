package 문자열;

public class 문자열함수심화문제 {
	public static void main(String[] args) {
		String s5 = "[ 10, 20, 30, 40, 50 ]";
		System.out.println(s5.length());
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5 = s5.trim();
//		s5 = s5.replace(" ", "");
//		s5 = s5.replace("  ", "");
		System.out.println(s5.length());
		
		String[] s55 = s5.split(", ");
		System.out.println(s55[0]);
		System.out.println(s55[1]);
		System.out.println(s55[2]);
				
		int sum = 0;
		
		for (String x : s55) { 
			int x2 = Integer.parseInt(x);
			sum = sum + x2;
		}
		
		System.out.println(sum);
		}
	}
