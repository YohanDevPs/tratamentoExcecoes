package model.exception;

public class BusinessEception extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BusinessEception(String msg) {
		super(msg);
	}
}