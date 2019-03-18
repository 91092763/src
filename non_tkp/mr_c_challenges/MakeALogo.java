package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;

public class MakeALogo
{
  public static int YValue = 300;
  public static int XValue = 100;
  public static void main(String[] args)
  {
    //  Show the Tortoise --#1
    Tortoise.show();
    //  Make the Tortoise draw a line as fast as possible --#2
    Tortoise.move(110);
    Tortoise.setSpeed(10);
    //  Setup the Color Wheel --#3 HINT: Use the TKPLogo object
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //  Draw a TKP 'T' --#4
    Tortoise.turn(72);
    //  Draw a left bracket --#8
    //  Draw a TKP 'K' --#5
    //  Draw a right bracket --#9
    //  Draw an outer TKP 'P' --#6
    //  Draw an inner TKP 'P' --#7
  }
}
