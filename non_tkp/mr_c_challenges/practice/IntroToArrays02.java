package non_tkp.mr_c_challenges.practice;

public class IntroToArrays02
{
  public static void main(String[] args)
  {
    String[] letterGrades = new String[13];
    letterGrades[0] = "A+";
    letterGrades[1] = "A";
    letterGrades[2] = "A-";
    letterGrades[3] = "B+";
    letterGrades[4] = "B";
    letterGrades[5] = "B-";
    letterGrades[6] = "C+";
    letterGrades[7] = "C";
    letterGrades[8] = "C-";
    letterGrades[9] = "D+";
    letterGrades[10] = "D";
    letterGrades[11] = "D-";
    letterGrades[12] = "F";
    //    for (int i = 0; i < letterGrades.length; i++)
    //    {
    //      System.out.println(letterGrades[i]);
    //    }
    System.out.println(assignLetterGrade(letterGrades, 98.0));
  }
  public static String assignLetterGrade(String[] arr, double pct)
  {
    if (pct >= 96.0) { return arr[0]; }
    return "";
  }
}
