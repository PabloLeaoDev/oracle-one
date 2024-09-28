package br.com.musicapp.main;

import br.com.musicapp.models.Music;
import br.com.musicapp.models.Podcast;

public class Main {

	public static void main(String[] args) {
		Music music = new Music("Dead Flowers", "True Defiance", "Dead Flowers", "Rock");
		
		for (int i = 0; i < 1000; i++) {
			music.reproduce();
		}
		
		for (int i = 0; i < 963; i++) {
			music.like();
		}
		
		music.classify();
		
		music.info();
		
		Podcast pod = new Podcast("PodDevLúcido", "Dev Ser Lúcido", "Podcast for lucid programmers.");
		
		for (int i = 0; i < 6000; i++) {
			pod.reproduce();
		}
		
		for (int i = 0; i < 5963; i++) {
			pod.like();
		}
		
		pod.classify();
		
		pod.info();
	}

}
