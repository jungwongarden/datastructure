package 문자열;

import java.util.*;

public class 완주하지못한선수 {
	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		String answer = "";
		
		//key : value형태로 저장
		HashMap<String, Integer> map = new HashMap<>();

		//모든 참가자 명단을 map에 넣자. 
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0));
		}
		//"leo"; 0
		//"kiki"; 0
		//"eden"; 0
		
		//완주한 명단을 모든 참가자가 들어있는 
		//명단에서 찾아서 1을 증가 
		for (String player : completion) {
			map.put(player, map.get(player) + 1);
		}
		//1이 아닌 사람이 완주하지 못한 사람이므로,
		//answer에 넣어줌.
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			if(map.get(key) == 0 ) {
				answer = key;
			}
		}
		System.out.println("완주하지 못한 사람: " + answer);

	}
}
