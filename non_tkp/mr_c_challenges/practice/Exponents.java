package non_tkp.mr_c_challenges.practice;

public class Exponents
{
  public static void main(String[] args)
  {
    int base = 2;
    int exponent = 3;
    int result = power(base, exponent);
    System.out.println("the answer is " + result);
  }
  //code up the power method
  public static int power(int base, int exp)
  {
    //write code to make this work
    //int result = 1;
    //Loop exp number of times
    int result = 1;
    for (int i = 0; i < exp; i++)
    {
      result = result * base;
    }
    return result;
  }
}
