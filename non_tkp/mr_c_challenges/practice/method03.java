package non_tkp.mr_c_challenges.practice;

public class method03
{
  public static void main(String[] args)
  {
    //    int result = sum(2, 3);
    //    System.out.println(result);
    //    result = product(2, 6);
    //    System.out.println(result);
    //    result = greater(10, 20);
    //    boolean result2 = divisible(10, 5);
    //    System.out.println(result2);
    int result = greatest(1, 2, 3);
    System.out.println(result); // <-- Should be 3
    result = greatest(1, 3, 2);
    System.out.println(result);// <-- Should be 3
    result = greatest(3, 1, 2);
    System.out.print(result);// <-- Shoudld be 3
    result = greatest(3, 3, 1);
    System.out.println(result);// <-- Should be 3
    result = greatest(3, 1, 3);
    System.out.print(result);// <-- Shoudld be 3
    result = greatest(3, 3, 3);
    System.out.print(result);// <-- Shoudld be 3
    result = greatest(-4, -5, -6);
    System.out.print(result);// <-- Shoudld be -4
  }
  //make and test a method named greatest that takes in
  // 3 int prams and returns the greatest as an int
  public static int greatest(int a, int b, int c)
  {
    //int greatest = a;
    if (a > b)
    {// a > b
      if (a > c)
      {
        return a;
      }
      else // c > a
      {
        return c;
      }
    }
    else
    { // a is not the greatest, so just test b and c
      if (b > c) { return b; }
      return c;
    }
  }
  public static int sum(int a, int b)
  {
    return a + b;
  }
  // make  and call a method named product that takes
  // in 2 int parameters and returns the product of
  // the two given parameters an int
  public static int product(int a, int b)
  {
    return a * b;
  }
  //make and test a method named greater that takes in
  // 2 int parameters and returns the one that is greater
  //as an int
  public static int greater(int a, int b)
  {
    if (a > b)
    {
      return a;
    }
    else
    {
      return b;
    }
  }
  //make and call a method named divisible
  //that takes 2 int params: let's call the
  //first param 'divided' and the second param
  //'divisibleBy' Return a boolean that tells
  //you whether or not param1 is divisble by param2
  private static boolean divisible(int divided, int divisibleBy)
  {
    if (divided % divisibleBy == 0) { return true; }
    return false;
  }
}// end of class
