package br.com.musicapp.models;

public class Music extends Audio {
	private final String album;
	private final String artist;
	private final String gender;
	
	public Music(String title, String album, String artist, String gender) {
		super(title);
		this.album = album;
		this.artist = artist;
		this.gender = gender;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getGender() {
		return gender;
	}

	@Override
	public void info() {
		String informations = """
				Title: %s
				Total reproductions: %d
				Likes: %d
				Classification: %d
				Album: %s
				Artist: %s
				Gender: %s
				
				""";
		System.out.printf(informations, getTitle(), getTotalReproductions(), getLikes(), getClassification(), 
				getAlbum(), getArtist(), getGender());
	}
}
