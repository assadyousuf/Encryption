import java.util.Base64;
import java.util.Scanner; 

public class Julius {

	public static String encode (byte[] text)
	   {
		  return Base64.getEncoder().encodeToString(text);
	   }

	   public static byte[] decode (String text)
	   {
		  return Base64.getDecoder().decode(text);
	   }

	   public static byte[] encrypt(byte[] cleartext, byte key)
	   {
		  byte[] toReturn = new byte[cleartext.length];
		  for (int i = 0; i < cleartext.length; i++)
		  {
			 toReturn[i] = (byte) (cleartext[i] ^ key);
		  }
		  return toReturn;
	   }

	   
   
   public static byte[] decrypt(byte[] cleartext, byte key) {
	   byte[] toReturn = new byte[cleartext.length];
		  for (int i = 0; i < cleartext.length; i++)
		  {
			 toReturn[i] = (byte) (cleartext[i] ^ key);
		  }
		  
		  return toReturn;
	   
   }

   public static void main(String[] args)
   {
	  //System.out.println(encode(encrypt("test".getBytes(), (byte)0x80)));
	  //System.out.println(new String((encrypt(decode("9OXz9A=="), (byte)0x80))));
	   Scanner input = new Scanner(System. in);
	   String string="5f366eSo7On6/Puo7vrn5aj84O2o+unl+On6/Puo6ebsqPzn/+36+6So6ebsqPzg/fuo+O364fvg" + 
	   		"7eymqMnu/O36qPrt6+3h/uHm76jl6ebxqP/n/ebs+6jn5qjp5OSo++Hs7fukqOnm7Kjg6f7h5u+o" + 
	   		"7uf66+3sqObnqPjp+vyo5+6o/ODtqP/n+uP7pKj/4O3mqOzp8ajs+u3/qObh7+CkqO7t6frh5u+o" + 
	   		"5O37/Kj84O3xqPvg5/3k7Kjq7aj7/fr65/3m7O3sqOrxqOmo++nk5PGo5ens7aju+uflqPzg7ajg" + 
	   		"4e/g7fqo6+nl+Kjn5qj84O2o7fD45/vt7Kju5Onm46So/ODt8aj67fz67en87eyo/Oeo/ODt4fqo" + 
	   		"6+f95vz68eXt5qaoyv38qPzg5/vtqP/h/ODh5qSo/+Dh5Pv8qPzg7fGo6vrh5u+o7uf6/+n67Kj8" + 
	   		"4Of77aj84OHm7/uo/+Dh6+Co4OnsqOrt7eao+Prt+On67eyo6vGo3u366+Hm7+385/rh8Kju5/qo" + 
	   		"6aj76eTk8aSo7uHk5Kj9+Kj84O2o5u3p+u37/Kj8+u3m6+Dt+7Oo4On+4ebvqOzt5Onx7eyo6ajk" + 
	   		"5+bvqPzh5e2o4eao7fDt6/384ebvqPzg7fvtqOXn/u3l7eb8+6So/ODt8ajk7en65u3sqPzg7aj6" + 
	   		"7fz67en8qOfuqPzg7eH6qOvn/eb8+vHl7eao6u3u5/rtqPzg7fGo7Prt/6jm4e/gqPznqPzg7aju" + 
	   		"5/r84e7h6+n84efm+6ao3OD9+6j84O3xqPrt/P365u3sqPznqPzg7aj85//mqP/h/ODn/fyo6evr" + 
	   		"5+X45OH74OHm76j84O3h+qjn6uLt6/ymgoLE0NDQwcHBpmoIHNzg7ajP6f3k+6So4On+4ebvqOrt" + 
	   		"7eao/P/h6+2o+u34/eT77eyo/+H84Kjv+u3p/Kjk5/v7pKjr5+b7/eT8qP/g6fyo/ODt8aj74Of9" + 
	   		"5Oyo7OeyqPzg7fGo6f7p4eSo/ODt5fvt5P7t+6jn7qj84O2o4ebu5/rl6fzh5+ao5+6o/ODn++2o" + 
	   		"/+DnqP/t+u2o/+3k5Kjp6/n96eHm/O3sqP/h/OCo/ODtqOvn/eb8+vGzqO765+Wo/ODt5aj84O3x" + 
	   		"qOn76+36/Onh5qj84O2o+Of74fzh5+ao6ebsqO7n+vzh7uHr6fzh5+ao5+6o/ODtqP34+O36qOvp" + 
	   		"5fimqNzg7frtqP/p+6So5+ao/ODtqObn+vzgqPvh7O2kqOmo4OHk5KSo/+Dh6+Co5/36qOXt5qjr" + 
	   		"5/3k7Kjm5/yo4ebr5P3s7ajh5qj84O3h+qj/5/rj+6So5+ao6evr5/3m/Kjn7qj84O2o7fD87eb8" + 
	   		"qOfuqPzg7ajr4frr/eH8pKjp5uyo4OnsqObt6+37++n64eTxqOXp7O2o/ODt4fqo6+nl+Kjh5qjv" + 
	   		"+uf95uyo6eTl5/v8qOzh++ns/unm/Onv7ef9+6So6ebsqPj67fz88aj7/O3t+Kaoy+nh/fuoyeb8" + 
	   		"4fv84f37qNrt7+Hm/fukqOnm7KjL6eH9+6jL6ebh5uH9+6ja7erh5P37pKj8/+eo5+6o/ODtqOTh" + 
	   		"7f387ebp5vz7pKj/4fzgqPz/56jk7e/h5+b7pKj/7frtqOHmqPjn+/vt+/vh5+ao5+6o/ODh+6jr" + 
	   		"6eX4pqjc4O2o5O3p7O36+6jn7qj84O2o7ebt5fGkqODp/uHm76j67evn5ubn4fz67eyo/ODtqOvn" + 
	   		"/eb8+vGo6vGo/ODt4fqo++vn/fz7pKj77eTt6/yo7vrn5aj84O2o7eb84frtqOn65fGo++Hw/PGo" + 
	   		"/ODn/fvp5uyo5e3ms6jq7eTn5u/h5u+o/Oeo/ODn++2o+/zp/O37qP/g4evgqOrt6fqo/ODtqODh" + 
	   		"7+Dt+/yo6+Dp+unr/O36qO7n+qjr5/366e/tsqj84O3xqPj64f7p/O3k8ajp+vrp5u/tqOnl5+bv" + 
	   		"qPzg7eX77eT+7fuo/+Dp/Kj84O3xqP/h++Dt7Kj856jq7ajs5+btpKjp5uyo4eao/+Dp/Kjl6ebm" + 
	   		"7fqzqPzg7fGo7O3r4eztqPzg6fyo/ODtqOn8/Onr46j74Of95Oyo/Onj7aj45Onr7aj/4O3mqOH8" + 
	   		"qPvg5/3k7Kj77e3lqPznqOrtqObn5+amqNzg7fGo6fj45+Hm/Kjn/u36qPzg7eH6qO7n+uvt+6je" + 
	   		"7frv6fvh5OTp/eb9+6So/ODtqMn6/u365uHp5qSo5+btqOfuqPzg7aju5/36qO/t5u366eT7pKjp" + 
	   		"5uyo6ajm7en6qPrt5On84f7tqOfuqN7t+uvh5u/t/Of64fCmqMDtpKjg6f7h5u+o4fv7/e3sqO76" + 
	   		"5+Wo/ODtqOvp5fio6fyo/ODtqO7h+vv8qP/p/OvgpKjp5uyo4On+4ebvqOnk5ef7/Kjr5+X45O38" + 
	   		"7eyo4OH7qOXp+uvgqOmo5OH8/OTtqOrt7uf67aj84O2o7On/5qSo4OHsqODh5fvt5O6o6u3g4ebs" + 
	   		"qPzg7ajl5/3m/Onh5qSo6ebsqOf67O367eyo4OH7qPvn5Ozh7fr7qPznqPrt7vrt++Co/ODt5fvt" + 
	   		"5P7t+6jp7vzt+qj84O3h+qjk6ern/fqo7P364ebvqPzg7ajm4e/g/Kao3+Dt5qjm5+fmqObn/6j7";
	   //byte[] text=string.getBytes();  
	   
	   int v=0;
	   //System.out.println(new String((encrypt(decode(string), (byte)0x88))));
	   for (int t=0; t<256; t++) {
		 
		   
		   	  System.out.println("Key:"+ v);
			  System.out.println(new String((encrypt(decode(string), (byte)t))));
			  v++;
		   
	   }
	  
	   input.close();
	  
	  
	  
   }
}