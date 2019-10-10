import java.util.Base64;

public class Alan {

   public static String encode (byte[] text)
   {
	  return Base64.getEncoder().encodeToString(text);
   }

   public static byte[] decode (String text)
   {
	  return Base64.getDecoder().decode(text);
   }

   public static byte[] encrypt(byte[] cleartext, String key)
   {
	  byte[] toReturn = new byte[cleartext.length];
	  byte[] keyBytes = key.getBytes();
	  for (int i = 0; i < cleartext.length; i++)
	  {
		 toReturn[i] = (byte) (cleartext[i] ^ keyBytes[i % keyBytes.length]);
	  }
	  return toReturn;
   }
   
   
 
   

   public static void main(String[] args)
   {
	   String string="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" + 
	   		"JkxYVjQ=";
	   
	  //System.out.println(encode(encrypt("this is a test".getBytes(), "12")));
	  

		System.out.println(new String((encrypt(decode(string), "O/9\"]"))));
	   
	
	   
   }
}
