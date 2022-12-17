import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.PrivateKey;
import java.security.PublicKey;

public class BobObject {

    private static final int GCM_TAG_LENGTH = 16 ;

    protected String decryptAES(byte[] encryptedmsg, SecretKey key, byte[] iv) throws Exception{
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

        SecretKeySpec key1 = new SecretKeySpec(key.getEncoded(), "AES");

        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);

        cipher.init(Cipher.DECRYPT_MODE, key1 ,gcmParameterSpec);

        byte[] decryptText = cipher.doFinal(encryptedmsg);
        return new String(decryptText);
    }

    protected byte[] decryptRSA(byte[] encryptedmsg, PrivateKey key) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedTextArray = cipher.doFinal(encryptedmsg);
        return new String(decryptedTextArray).getBytes();


    }
}
