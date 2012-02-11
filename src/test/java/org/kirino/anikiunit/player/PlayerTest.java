package org.kirino.anikiunit.player;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void 音声を再生する() throws Exception {
		Player player = new Player();
		player.play("/aniki/green.wav");
	}

}
