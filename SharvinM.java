    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    import java.util.List;
    /*
     * @author Sharvin Manjrekar
     * @version 2.0 Aug 3, 2020
     */
    public class SharvinM extends Student implements SpecialInterestOrHobby
    {
    
        /**
         * Constructor for the SharvinManjrekar class.
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
        public SharvinM(String f, String l, int r, int s) {
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
        
        public SharvinM() {
            firstName="sharvin";
            lastName="manjrekar";
            myRow=4;
            mySeat=4;
           // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
           portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
           standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
            soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
            setImage(portraitFile);
            sitting=true;
        }
        

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

                myHobby("I like to code!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat

                SpecialAnimation();  // Sharvin Manjrekar's special method... Please write one of your own. You can use this, but please modify it and be creative.
                provideLesson();
                sitDown();
            }

    } 
        
       
        public void getName(){
            System.out.println("My name is " + firstName + " " + lastName);
        }
       
       public void provideLesson(){
        while (! sitting) {
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes")){
        bluej.utility.Utility.openWebBrowser("https://drive.google.com/file/d/15MNpNF2abZgib_Ryijr2IMYZUW-yQMKg/view?usp=sharing");
           sitDown();
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
 public void SpecialAnimation(){
            for (int z = 0; z <4 ;z++){
                for (int w = 3; w > 0; w--){
                setLocation(z,w); 
                Greenfoot.delay(5);
                getImage().rotate(Greenfoot.getRandomNumber(255));
                }
            }

            returnToSeat();
    }
   
     public void myHobby(String s) {
         System.out.println(s);   
}
}