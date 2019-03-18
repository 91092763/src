package non_tkp.mr_c_challenges;

public class BeginnerPrint100Integers2Rowsof50Integers
{
  public static void main(String[] args)
  {
    int val = 1;
    for (int row = 1; row < 3; row++)
    {
      for (int col = 1; col < 51; col++)
      {
        System.out.print(val + " ");
        val = val + 1;
      }
      System.out.println();
    }
  }
}
