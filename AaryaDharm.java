import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import  java.awt.*;

/**
 * Does the Animation for AaryaDharm's image
 * 
 * @author Aarya Dharm
 * @version August 6, 2020
 */
public class AaryaDharm extends Student
{
    /**
     * Constructor for the AaryaDharm class.
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
    public AaryaDharm(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".png";    // Make sure to name your image files firstlast.jpeg, all lowercase!!!
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public AaryaDharm() {
        firstName="Aarya";
        lastName="Dharm";
        myRow=3;
        mySeat=2;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".png";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Act - does an animation when my image is clicked. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            sitting=false;
            sayName(soundFile);
            flicker();
            setRotation(0);
            setLocation(2, 3);
            provideLesson();
            sitDown();
        }
    }    
    /**
     * This method makes the image flicker around the screen for a while.
     */
    public void flicker(){
        int i=0;
        while(i<30) {
            setLocation(Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(6));
            i++;
            Greenfoot.delay(10);
            turn(Greenfoot.getRandomNumber(360));
        }
    }
    public void getName(){
        // may not need
    }
    public void answerQuestion(){
        // may not need
    }
    public void provideLesson(){
        try{
            Desktop.getDesktop().browse(new URL("https://drive.google.com/file/d/1lu72UjM4JoWIJnIByJckuli2tlNB4lG1/view?usp=sharing").toURI());
        } catch (Exception e) {}
    }
}
