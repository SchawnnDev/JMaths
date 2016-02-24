package fr.schawnndev.tests.encryptions;

import fr.schawnndev.encryptions.CesarEncryption;
import fr.schawnndev.encryptions.IEncryption;
import fr.schawnndev.encryptions.exceptions.DecryptError;
import fr.schawnndev.encryptions.exceptions.EncryptError;
import fr.schawnndev.tests.ITest;

public class CesarEncryptionTest implements ITest {

	private final IEncryption cesarEncryption = new CesarEncryption();

	@Override
	public void test(boolean debug) {

		try {
			String textToEncrypt = "enquete";
			String encryptedText = cesarEncryption.encrypt(textToEncrypt);
			System.out.println("Text to encrypt: " + textToEncrypt);
			System.out.println("Encrypted text: " + encryptedText);
			System.out.println("Decrypted text: " + cesarEncryption.decrypt(encryptedText));
		} catch (EncryptError | DecryptError e) {
			e.printStackTrace();
		}

	}

}
