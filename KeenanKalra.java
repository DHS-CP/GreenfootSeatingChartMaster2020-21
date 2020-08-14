import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Desktop;
import java.net.URI;

/**
 * The KeenanKalra class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class KeenanKalra extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the KeenanKalra class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public KeenanKalra(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public KeenanKalra() {
       firstName="Keenan";
       lastName="Kalra";
       myRow=2;
       mySeat=2;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
       soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
       setImage(portraitFile);
       sitting=true;
    }
    
     /**
     * Act - do whatever the KeenanKalra actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to watch Netflix!");
                spinImage();
                starClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
                provideLesson();
                sitDown();
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void provideLesson(){
         while (! sitting) {
            String q=Greenfoot.ask("Welcome to ReCurse, a lesson on Recursion. Would you like to start?");
            if (q.toLowerCase().contains("yes")){
                    q = Greenfoot.ask("Make sure to read the description of the video and watch the necessary parts in order to get the most out of this lesson. Enter anything to continue: ");
                    openVideoLesson();
                    sitDown();
            }
            else {
                q=Greenfoot.ask("Okay... May I sit down?"); 
            }
            if (q.toLowerCase().contains("yes")){
                Greenfoot.delay(10);
                sitDown();
            }
        }
    }
    
    private void openVideoLesson(){
        /*opens vid in another browser*/
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=jg5SqUtnzQQ"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void answerQuestion(){
        // may not need
    }
    public void spinImage() {
        for (int i = 0; i < 18; i++) {
            turn(20);
            Greenfoot.delay(3);
        }
    }
    /**
     * This is a local method specific to the KeenanKalra class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void starClass(){
        Greenfoot.delay(20);
        setLocation(0,6);
        Greenfoot.delay(10);
        // move right
        for (int i=0;i<=5;i++){
            setLocation(i,5-i);
            Greenfoot.delay(10);
        }
        for (int i=1;i<=6;i++){
            setLocation(4+i,i);
            Greenfoot.delay(10);
        }
        for (int i=1;i<=10;i++){
            setLocation(10-i,6-i*4/10);
            Greenfoot.delay(10);
        }
        for (int i=1;i<=10;i++){
            setLocation(i,2);
            Greenfoot.delay(10);
        }
        for (int i=1;i<=10;i++){
            setLocation(10-i,2+i*4/10);
            Greenfoot.delay(10);
        }
           Greenfoot.delay(20);
           returnToSeat();  
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

}
