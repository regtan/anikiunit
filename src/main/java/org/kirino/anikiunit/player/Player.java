package org.kirino.anikiunit.player;

import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.kirino.anikiunit.context.Context;

public class Player {

	public void play(String path) throws UnsupportedAudioFileException, IOException, LineUnavailableException,
			InterruptedException {
		AudioInputStream ais = AudioSystem.getAudioInputStream(this.getClass().getResourceAsStream(path));
		Clip clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
		clip.open(ais);
		clip.start();
		while (clip.isRunning()) {
			Thread.sleep(100);
		}
		clip.close();
	}

	public Context select() {
		String voiceType = System.getProperty(Context.VOICE.toString());
		if (voiceType == null) {
			return Context.ANIKI;
		}
		return voiceType.equalsIgnoreCase(Context.MIKU.name()) ? Context.MIKU : Context.ANIKI;
	}
}
