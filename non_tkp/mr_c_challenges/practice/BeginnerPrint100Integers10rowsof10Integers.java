package non_tkp.mr_c_challenges.practice;

public class BeginnerPrint100Integers10rowsof10Integers
{
  public static void main(String[] args)
  {
    int val = 0;
    for (int row = 1; row < 11; row++)
    {
      for (int col = 1; col < 11; col++)
      {
        System.out.print(val + " ");
        //val = val + 1;
        //val += 1;
        val++;
      }
      System.out.println();
    }
  }
}
