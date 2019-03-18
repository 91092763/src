package non_tkp.mr_c_challenges;

public class Beginner07Print100Integers5Rowsof20Integers
{
  public static void main(String[] args)
  {
    int val = 1;
    for (int row = 1; row < 6; row++)
    {
      for (int col = 1; col < 21; col++)
      {
        System.out.print(val + " ");
        val = val + 1;
      }
      System.out.println();
    }
  }
}
