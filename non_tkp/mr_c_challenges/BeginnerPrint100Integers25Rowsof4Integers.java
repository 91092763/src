package non_tkp.mr_c_challenges;

public class BeginnerPrint100Integers25Rowsof4Integers
{
  public static void main(String[] args)
  {
    int val = 1;
    for (int row = 1; row < 26; row++)
    {
      for (int col = 1; col < 5; col++)
      {
        System.out.print(val + " ");
        val = val + 1;
      }
      System.out.println();
    }
  }
}
