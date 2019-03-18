package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Purples.BlueViolet);
    //    Add Violet to the Color Wheel --#8
    ColorWheel.addColor(PenColors.Purples.Violet);
    //    Add Purple to the Color Wheel --#9
    ColorWheel.addColor(PenColors.Purples.Purple);
    for (int i = 0; i < 1000; i++)
    {
      try
      {
        //         Change the pen color of the line the tortoise draws the next color on the Color Wheel --#6
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(i / 10);
        Tortoise.turn(360 / 30);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
    }
  }
}
