package net.fornwall.eclipsescript.scripts;

public class ScriptException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final int lineNumber;

	private final boolean showStackTrace;

	public ScriptException(String message, Throwable cause, int lineNumber, boolean showStackTrace) {
		super(message, cause);
		this.lineNumber = lineNumber;
		this.showStackTrace = showStackTrace;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public boolean isShowStackTrace() {
		return showStackTrace;
	}
}
