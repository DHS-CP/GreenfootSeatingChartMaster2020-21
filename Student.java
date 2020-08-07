import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Sets the student location and methods like sitting down, returning to seat,
 * and giving the lesson.
 * 
 * @Oleg Bychenkov
 * @1.0
 */
public abstract class Student extends Actor
{
   //Instance variables
   public String firstName;
   public String lastName;
   public int myRow;         // rows start in the front of class (1), and end in the back of class
   public int mySeat;        // seats are left to right, 1-8
   public boolean isActive;  // can you think of an algorithm that would allow you to use this
                             // variable to use keyboard entry for all the instance of a student
                             // that we will create?
   public boolean sitting;   // Is the student sitting or standing (default sitting)                         
   
   public String portraitFile; // image used when sitting
   public String standingFile; // image used when standing
   public String soundFile; // firstName.toLowerCase()+lastName.toLowerCase()+".ext"; (.wav or .jpg)
   Classroom clas = (Classroom) getWorld();
   public void setRow(int r){
       myRow=r;
    }
    
    public void setSeat(int s){
       mySeat=s;
    }
    
    public abstract void  getName(); 
    public abstract void  provideLesson(); 
     public abstract void  answerQuestion(); 
    
    /**
     * Plays a sound file when called
     * @param String myNameFile  is the name of the sound file to play, ex "mySound.wav",
     */
    
    public int GetRow(){
        return myRow;
    }
    
    public int GetSeat(){
        return mySeat;
    }
    
    public void sayName(String myNameFile){
        Greenfoot.playSound(myNameFile);
    }
    
    public void returnToSeat(){
        setLocation(mySeat,myRow);
        setRotation(360); //make the image face the proper direction when returning
    }
    public void sitDown(){
        returnToSeat();
        setImage(portraitFile);
        sitting=true;
    }
        
 
}
