package org.teachingkidsprogramming.section02methods;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height); // calls drawHouse method passing it 1 parameter: int varible named height
    drawHouse(120); // calls drawHouse method passing it 1 perameter: integer literal of 120
    drawHouse(90); // calls drawHouse, passes integer literal 50
    drawHouse(20); // calls drawHouse method, passes it integer literal 20
  } // end of main method
  private static void drawHouse(int height)
  {
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(Color.blue);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  } // end of drawHouse method
}// end of class houses
