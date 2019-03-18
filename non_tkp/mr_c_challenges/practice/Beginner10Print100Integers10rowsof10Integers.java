package non_tkp.mr_c_challenges.practice;

public class Beginner10Print100Integers10rowsof10Integers
{
  public static void main(String[] args)
  {
    int num = 1;
    for (int row = 0; row < 10; row++)
    {
      for (int col = 0; col < 10; col++)
      {
        System.out.print(num + " ");
        num = num + 1;
      }
      System.out.println();
    }
  }
}
