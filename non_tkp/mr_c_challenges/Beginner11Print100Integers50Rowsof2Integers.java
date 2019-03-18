package non_tkp.mr_c_challenges;

public class Beginner11Print100Integers50Rowsof2Integers
{
  public static void main(String[] args)
  {
    int val = 1;
    for (int row = 1; row < 51; row++)
    {
      for (int col = 1; col < 3; col++)
      {
        System.out.print(val + " ");
        val = val + 1;
      }
      System.out.println();
    }
  }
}
