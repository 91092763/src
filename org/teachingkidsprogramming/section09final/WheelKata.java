package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;

public class WheelKata
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Draw a wheel
    // do the following 360 times
    int i = 0;
    while (i < 360)
    {
      // move tortoise forward
      Tortoise.move(1);
      //turn tortoise 1 degree
      Tortoise.turn(1);
      i++;
    }
    //    Write the steps to code your wheel out in English 
    //    Translate from English to Java one line at a time
    //    Run your code after each line of Java to make sure it works as expected
    //    XTRA CREDIT: After your code is working, re-factor to remove duplication
  }
}
