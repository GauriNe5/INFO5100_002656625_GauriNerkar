import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.PublicKey;

public class AliceObject {

    private static final int GCM_TAG_LENGTH = 16 ;
    protected String message;

    public AliceObject(String message){
        this.message = message;
    }

    protected byte[] AesEncrypt(String message, SecretKey secretKey, byte[] iv) throws Exception{
        Cipher cipher=  Cipher.getInstance("AES/GCM/NoPadding");

        SecretKey secretKey1 = new SecretKeySpec(secretKey.getEncoded(), "AES");

        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);

        cipher.init(Cipher.ENCRYPT_MODE, secretKey1,gcmParameterSpec);

        byte[] cipherText = cipher.doFinal(message.getBytes());
        return cipherText;
    }

    protected byte[] RsaEncrypt(String message, PublicKey key) throws Exception{
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cipherText = cipher.doFinal(message.getBytes());
        return cipherText;


    }
}
