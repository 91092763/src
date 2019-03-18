package non_tkp.mr_c_challenges.practice;

public class Strings02
{
  public static void main(String[] args)
  {
    String str = "";
    char result = secondChar(str);
    System.out.println(result);
    result = lastChar(str);
    System.out.println(result);
  }//end of main method
  public static char secondChar(String str)
  {
    if (str.length() < 2) { return '!'; }
    return str.charAt(1);
  }
  public static char lastChar(String str)
  {
    if (str.length() == 0) { return '!'; }
    int indexOfLastChar = str.length() - 1;
    return str.charAt(indexOfLastChar);
  }
  //make and call a method named secondChar
  //that takes a string and returns the
  //second character in the string using
  //charAt(1). Be careful to check that you
  //have 2 characters before you call
  // charAt(1). If there is no 2nd character,
  //return '!'
  // write and test a method name lastChar
  // that takes in a String parameters and returns
  // the last character in the string. Be careful
  // to test for empty string
  //To use charAt() method we need an index
}//end of class
