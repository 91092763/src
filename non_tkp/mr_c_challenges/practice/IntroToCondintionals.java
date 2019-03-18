package non_tkp.mr_c_challenges.practice;

public class IntroToCondintionals
{
  public static void main(String[] args)
  {
    boolean isComingOverBridge = false;
    char myChar = 'a';
    if (isComingOverBridge)
    {
      System.out.println("shun them");
    }
    else
    {
      System.out.println("greet them");
    }
    if (myChar == 'a')
    {
      System.out.println("it's an a!");
    }
    else if (myChar == 'b')
    {
      System.out.println("it's b!");
    }
    else if (myChar == 'c')
    {
      System.out.println("it's c!");
    }
    else
    {
      System.out.println("not a, not b, and not c");
    }
  }
}
