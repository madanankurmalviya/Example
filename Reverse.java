public class Reverse
{
static String s = "AnkurMalviya1238080";
static public String rev = "";
    public static void main(String[]args)
     {
     	for( int a = s.length()-1 ; a>=0 ; a --)
	{
		rev = rev + s.charAt(a);
	}
	System.out.println(rev);
      }

}
