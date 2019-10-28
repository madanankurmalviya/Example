import java.util.HashMap;
import java.util.Map.Entry;
public class HashMapDup1
{
	static String str = "she is a man he is a boy he is a girl boy gir man man man man man";
	static String [] st =str.split(" ");
	
	public static void main (String [] args)
	{
HashMap<String , Integer> hm = new HashMap<String,Integer>();
	    for(String s : st)
	        {	
		if(hm.get(s)!=null)
		    {
		        hm.put(s,s.length());
		    }
	        else
	            {	
	                 hm.put(s,1);
		    }	
	        }
	      System.out.println(hm);
	      for(Entry<String,Integer> e : hm.entrySet())
	      {
	      	    if(e.getValue()>1)
		       {
		       	 System.out.println("The duplicates value is :"+e.getKey()+"\t"+e.getValue()+"times.");
		       }
		    
	      }
	}
}
