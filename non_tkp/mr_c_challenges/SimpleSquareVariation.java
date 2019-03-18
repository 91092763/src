package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    VirtualProctor.setClassName("Palm STEAM");
    VirtualProctor.setName("Izel");
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 1; i <= 3; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(100);
      Tortoise.turn(120);
    }
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
