package non_tkp.mr_c_challenges.practice;

public class IntroToConditionals2
{
  public static String main(String[] args)
  {
    int percentage = 89;
    System.out.println("percentage = " + percentage);
    System.out.println("you earned: " + assignLetterGrade(percentage));
  }

    public static String assignLetterGrade(int pct)
    {
      if(pct >= 90)
      {
        return "A";
      }
      else if(pct >= 80)
      {
       return "B"; 
      }
      else if( pct >= 70)
      {
        return "C";
      }
      else if(pct >= 60)
      {
        return "D";
      }
    }// end of method
  }
}
