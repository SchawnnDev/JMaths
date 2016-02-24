package fr.schawnndev.encryptions;

import fr.schawnndev.encryptions.exceptions.DecryptError;
import fr.schawnndev.encryptions.exceptions.EncryptError;

public interface IEncryption {

	String encrypt(String s) throws EncryptError;

	String decrypt(String s) throws DecryptError;

}
