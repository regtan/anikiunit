package org.kirino.anikiunit.player;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.kirino.anikiunit.context.Context;

public class PlayerTest {

	@Test
	public void 音声を再生する() throws Exception {
		Player player = new Player();
		player.play("/aniki/green.wav");
	}

	@Test
	public void 引数で与えられた音声タイプがANIKIのときはANIKI声モード() throws Exception {
		Player player = new Player();
		System.setProperty(Context.VOICE.toString(), "ANIKI");
		assertThat(player.select(), is(Context.ANIKI));

		System.setProperty(Context.VOICE.toString(), "aniki");
		assertThat(player.select(), is(Context.ANIKI));
	}

	@Test
	public void 引数で与えられた音声タイプがMIKUの時はMIKU声モード() throws Exception {
		Player player = new Player();
		System.setProperty(Context.VOICE.toString(), "MIKU");
		assertThat(player.select(), is(Context.MIKU));

		System.setProperty(Context.VOICE.toString(), "miku");
		assertThat(player.select(), is(Context.MIKU));
	}

	@Test
	public void 引数で音声タイプが指定されてない場合はANIKI声モード() throws Exception {
		Player player = new Player();
		System.clearProperty(Context.VOICE.toString());
		assertThat(player.select(), is(Context.ANIKI));
	}

	@Test
	public void 引数で音声タイプが当てはまらない場合はANIKI声モード() throws Exception {
		Player player = new Player();
		System.setProperty(Context.VOICE.toString(), "ほげほげ");
		assertThat(player.select(), is(Context.ANIKI));
	}

}
