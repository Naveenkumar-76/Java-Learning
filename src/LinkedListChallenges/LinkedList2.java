package LinkedListChallenges;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
//		Challenge 3 — Browser History
//
//		Create:
//
//		LinkedList<String> history
//
//		Initially:
//
//		google.com
//		youtube.com
//		github.com
//
//		Perform:
//
//		Add "stackoverflow.com" at the end.
//		Remove "youtube.com".
//		Add "chatgpt.com" at the beginning.
//		Display the first visited website.
//		Display the most recently visited website.
//		Display the final history.
		
		LinkedList<String> history = new LinkedList<>();
		
		history.add("google.com");
		history.add("youtube.com");
		history.add("github.com");
		
		System.out.println(history);
		
		history.addLast("stackoverflow.com");
		
		System.out.println(history);
		
		history.remove(1);
		
		System.out.println(history);
		
		history.addFirst("chatgpt.com");
		
		System.out.println(history);
		
		System.out.println(history.getFirst());
		
		System.out.println(history.peekFirst());
		
		System.out.println(history);
		
//		Challenge 4 — Music Playlist
//
//		A playlist contains:
//
//		Song A
//		Song B
//		Song C
//		Song D
//
//		Perform:
//
//		Add "Song E" at the end.
//		Add "Song X" at the beginning.
//		Remove "Song C".
//		Replace "Song B" with "Song Y".
//		Display the playlist from beginning to end.
//		Display the first and last songs.
//
//		Expected:
//
//		[Song X, Song A, Song Y, Song D, Song E]
		
		LinkedList<String> playlist = new LinkedList<>();
		
		playlist.add("Song A");
		playlist.add("Song B");
		playlist.add("Song C");
		playlist.add("Song D");
		
		System.out.println(playlist);
		
		playlist.addLast("Song E");
		
		System.out.println(playlist);
		
		playlist.addFirst("Song X");
		
		System.out.println(playlist);
		
		playlist.remove(3);
		
		System.out.println(playlist);
		
		playlist.set(2, "Song Y");
		
		System.out.println(playlist);
		
		System.out.println(playlist.peekFirst());
		
		System.out.println(playlist.peekLast());
		
		System.out.println(playlist);
	}

}
