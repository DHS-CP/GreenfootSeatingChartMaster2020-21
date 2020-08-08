import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math.*;

/**
 * The KilgoreTrout class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class DerekXu extends Student implements SpecialInterest, CSALearnedSoFar
{
    private static int run = 1;
    private static String q;
    /**
     * Constructor for the DerekXu class.
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
    public DerekXu(String f, String l, int r, int s) {
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
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
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
                sayName(soundFile);
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                go();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
                if (run % 2 == 1) {
                    provideLesson();
                }
                else {
                    answerQuestion();
                }
                sitDown();
                run++;
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
            String q=Greenfoot.ask("Are you ready to start (yes/no)");
            if (q.contains("yes")){
             // put in your lesson here - you can open up a browser for a screencast
             // Create a blackboard image and write to it, etc
             // Use an animated gif and dub over with audio - see "controls/show sound recoder"
             // from main greenfoot menu for a simple to use soud editor
            bluej.utility.Utility.openWebBrowser("https://www.youtube.com/watch?v=ZXfUZ588L_U&feature=youtu.be%22");
             
            // You can end the lesson and "sitDown" once the lesson is complete, or once
            // someone answers "yes" to the sitdown question
            }
            else {
              q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
            }
            if (q.equals("yes")){
                Greenfoot.delay(10);
                sitDown();
            }
            else {
                provideLesson();
            }
        }
        
    }
    public void answerQuestion(){
        q=Greenfoot.ask("What would you like to know?");
        if (q.contains("What are your interests?")){
            myInterest("I am interested in science, math and engineering!");
        }
        else if (q.contains("What did you learn in CSA?")) {
            LearnedSoFar("I have learned the fundementals of Java, such as how variables, functions, and objects work in this language.");
        }
        else {
            q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
        }
        if (q.equals("yes")){
            Greenfoot.delay(10);
            sitDown();
        }
        else {
            answerQuestion();
        }
    }
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    private void go() {
        for (int i = 0; i < 7; i++) {
            if (myRow - i < 0) {
                setLocation(getX(), 6 + myRow - i);
            }
            else {
                setLocation(getX(), myRow - i);
            }
            setRotation(180 * i % 2);
            Greenfoot.delay(10);
        }
        for (int i = 0; i < 9; i++) {
            if (myRow - i < 0) {
                setLocation(10 + myRow - i, getY());
            }
            else {
                setLocation(myRow - i, getY());
            }
            setRotation(180 * i % 2);
            Greenfoot.delay(10);
        }
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myInterest(String s) {
         q=Greenfoot.ask(s);
     }

     public void LearnedSoFar(String s) {
         q=Greenfoot.ask(s);
     }
}