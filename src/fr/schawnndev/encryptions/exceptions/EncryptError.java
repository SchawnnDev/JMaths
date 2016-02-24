package fr.schawnndev.encryptions.exceptions;

public class EncryptError extends Exception {
	private static final long serialVersionUID = 6325320583825262030L;

	public EncryptError(String message) {
		super("EncryptError: " + message);
	}

}
