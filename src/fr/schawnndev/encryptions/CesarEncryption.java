package fr.schawnndev.encryptions;

import fr.schawnndev.encryptions.exceptions.DecryptError;
import fr.schawnndev.encryptions.exceptions.EncryptError;
import fr.schawnndev.utils.Numbers;

public class CesarEncryption implements IEncryption {

	private final char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };

	private final int encryptionKey = 4;

	@Override
	public String encrypt(String s) throws EncryptError {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if(Numbers.isNumber(c)) throw new EncryptError("Numbers aren't supported in this encryption!");
			int position = getPosition(c);
			position = position - encryptionKey < 0 ? 25 - position - encryptionKey : position - encryptionKey;
			sb.append(alphabet[position]);
		}

		return sb.toString();
	}

	@Override
	public String decrypt(String s) throws DecryptError {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if(Numbers.isNumber(c)) throw new DecryptError("Numbers aren't supported in this decryption!");
			int position = getPosition(c);
			position = position + encryptionKey > 25 ? position + encryptionKey - 25 : position + encryptionKey;
			sb.append(alphabet[position]);
		}

		return sb.toString();
	}

	private int getPosition(char c) {
		int pos = 0;
		for (char ch : alphabet) {
			if (ch == c)
				break;
			pos++;
		}
		return pos;
	}

}
