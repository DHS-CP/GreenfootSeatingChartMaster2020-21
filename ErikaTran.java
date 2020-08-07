import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ErikaTran is a student in AP CSA seating chart.
 * 
 * @author Erika Tran
 * @version August 2, 2020
 */
public class ErikaTran extends Student implements SpecialInterestOrHobby
{
    /**
     * ErikaTran constructor
     */
    public ErikaTran(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile="erikatran.jpg";
        standingFile="erikatran-standing.JPG";
        soundFile="erikatran.wav";
        setImage(portraitFile);
        sitting = true;
    }
    
    /**
     * Default constructor for ErikaTran.
     */
    public ErikaTran() {
        firstName="Erika";
        lastName="Tran";
        myRow=1;
        mySeat=3;
        portraitFile="erikatran.jpg";
        standingFile="erikatran-standing.JPG";
        soundFile="erikatran.wav";
        setImage(portraitFile);
        sitting = true;
    }
    
    /**
     * Say name and move spin around when clicked on.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            sitting = false;
            setImage(standingFile);
            System.out.println("");
            getName();
            sayName();
            
            myHobby("I like to bake!");
            
            spin();
            provideLesson();
            sitDown();
        }
    }
    
    /**
     * Display name in the Terminal Window.
     */
    public void getName()
    {
        System.out.println("My name is Erika Tran");
    }
    
    /**
     * Say name
     */
    public void sayName()
    {
     Greenfoot.playSound(soundFile);   
    }
    
    /**
     * Spin at the top of the class when Erika is clicked on.
     */
    public void spin() 
    {
       setLocation(0,0);
       Greenfoot.delay(10);
     
      for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
            turn (90);
            Greenfoot.delay(15);
        }
        Greenfoot.delay(15);
        returnToSeat();
    }
    
    /**
     * If wanted, provide lesson about variables.
     */
    public void provideLesson()
    {
        while (! sitting) {
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes")){
         bluej.utility.Utility.openWebBrowser("https://tinyurl.com/variablesvideop2");
         Greenfoot.delay(50);
         q=Greenfoot.ask("May I sit down?");
         if (q.contains("yes")){
             Greenfoot.delay(10);
             sitDown();
            }
        }
        else {
          q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
        }
        if (q.contains("yes")){
            Greenfoot.delay(10);
            sitDown();
            }
      }
    }
    
    /**
     * Answer questions the class may ask.
     */
    public void  answerQuestion()
    {
        
    }
    
    /**
     * Return to seat after you have spun at the top of class.
     */
    public void returnToSeat()
    {
        setLocation(3,1);
        setRotation(0);
    }
    
    /**
     * Take seat and display sitting image.
     */
    public void sitDown()
    {
     setLocation(3,1);
     setRotation(0);
     setImage(portraitFile);
     sitting = true;
    }
    
    /**
     * Display my hobby in the Terminal Window
     */
    
    public void myHobby(String s) {
         System.out.println(s);
        }
}
