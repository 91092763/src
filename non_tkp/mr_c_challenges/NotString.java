package non_tkp.mr_c_challenges;

public class NotString
{
  public static void main(String[] args)
  {
    String theString = "candy ";
    System.out.println(notString(theString));
  }
  //Given a string, return a new string where
  //"not " has been added to the front. However, 
  //if the string already begins with "not", return 
  //the string unchanged. Note: use .equals() to 
  //compare 2 strings.
  public static String notString(String str)
  {
    if (str.length() >= 3)
    {
      if (str.substring(0, 3).equals(" not ")) { return str; }
    }
    return "not" + str;
  }
}
