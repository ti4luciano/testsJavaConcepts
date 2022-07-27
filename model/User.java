package model;

public class User {
	
	private String name;
	private int points;
	private boolean moderate;
	
	public User(String name, int points) {
		this.points = points;
		this.name = name;
		this.moderate = true;
	}
	
	
	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public boolean isModerate() {
		return moderate;
	}
	public void turnModerate() {
		this.moderate = true;
	}
	
}
