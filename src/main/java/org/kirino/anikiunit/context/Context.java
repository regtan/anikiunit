package org.kirino.anikiunit.context;

public enum Context {
	OK, ERROR, FAIL, GREEN, RED, ANIKI, MIKU, VOICE;

	String toString(Context context) {
		return context.name().toLowerCase();
	}
}
