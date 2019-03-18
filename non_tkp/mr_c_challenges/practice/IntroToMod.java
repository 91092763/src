package non_tkp.mr_c_challenges.practice;

import java.util.Scanner;

public class IntroToMod
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a positive integer:");
    int num = scan.nextInt();
    //simple/wrong way to do input validation
    //if (num < 1)
    //{
    //System.out.println("Bad input!");
    // System.exit(0);
    //}
    while (num < 1)
    {
      System.out.println("Not a positive number!");
      System.out.print("Enter a positive number:");
      num = scan.nextInt();
    }
    //if we get to here, num is a positive integer
    if (num % 7 == 0)
    {
      System.out.println(num + "is divisible by 7 .");
    }
    else
    {
      System.out.println(num + " is NOT divisible by 7 .");
    }
    scan.close();
  }
}
