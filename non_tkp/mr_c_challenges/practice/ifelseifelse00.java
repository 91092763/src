package non_tkp.mr_c_challenges.practice;

public class ifelseifelse00
{
  public static void main(String[] args)
  {
    char letter = 'e';
    System.out.println(vowelOrConsonant(letter));
  }
  //create and test a method that takes in a charecter and
  //determines if it is a vowel or a consont. Return a string
  //saying either "vowel" or "consonant"
  public static String vowelOrConsonant(char letter)
  {
    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') { return "vowel"; }
    return "consonant";
  }
}
