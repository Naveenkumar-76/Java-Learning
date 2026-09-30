package LinkedListChallenges;

import java.util.LinkedList;

public class FinalLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> scores = new LinkedList<>();

		scores.add(45);
		scores.add(82);
		scores.add(36);
		scores.add(91);
		scores.add(55);
		scores.add(28);
		scores.add(76);
		
//		write program to remove every student whose score is below 50.
		
		LinkedList<Integer> lowScores = new LinkedList<>();
		
		for(int i = 0; i < scores.size(); i++) {
			int score = scores.get(i);
			if(score < 50) 
				lowScores.add(score);
		}
		
		System.out.println(scores);
		System.out.println(lowScores);
		
		scores.removeAll(lowScores);
		System.out.println(scores);
		
	}

}
