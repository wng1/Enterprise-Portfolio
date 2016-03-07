import java.security.SecureRandom;
import sun.misc.BASE64Encoder;


//Use JRE 1.4.1 on Windows or JRE 1.4.2 on Linux to test
public class cryto
{
  public static void main(String[] args)
  {
    try
    { 
    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG"):
    byte[] bytes = new bytes[512];
    sr.nextBytes(bytes);
    
    System.out.println("Using nextBytes" + sr.nextDouble());
    }
  }
}
