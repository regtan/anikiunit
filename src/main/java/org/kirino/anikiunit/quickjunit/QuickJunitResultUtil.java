package org.kirino.anikiunit.quickjunit;

import org.kirino.anikiunit.context.Context;

public class QuickJunitResultUtil {

	public static Context discemResult(String junitResult) {
		return junitResult.contains(Context.OK.name()) ? Context.GREEN : Context.RED;
	}

}
