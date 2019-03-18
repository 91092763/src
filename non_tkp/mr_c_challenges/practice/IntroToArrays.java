package non_tkp.mr_c_challenges.practice;

public class IntroToArrays
{
  public static void main(String[] args)
  {
    int myIntArray[];
    char myCharArray[];
    byte myBytrArray[];
    String myStringArray[];
    double myDoubleArray[];
    float myFloatArray[];
    boolean myBooleanArray[];
    short myShortArray[];
    long myLongArray[];
    myIntArray = new int[10];
    myIntArray[0] = 42;
    myIntArray[1] = 45;
    myIntArray[2] = 1000;
    myIntArray[3] = 69;
    myIntArray[4] = 420;
    myIntArray[5] = 89;
    myIntArray[6] = 74;
    myIntArray[7] = 50;
    myIntArray[8] = 7;
    myIntArray[9] = 1134;
    for (int i = 0; i < 10; i++)
    {
      System.out.println(myIntArray[i]);
    }
    myStringArray = new String[10];
    myStringArray[0] = "Hi there";
    myStringArray[1] = "Cotton Swab";
    myStringArray[3] = "Abigail Smithy";
    myStringArray[4] = "Hi there";
    myStringArray[5] = "Hi there";
    myStringArray[6] = "Hi there";
    myStringArray[7] = "Hi there";
    myStringArray[8] = "Hi there";
    myStringArray[9] = "Hi there";
    System.out.println(myStringArray[0]);
  }
}
