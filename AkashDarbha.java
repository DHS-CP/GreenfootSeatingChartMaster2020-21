import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AkashDarbha here.
 * 
 * @author Akash Darbha 
 * @version 1.0
 */
public class AkashDarbha extends Student
{
    
    /**
     * Constructor for the KilgoreTrout class.
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
    public AkashDarbha(String f, String l, int r, int s) {
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
    public AkashDarbha() {
        firstName="Akash";
        lastName="Darbha";
        myRow=3;
        mySeat=4;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+"akashdarbha.jpg";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"lebronjames.jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+"akashdarbha.wav";
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
              if (sitting){
                sitting=false;
                setImage("lebronjames.jpg");
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName("akashdarbha.wav");
             
                myHobby("I like to play basketball!");
            
            
                enlargeimage();  //
                provideLesson();
                sitDown();
            }
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
          bluej.utility.Utility.openWebBrowser("https://www.youtube.com/watch?v=ZXfUZ588L_U&feature=youtu.be%22");
        }
        else {
          q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
        }
         if (q.equals("yes")){
            Greenfoot.delay(10);
            sitDown();
        }
    }
        
    }
    public void answerQuestion(){
        // may not need
    }
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void enlargeimage(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()*2, image.getHeight()*2);
        Greenfoot.delay(10);
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
