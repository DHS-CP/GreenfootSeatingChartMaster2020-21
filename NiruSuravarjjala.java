import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Seating Chart Assignment - Once you click the picture, it should say my name and display it along with my liking for the hobby of singing. 
 * Then, it will bounce around like a spring and ask a question, if the answer is yes, it will provide a lesson and go back to its original position.
 * If the answer is no, it will ask another question and if the answer is yes, it will go back to it's original position. 
 * 
 * @author Nirupama Suravarjjala
 * @version 1.0 July 29, 2020
 */
public class NiruSuravarjjala extends Student
{
    public NiruSuravarjjala(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg"; // files are named using all lowercase letters along with .jpg
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg"; // files are named using all lowercase letters along with -standing.jpg
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav"; // files are named using all lowercase letters along with .wav
        setImage(portraitFile);
        sitting=true;
    }  
    
       /**
     * Default constructor, if you don't pass in a name and seating location
     *  1,5 is the first cell down and fifth cell right from the upper left corner. 
     */
     public NiruSuravarjjala() {
        firstName="Niru";
        lastName="Suravarjjala";
        myRow=3; // randomly chosen row assignment
        mySeat=3; // randomly chosen seat assignment
        
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg"; // files are named using all lowercase letters along with .jpg
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg"; // files are named using all lowercase letters along with -standing.jpg
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav"; // files are named using all lowercase letters along with .wav
        setImage(portraitFile);
        sitting=true;
      }
    
    /**
     * Act - do whatever the NiruSuravarjjala actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Act Method Code here
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                setImage(standingFile); // changes from sitting image to standing image
                System.out.println(""); // prints a blank line to create space between any student output.
                getName();
                sayName(soundFile); // plays sound file
            
                myHobby("I like to sing!"); // print my hobby
            
                Bounce();  // Niru Suravarjjala's special method...image will bounce around and play the spring sound. 
                provideLesson();
                sitDown(); // call the sitDown() method to move back  to your seat
            }
        
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName + "!"); // prints my name
    }
    
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.
     * Links to the notes my group and I took, as well as a video lesson will open.
     */
    public void provideLesson(){
        while (! sitting) { // while standing - at the end of Bounce method
        String q=Greenfoot.ask("Are you ready to start (yes/no)"); // asks question in pop-up at the bottom of screen
        if (q.contains("yes")){ // if the response contains yes...
         bluej.utility.Utility.openWebBrowser ("https://tinyurl.com/variablenotes"); // opens link to notes my group and I took
         bluej.utility.Utility.openWebBrowser ("https://tinyurl.com/variablesvideop2"); // opens link to video lesson my group and I made
           }
           else { // if the answer does not contain yes...
          q=Greenfoot.ask("I don't understand the question... May I sit down?");  //asks question in pop-up at the bottom of screen
          }
         if (q.equals("yes")){// if the answer is yes...
            Greenfoot.delay(10); // wait
            sitDown(); // place my picture back in randomly assigned row and seat
          }
        }
        
       }
       
    public void answerQuestion(){
        // may not need
    }
    
    /**
     * This is a local method specific to the NiruSuravarjjala class used to animate the character once the image is clicked on.
     * The Bounce allows the image to bounce up and down while a bounce sound is applied. 
     */
    public void Bounce(){
        setLocation(myRow,mySeat);
         Greenfoot.delay(10);
        // move right and up
        for (int i=1;i<=3;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        // move down and play sound
        for (int i=1;i<=3;i++){
            setLocation(3,i);
            Greenfoot.delay(10);
            Greenfoot.playSound("bounce.wav");
        } 
        // move up
        for (int i=1;i<=3;i++){
            setLocation(i+3,i);
            Greenfoot.delay(10);
        }
        //move down
        for (int i=1;i<=6;i++){
            setLocation(6,i-2);
            Greenfoot.delay(10);
        }     
           Greenfoot.delay(20); // wait
           returnToSeat(); // return back to seat 
    }
    
     /**
     * myHobby is one of the interfaces provided (a contract for the methods implemented in code) 
     */
     public void myHobby(String s) {
         System.out.println(s); // print out my hobby in a pop-up box
    }
    
}
