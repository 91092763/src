package org.teachingkidsprogramming.section09final;

import org.junit.Test;
import org.teachingextensions.approvals.lite.Approvals;

public class FizzBuzzGoldenMaster
{
  //    Write a test using the GoldenMaster method via the TDD style for the convert method
  //    IMPORTANT - GoldenMaster testing requires the use a of file compare tool
  //    Download 'BeyondCompare' -- http://www.scootersoftware.com/download.php
  @Test
  public void testNumbers() throws Exception
  {
    //  Arrange     Create a list of numbers from 1-100
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < 101; i++)
    {
      sb.append(convert(i));
    }
    System.out.println(sb);
    //  Act         Call the convert method on the list
    //  Verify      The list is a Golden Master (uses .received and .approved files)
    Approvals.verify(sb);
  }
  public static String convert(int i)
  {
    //  For the whole numbers from 1 to 100, print either that number, or,
    if (i % 15 == 0)
    {
      return "\nFizzBuzz";
    }
    else if (i % 3 == 0)
    {
      return "\nFizz";
    }
    else if (i % 5 == 0) { return "\nBuzz"; }
    return "\n" + i;
  }
}
