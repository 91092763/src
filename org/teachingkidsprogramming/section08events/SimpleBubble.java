package org.teachingkidsprogramming.section08events;

import java.util.Random;

import org.teachingextensions.WindowUtils.ProgramWindow;
import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.EventUtils.MouseLeftClickListener;
import org.teachingextensions.logo.utils.LineAndShapeUtils.Circle;

public class SimpleBubble implements MouseLeftClickListener
{
  ProgramWindow programWindow = new ProgramWindow("My Bubble");
  int           lower;
  int           upper;
  public SimpleBubble(int lowerSize, int upperSize)
  {
    programWindow.setWindowVisible(true);
    programWindow.addMouseLeftClickListener(this);
    prepareColorPalette();
    lower = lowerSize;
    upper = upperSize;
  }
  private void prepareColorPalette()
  {
    ColorWheel.addColor(PenColors.Purples.Purple);
    ColorWheel.addColor(PenColors.Blues.LightSteelBlue);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
  }
  @Override
  public void onLeftMouseClick(int x, int y)
  {
    createBubble(x, y);
  }
  private void createBubble(int x, int y)
  {
    //programWindow.clearWindow();
    Random random = new Random();
    int radius = NumberUtils.getRandomInt(lower, upper);
    // int radius = random.nextInt(upper) + lower;
    //Circle circle = new Circle(radius, ColorWheel.getNextColor());
    Circle circle = new Circle(radius, PenColors.getRandomColor());
    circle.setCenter(x, y);
    programWindow.add(circle);
  }
  public static void main(String[] args)
  {
    int lowerLimit = MessageBox.askForNumericalInput("Enter smallest size of circle: ");
    int upperLimit = MessageBox.askForNumericalInput("Enter largest size of circle: ");
    new SimpleBubble(lowerLimit, upperLimit);
  }
}