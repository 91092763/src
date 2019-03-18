package non_tkp.mr_c_challenges.practice;

import java.util.Arrays;
import java.util.Random;

public class IntroToArrays03
{
  public static void main(String[] args)
  {
    int[] orig = new int[100];
    int[] copy = new int[100];
    fillArray(orig);
    System.out.println("Original Array\n");
    printArray(orig);
    copyArray(orig, copy);
    System.out.println("\n\nCopy Array\n");
    printArray(copy);
    sortArray(copy);
    System.out.println("\n\nSorted Copy Array\n");
    printArray(copy);
  }//end of main
  public static void sortArray(int[] a)
  {
    Arrays.sort(a);
  }
  public static void copyArray(int[] orig, int[] cpy)
  {
    for (int i = 0; i < orig.length; i++)
    {
      cpy[i] = orig[i];
    }
  }
  public static void printArray(int[] a)
  {
    for (int i = 0; i < a.length; i++)
    {
      System.out.print(a[i] + " ");
      if ((i + 1) % 10 == 0)
      {
        System.out.print('\n');
      }
    }
  }
  public static void fillArray(int[] arr)
  {
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++)
    {
      int myInt = rand.nextInt(90) + 10;
      arr[i] = myInt;
    }
  }
}//end of class
