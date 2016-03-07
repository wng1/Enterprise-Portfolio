import java.security.SecureRandom;
import sun.misc.BASE64Encoder;

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
