package br.com.guiahand.dao;

public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6083967382641754280L;

	public DAOException() {
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		super(cause);
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

}
