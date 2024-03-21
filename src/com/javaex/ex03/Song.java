package com.javaex.ex03;

/*
 * 6개 파라미터를 받는 생성자에서 5개를 받는 생성자도 같이 부르기 때문에
 * 2줄이 출력될것이다.
 * 
 * 
 * song 파라미터5개
 * song 파라미터6개
 */

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("Song(파라미터0개)");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터5개)");
	}
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터6개)");
	}
		
}



