package br.com.musicapp.models;

public abstract class Audio {
	private String title;
	private int totalReproductions;
	private int likes;
	private int classification;
	
	public Audio(String title) {
		setTitle(title);
	}
	
	private void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public int getTotalReproductions() {
		return totalReproductions;
	}

	public int getLikes() {
		return likes;
	}

	public int getClassification() {
		return classification;
	}

	public void reproduce() {
		totalReproductions++;
	}
	
	public void like() {
		likes++;
	}
	
	public void classify() {
		final double likesAndReproductionsRelationship = totalReproductions / likes;
		
		boolean classification5 = likesAndReproductionsRelationship >= 0 && likesAndReproductionsRelationship <= 2;
		boolean classification4 = likesAndReproductionsRelationship > 2 && likesAndReproductionsRelationship <= 3;
		boolean classification3 = likesAndReproductionsRelationship > 3 && likesAndReproductionsRelationship <= 5;
		boolean classification2 = likesAndReproductionsRelationship > 5 && likesAndReproductionsRelationship <= 10;
		
		if (classification5) {
			classification = 5;
		} else if (classification4) {
			classification = 4;
		} else if (classification3) {
			classification = 3;
		} else if (classification2) {
			classification = 2;
		} else {
			classification = 1;
		}
	}
	
	public abstract void info();
}
