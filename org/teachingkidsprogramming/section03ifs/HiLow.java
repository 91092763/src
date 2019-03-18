package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random myRand = new Random();
    int answer;
    answer = myRand.nextInt(100) + 1;// 1 - 100
    for (int i = 0; i < 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("What is your guess?");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You Won!");
        //System.exit(0);
        break;
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else
      {
        MessageBox.showMessage("Too low!");
      }
      System.out.print(i);
      if (i == 8)
      {
        MessageBox.showMessage("You lost!");
      }
    }
  }
}
