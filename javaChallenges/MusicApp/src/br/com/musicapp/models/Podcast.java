package br.com.musicapp.models;

public class Podcast extends Audio {
	private final String host;
	private final String description;
	
	public Podcast(String title, String host, String description) {
		super(title);
		this.host = host;
		this.description = description;
	}
	
	public String getHost() {
		return host;
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public void info() {
		String informations = """
				Title: %s
				Total reproductions: %d
				Likes: %d
				Classification: %d
				Host: %s
				Description: %s
				
				""";
		System.out.printf(informations, getTitle(), getTotalReproductions(), getLikes(), getClassification(), 
				getHost(), getDescription());
		
	}
}
