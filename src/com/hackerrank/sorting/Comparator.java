package com.hackerrank.sorting;

public class Comparator {

}


class Checker implements java.util.Comparator<Player> {
	public int compare(Player a, Player b) {
		return (b.score != a.score)? b.score-a.score: a.name.compareTo(b.name);
    }
}

class Player{
	String name;
	int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
