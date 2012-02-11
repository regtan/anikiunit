package org.kirino.anikiunit.main;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.kirino.anikiunit.player.Player;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException,
			InterruptedException {
		Player player = new Player();
		player.play("/aniki/green.wav");
	}
}
