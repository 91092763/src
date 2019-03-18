package non_tkp.mr_c_challenges.practice;

public class IntroToRecursion
{
  public static void main(String[] args)
  {
    int position = 46;
    // int numFibs = 40;
    int result = fib(position);
    // int result;
    System.out.println("fib(" + position + ") = " + result);
    //for(int pos = 1; pos <= numFibs; pos++)
    //{
    //result = fib(pos);
    System.out.print(result + " ");
  }
  public static int fib(int pos)
  {
    //base cases
    if (pos == 1) { return 1; }
    if (pos == 2) { return 1; }
    return fib(pos - 1) + fib(pos - 2);
  }
}
