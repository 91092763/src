package org.teachingkidsprogramming.section09final;

public class FizzBuzz
{
  public static void main(String[] args)
  {
    //   For the whole numbers from 1 to 100, print either that number, or,
    for (int i = 1; i < 100; i++)
    {
      if (i % 3 != 0 && i % 5 != 0)
      {
        System.out.println(i);
      }
      if (i % 3 == 0 && i % 5 != 0)
      {
        System.out.println("Fizz");
      }
      if (i % 3 != 0 && i % 5 == 0)
      {
        System.out.println("Buzz");
      }
      if (i % 3 == 0 && i % 5 == 0)
      {
        System.out.println("FizzBuzz");
      }
    }
    //    If that number is divisible by 3, then print the word 'Fizz', 
    //    If that number is divisible by 5, then print the word 'Buzz', 
    //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
    //    NOTE: this is a kata (higher level instructions)
    //    part of the exercise is to translate into line-by-line English, THEN Java
    //
    //    For more complete directions see this page
    //  https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  }
}
