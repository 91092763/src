package org.teachingkidsprogramming.section09final;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTDD
{
  //   For the numbers being tested, print out either that number, or, 
  //    If that number is divisible by 3, then print the word 'Fizz', 
  //    If that number is divisible by 5, then print the word 'Buzz', 
  //    If that number is divisible by 3 and 5, then print the word 'FizzBuzz'
  //
  //    Write tests using the Assert object via the TDD style
  //
  //    For more complete directions see this page
  //    https://www.penflip.com/lynnlangit/tkp-lesson-plans/blob/master/course09.txt
  @Test
  public void test1Returns1()
  {
    String result = FizzBuzzTDD.convert(1);
    assertEquals("1", result);
  }
  @Test
  public void test2Return2()
  {
    String result = FizzBuzzTDD.convert(2);
    assertEquals("2", result);
  }
  @Test
  public void test3ReturnFizz()
  {
    String result = FizzBuzzTDD.convert(3);
    assertEquals("Fizz", result);
  }
  @Test
  public void test5ReturnBuzz()
  {
    String result = FizzBuzzTDD.convert(5);
    assertEquals("Buzz", result);
  }
  @Test
  public void test15ReturnFizzBuzz()
  {
    String result = FizzBuzzTDD.convert(15);
    assertEquals("FizzBuzz", result);
  }
  public void test90ReturnFizzBuzz()
  {
    String result = FizzBuzzTDD.convert(90);
    assertEquals("FizzBuzz", result);
  }
  public static String convert(int i)
  {
    if (i % 15 == 0)
    {
      return "FizzBuzz";
    }
    else if (i % 3 == 0)
    {
      return "Fizz";
    }
    else if (i % 5 == 0)
    {
      return "Buzz";
    }
    else
    {
      return i + "";
    }
  }
}
