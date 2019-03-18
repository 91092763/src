package org.teachingkidsprogramming.section09final;

import org.teachingextensions.logo.Tortoise;

public class RectangleKata
{
  public static void main(String[] args)
  {
    Tortoise.show();
    int length = 100;
    int width = 50;
    //    Draw a rectangle
    drawRectangle(length, width);
    //    Write the steps to code your rectangle out in English 
    //    Translate from English to Java one line at a time
    //    Run your code after each line of Java to make sure it works as expected
    //    XTRA CREDIT: After your code is working, re-factor to remove duplication
  }
  private static void drawRectangle(int length, int width)
  {
    for (int i = 0; i < 2; i++)
      Tortoise.move(length);
    Tortoise.turn(90);
    Tortoise.move(width);
    Tortoise.turn(90);
    Tortoise.move(length);
    Tortoise.turn(90);
    Tortoise.move(width);
  }
}
