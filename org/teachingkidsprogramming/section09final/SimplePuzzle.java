package org.teachingkidsprogramming.section09final;

import java.awt.EventQueue;
import java.util.Arrays;
import java.util.Random;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.PuzzleUtils.AStarPlayer;
import org.teachingextensions.logo.utils.PuzzleUtils.Puzzle;
import org.teachingextensions.logo.utils.PuzzleUtils.PuzzleAnimation;
import org.teachingextensions.logo.utils.PuzzleUtils.PuzzleBoard;
import org.teachingextensions.logo.utils.PuzzleUtils.PuzzlePlayer;
import org.teachingextensions.logo.utils.PuzzleUtils.PuzzleState;
import org.teachingextensions.logo.utils.PuzzleUtils.PuzzleWindow;

public class SimplePuzzle implements Runnable
{
  public Puzzle      puzzle   = null;
  public PuzzleState solution = null;
  public int[]       cells    = {0, 1, 2, 3, 4, 5, 6, 7, 8};
  //
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new SimplePuzzle());
  }
  //
  public static int[] shuffled(int[] source)
  {
    int[] copy = Arrays.copyOf(source, source.length);
    Random rnd = new Random();
    for (int i = copy.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      int a = copy[index];
      copy[index] = copy[i];
      copy[i] = a;
    }
    return copy;
  }
  //
  @Override
  public void run()
  {
    this.setLookAndFeel();
    PuzzleState solution = null;
    //  Do this until the player finds a solution --#6.1
    do
    {
      //      Create a Message Box that shows the message "Looking for puzzle solution..." --#4
      MessageBox.showMessage("Looking for puzzle solution...");
      //      Try to solve the puzzle --#5.1
      try
      {
        int[] shuffled = shuffled(cells);
        puzzle = new Puzzle(shuffled);
        PuzzlePlayer player = new AStarPlayer(puzzle);
        solution = player.solve();
        // 
        PuzzleBoard board = new PuzzleBoard(puzzle, solution);
        // 
        //           Create a new Puzzle Window that takes a parameter named board -- #1.1
        PuzzleWindow pw = new PuzzleWindow(board);
        new Thread(new PuzzleAnimation(board)).start();
        //           Set the current puzzle window visibility to be true --#1.2             
        pw.setWindowVisible(true);
      }
      catch (IllegalStateException e)
      {
        MessageBox.showMessage("This puzzle is not solvable, click ok to try again");
        //          Create a Message Box that shows the message "This puzzle is not solvable, click ok to try again" --#5.4
        //      End of catch --#5.3
      }
      //  End of while --#6.2
    }
    while (solution == null || !solution.isSolution());
  }
  //
  private void setLookAndFeel()
  {
    try
    {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch (ClassNotFoundException | InstantiationException | UnsupportedLookAndFeelException
        | IllegalAccessException ignored)
    {
    }
  }
}
