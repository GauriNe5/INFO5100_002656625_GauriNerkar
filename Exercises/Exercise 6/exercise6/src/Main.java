import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class Main {
        private static final int AES_KEY_SIZE = 256;

        private static final int GCM_IV_LENGTH = 12;

        private static SecretKey secretKey = null;

        private static byte[] IV= new byte[0];

        private static PublicKey publicKey = null;

        private static PrivateKey privateKey = null;

        static AliceObject alice1 = new AliceObject("Hello Bob, how was your day?");

        static BobObject bob1 = new BobObject();

        protected static void generateAESKey() throws Exception{
            KeyGenerator keyGenerator= KeyGenerator.getInstance("AES");
            keyGenerator.init(AES_KEY_SIZE);

            // Generate a Key

                secretKey = keyGenerator.generateKey();
                IV = new byte[GCM_IV_LENGTH];
                SecureRandom random = new SecureRandom();
                random.nextBytes(IV);
        }

        protected static void generateRSAKey() throws Exception{
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
                keyPairGenerator.initialize(2048);

                KeyPair keyPair = keyPairGenerator.generateKeyPair();

                publicKey = keyPair.getPublic();
                privateKey = keyPair.getPrivate();

        }

        protected static void SignAndValidate() throws Exception{
                Signature signature = Signature.getInstance("SHA256withRSA");
                signature.initSign(privateKey);

                signature.update(alice1.message.getBytes(StandardCharsets.UTF_8));

                byte[] sign = signature.sign();

                Signature publicSign = Signature.getInstance("SHA256withRSA");
                publicSign.initVerify(publicKey);

                publicSign.update(alice1.message.getBytes(StandardCharsets.UTF_8));

                boolean isCorrect = publicSign.verify(sign);

        }

        public static void main(String[] args) throws Exception {
                System.out.println("AES Encryption and Decryption");
                generateAESKey();
                System.out.println("Message from Alice : " + alice1.message);

                byte[] encryptedMessage = alice1.AesEncrypt(alice1.message, secretKey, IV);
                System.out.println("Encrypted message is:" + (encryptedMessage));

                String decryptedMessage = bob1.decryptAES(encryptedMessage,secretKey, IV );
                System.out.println("Bob received message from Alice : " + decryptedMessage);

                generateRSAKey();

                SignAndValidate();



                System.out.println("\nRSA Encryption and Decryption");

                System.out.println("Message from Alice : " + alice1.message);



                encryptedMessage = alice1.RsaEncrypt(alice1.message, publicKey);
                System.out.println("Encrypted message is:" + (encryptedMessage));

                String decryptedtext = String.valueOf(bob1.decryptRSA(encryptedMessage,privateKey));
                System.out.println("Bob received message from Alice : " + decryptedtext);


        }



}