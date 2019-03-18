package non_tkp;

import java.util.Scanner;

public class BeginnerAskNameAndSayHelloJavaInputoOutput
{
  public static void main(String[] args)
  {
    String prompt = "Enter your first name:";
    System.out.print(prompt);
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hello," + name);
  }
}
