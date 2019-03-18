package non_tkp.mr_c_challenges.practice;

public class Strings03
{
  public static void main(String[] args)
  {
    String input = "Hello";
    System.out.println(reverse5(input));
  }
  public static String reverse5(String str)
  {
    String output = "";
    output = output + str.charAt(4);
    output += str.charAt(3);
    output += str.charAt(2);
    output += str.charAt(1);
    output += str.charAt(0);
    return output;
  }
}
