package 문자열;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<MemebrVO> list2 = new ArrayList<MemebrVO>();
		
		list.add("나는 스트링");
		//list.add(100);
		
		//ArrayList<String> : String을 순서대로 모든 데이터 모음 
		//ArrayList<Character> list3, ArrayList<String> list4
		//list3.add('a'), list4.add("abc")
		ArrayList list5 = new ArrayList();
		//기본데이터 타입은 Object설정(주차장문 Car)
		list5.add('a');
		list5.add("abc");
		list5.add(111);
	}

}
