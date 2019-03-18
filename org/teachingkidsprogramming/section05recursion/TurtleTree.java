package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Turn the background black  --#21
    int length = 60;
    //    drawBranch(recipe below) --#2.1
    //
    //    ------------- Recipe for drawBranch --#2.2
    //        If the current branch length is greater than zero, do the rest of this recipe --#5
    if (length > 0)
    {
      //        adjustColor (recipe below)--#15.1
      adjustColor();
      Tortoise.move(length);
      //        drawLowerBranches (recipe below) --#6.1
      drawLowerBranches(length);
      //
      //    ------------- End of drawBranch recipe --#2.3
    }
  }
  private static void adjustColor()
  {
    //        ------------- Recipe for adjustColor --#15.2
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
    colors.put(60, PenColors.Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
    //Tortoise.setPenColor(colors.get());
    //        ------------- End of adjustColor --#15.3
  }
  private static void drawLowerBranches(int length)
  {
    //        ------------- Recipe for drawLowerBranches --#6.2
    Tortoise.turn(30);
    drawShorterBranch(length);
    Tortoise.turn(-60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    adjustcolor();
    Tortoise.move(-length);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void adjustcolor()
  {
    // TODO Auto-generated method stub
  }
  private static void drawShorterBranch(int length)
  {
    //
    //            ------------- Recipe for drawShorterBranch --#8.2
    drawBranch(length - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
  private static void drawBranch(int i)
  {
    // TODO Auto-generated method stub
  }
}