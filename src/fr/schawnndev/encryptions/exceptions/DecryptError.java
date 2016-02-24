package fr.schawnndev.encryptions.exceptions;

public class DecryptError extends Exception {
	private static final long serialVersionUID = 3633349523650662104L;

	public DecryptError(String message) {
		super("DecryptError: " + message);
	}

}
