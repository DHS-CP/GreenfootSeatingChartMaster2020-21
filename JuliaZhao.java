import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used as a model for your own class that represents you and your seating location in AP CSA
 * 
 * @author Julia Zhao
 * @version 1.0 Aug 4, 2020
 */
public class JuliaZhao extends Student implements StudentAthlete
{
    /**
     * Constructor for the JuliaZhao class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     * lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public JuliaZhao(String f, String l, int r, int s) {
        firstName = f;
        lastName = l;
        myRow = r;
        mySeat = s;
        portraitFile = f.toLowerCase() + l.toLowerCase() +".jpg";
        standingFile = firstName.toLowerCase() + lastName.toLowerCase() +"-standing.jpg";
        soundFile = f.toLowerCase() + l.toLowerCase() +".wav";
        setImage(portraitFile);
        sitting = true;
    }
    
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public JuliaZhao() {
        firstName = "Julia";
        lastName = "Zhao";
        myRow = 1;
        mySeat = 3;
        // imgFile=firstName.toLowerCase() + lastName.toLowerCase() +".jpg";
        portraitFile = "juliazhao.jpg";        
        standingFile = "juliazhao-standing.jpg";
        soundFile = "juliazhao.wav";
        setImage(portraitFile);
        sitting = true;
    }
    
    /**
     * Act - do whatever the JuliaZhao actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            // if (sitting){
                sitting = false;
                setImage(standingFile);
                System.out.println("");
                getName();
                sayName(soundFile);
                mySport("I do swim.");
            
                animation();
                provideLesson();
                sitDown();
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName() {
        System.out.println("My name is " + firstName + " " + lastName);
    }
    
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void provideLesson() {
        while (!sitting) {
            String q = Greenfoot.ask("Are you ready to start (yes/no)");
            
            if (q.contains("yes")) {
                // put in your lesson here - you can open up a browser for a screencast
                // Create a blackboard image and write to it, etc
                // Use an animated gif and dub over with audio - see "controls/show sound recoder"
                // from main greenfoot menu for a simple to use soud editor
        
                bluej.utility.Utility.openWebBrowser("https://drive.google.com/file/d/1BrYFVFSqf7KIi3GXVc4EId76xmf_WrA1/view?usp=sharing");

                // You can end the lesson and "sitDown" once the lesson is complete, or once
                // someone answers "yes" to the sitdown question
            }
            else {
                q = Greenfoot.ask("I don't understand the question... May I sit down?"); 
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
     * This is a local method specific to the JuliaZhao class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void animation() {
        Greenfoot.delay(10);
        for (int i = 1; i <= 5; i++) {
            setLocation(mySeat,i);
            Greenfoot.delay(10);
        } 
        for (int i = 4; i >= 1; i--) {
            setLocation(mySeat,i);
            Greenfoot.delay(10);
        }
        setImage(portraitFile);
    }
    
    public void mySport(String s) {
         System.out.println(s);
    }
}
