package non_tkp.mr_c_challenges.practice;

public class Strings04
{
  public static void main(String[] args)
  {
    String str = "hello";
    //           h e l l o
    //          0  1 2 3 4
    // use substring to print out 2nd and 3rd charecters
    System.out.println(str.substring(1, 3)); // expect "el"
    //us substring to get the 1st and 2nd charecters
    System.out.println(str.substring(0, 2)); // expect "he"
    //print out the 3rd and 4th charecters
    System.out.println(str.substring(2, 4)); // expect "ll"
    // print out the last 3 charecters
    System.out.println(str.substring(2, 5)); // expect "llo"
    // first 3 charecters
    System.out.println(str.substring(0, 3)); //expect "hel"
  }
}
