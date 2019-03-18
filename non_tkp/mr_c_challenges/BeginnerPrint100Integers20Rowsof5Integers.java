package non_tkp.mr_c_challenges;

public class BeginnerPrint100Integers20Rowsof5Integers
{
  public static void main(String[] args)
  {
    int val = 1;
    for (int row = 1; row < 21; row++)
    {
      for (int col = 1; col < 6; col++)
      {
        System.out.print(val + " ");
        val = val + 1;
      }
      System.out.println();
    }
  }
}
