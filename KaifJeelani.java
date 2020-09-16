import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Desktop;
import java.net.URI;

/**
 * This is my KaifJeelani implementation of Student modeled by KilgoreTrout
 * 
 * Credits to Opening YT Vid: https://www.reddit.com/r/java/comments/6jb4ep/is_it_possible_to_watchload_youtube_videos_in_java/
 * 
 * @author Kaif Jeelani
 */
public class KaifJeelani extends Student implements SpecialInterestOrHobby
{
    private String battlemusicfile = "BattleJeelaniKaif.mp3";
    /**
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public KaifJeelani(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".mp3";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public KaifJeelani() {
        firstName="Kaif";
        lastName="Jeelani   ";
        myRow=5;
        mySeat=2;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the KaifJeelani actor wants to do. This method is called whenever
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
            
                myHobby("I like to play the piano, code, and of course, play videogames!");
            
                readyForBattle(); 
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
    private void openVideoLesson(){
        /*opens vid in another browser*/
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=jg5SqUtnzQQ"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
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
    public void answerQuestion(){
        // may not need
    }
    /**
     * When called, plays Battle of a True Hero for a few seconds while the color of the portrait changes to a random shade to match each beat
     */
    public void readyForBattle(){
        Greenfoot.playSound(battlemusicfile);
        //delayList will keep track of delays to synchronize the color changes with the music
        List<Integer> delayList= new ArrayList<Integer>(){{
            add(20); add(20); add(20); add(20); add(10); add(10); 
            add(20); add(20); add(20); add(20); add(10); add(10); 
            add(20); add(20); add(20); add(20); add(10); add(10); 
            add(20); add(20); add(20); add(20); add(10); add(10);
        }};
        
        
        for(int delayTime:delayList){
            int r = Greenfoot.getRandomNumber(255);
            int g = Greenfoot.getRandomNumber(255);
            int b = Greenfoot.getRandomNumber(255);
            GreenfootImage tempKaifImage = new GreenfootImage(standingFile);
            tempKaifImage.setColor(new Color(r,g,b,100));
            tempKaifImage.fill();
            setImage(tempKaifImage);
            setLocation(2 + Greenfoot.getRandomNumber(9), 2 + Greenfoot.getRandomNumber(6));//random x and y from 2-11 and 2-8 respectively
            Greenfoot.delay(delayTime);
        }
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