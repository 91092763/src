package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SimpleSquareVariation
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(30);
    int sides = MessageBox.askForNumericalInput("Enter the number of sides:");
    for (int i = 1; i <= sides; i++)
    {
      Tortoise.setPenWidth(20);
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(i * 4);
      Tortoise.turn(-360.0 * 3 / sides + i);
    }
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
    VirtualProctor.setClassName("Palm STEAM");
    VirtualProctor.setName("Izel");
  }
}
