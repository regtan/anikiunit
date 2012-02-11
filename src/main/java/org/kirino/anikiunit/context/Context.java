package org.kirino.anikiunit.context;

public enum Context {
	OK, ERROR, FAIL, GREEN, RED;

	String toString(Context context) {
		return context.name().toLowerCase();
	}
}
