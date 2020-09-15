import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Eshan Bathula 
 * 8/7/2020
 */
public class EshanBathula extends Student 
{

    /**
     * Constructor for the EshanBathula class.
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
    public EshanBathula(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".JPG";   
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.JPG";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav"; 
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public EshanBathula() {
        firstName="Eshan";
        lastName="Bathula";
        myRow=1;
        mySeat=1;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".JPG";
       portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".JPG";
       standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.JPG";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
        sitting=true;
    }
    
     /**
     * Act - do whatever the EshanBathula actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)){
          
                sitting=false;
                setImage(standingFile);
                System.out.println(""); 
                getName();
                sayName(soundFile);
 
                circleClass();  
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
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes")){
         bluej.utility.Utility.openWebBrowser("https://www.youtube.com/watch?v=Wv1mGChI0yw");
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
     * This is a local method specific to the EshanBathula class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
        setLocation(0,0);
         Greenfoot.delay(10);
        // move down
        for (int i=1;i<=9;i++){
            setLocation(0,i);
            Greenfoot.delay(10);
        }
        // move right
        for (int i=1;i<=5;i++){
            setLocation(i,9);
            Greenfoot.delay(10);
        }      
         // move up
        for (int i=9;i>=0;i--){
            setLocation(5,i);
            Greenfoot.delay(10);
        }      
              // move left
        for (int i=5;i>=0;i--){
            setLocation(i,0);
            Greenfoot.delay(10);
        }   
           Greenfoot.delay(20);
           returnToSeat();
    }
   
    

}