package non_tkp.mr_c_challenges.practice;

public class IntroToStrings
{
  public static void main(String[] args)
  {
    String myStr = "Izel Saucedo ";
    int strLen = findStrLength(myStr);
    {
      System.out.println("The string length of  " + myStr + "= " + strLen);
      firstChar("hello");
    }
  }
  public static int findStrLength(String str)
  {
    return str.length();
  }
  public static char firstChar(String str)
  {
    return str.charAt(0);
  }
}
