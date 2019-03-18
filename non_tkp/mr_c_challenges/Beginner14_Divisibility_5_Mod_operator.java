package non_tkp.mr_c_challenges;

import java.util.Scanner;

public class Beginner14_Divisibility_5_Mod_operator
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive integer: ");
    int num = scanner.nextInt();
    while (num < 1)
    {
      System.out.println("Bad input");
      System.out.println("Enter a positive integer: ");
      num = scanner.nextInt();
    }
    if (num % 5 == 0)
    {
    }
    else
    {
      System.out.println(num + " is NOT divisible by 5.");
    }
  }
}

