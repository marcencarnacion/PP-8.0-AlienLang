//Marc Encarnacion
//PP 8.0 AlienLang
//3/15/21
import java.util.Random;
class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Marc Encarnacion, PP 8.0 AlienLang");
    System.out.println(blurb());
  }//end main method

  private static String blurb()
  {
    return whoozit() + makeWhatzit();
  }//end method blurb

  private static String makeWhatzit()
  {
    String whatzit = whatzit();
    if(new Random().nextInt(5) >= 3)
    {
      whatzit += makeWhatzit();
    }//end if statement
    return whatzit;
  }//end makeWhatzit

  private static String whatzit()
  {
    String whatzit2 = "q";
    if(new Random().nextInt(5) >= 3)
    {
      whatzit2 +="z";
    }//end if statement
    else
    {
      whatzit2 +="d";
    }//end else
    whatzit2 += whoozit();
    return whatzit2;
  }//end method whatzit

  private static String whoozit()
  {
    return "x" + makeYs();
  }//end method whoozit

  private static String makeYs()
  {
    String y = "";
    if(new Random().nextInt(5) >=3)
    {
      y = "y";
      y += makeYs();
    }//end if statement
    return y;
  }//end method makeYs
}//end class main