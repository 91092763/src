package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      wakeup();
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      approachOoze();
    }
    else
    {
      endStory();
    }
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
    String answer = MessageBox.askForTextInput("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
    if ("toilet".equalsIgnoreCase(answer))
    {
      pourIntoToilet();
    }
    else if ("backyard".equalsIgnoreCase(answer))
    {
      pourIntoBackyard();
      //                Tell the user "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water." --#17
      //                Ask the user "As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?" --#18
      //                If they answer "faint" --#20.1
      //                        Tell the user "You made a delicious soup! Yum! The end." --#21
      //                Otherwise, if they answer "scream" --#20.2
      //                    startStory --#22
      //                Otherwise, if they answer anything else --#20.3
      //                    endStory --#23
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    String answer = MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
    if ("yes".equalsIgnoreCase(answer))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("heck yes".equalsIgnoreCase(answer))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    //      endStory (recipe below) --#6.1
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. The end.");
    //      ------------- End of endStory recipe --#6.3
  }
  private static void wakeup()
  {
    //          ------------- Recipe for wakeUp --#2.2
    MessageBox.showMessage("You wake up and have a boring day. The end.");
    //          ------------- End of wakeUp recipe --#2.3
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
