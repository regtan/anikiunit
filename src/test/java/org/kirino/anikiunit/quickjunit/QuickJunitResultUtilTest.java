package org.kirino.anikiunit.quickjunit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.kirino.anikiunit.context.Context;

public class QuickJunitResultUtilTest {

	@Test
	public void テスト結果にOKが含まれていたらGREEN() {
		assertThat(QuickJunitResultUtil.discemResult("OK"), is(Context.GREEN));
	}

	@Test
	public void テスト結果にERRORが含まれていたらRED() {
		assertThat(QuickJunitResultUtil.discemResult("ERROR"), is(Context.RED));
	}

	@Test
	public void テスト結果にFAILが含まれていたらRED() {
		assertThat(QuickJunitResultUtil.discemResult("FAIL"), is(Context.RED));
	}

}
