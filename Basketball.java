import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Basketball class can be used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Mr. Kaehms
 * @version 2.0 Aug 13, 2019
 * @version 3.0 July 21, 2020
 */
public class Basketball extends Student implements SpecialInterestOrHobby
{

    /**
     * Constructor for the Basketball class.
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
    public Basketball(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile="basketball.png"; // Make sure to name your image files firstlast.jpg, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public Basketball() {
        firstName="Basket";
        lastName="Ball";
        myRow=1;
        mySeat=3;
        // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        portraitFile="basketball.PNG";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the Basketball actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    
    public void act() 
    {
        //nothing
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        //not needed
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void provideLesson(){
        //not needed
    }
        
    
    public void answerQuestion(){
        // may not need
    }
    
    /**
     * This is a local method specific to the Basketball class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void bounce(){
        for (int i=3;i>=3;i--){
             setLocation(1,i);
             Greenfoot.delay(10);
            }
        for (int i=1;i>=0;i--){
             setLocation(i,3);
             Greenfoot.delay(10);
            }
        for (int i=1;i<=4;i++){
             setLocation(0,i);
             Greenfoot.delay(10);
            }
    }
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         //not needed
}

}
