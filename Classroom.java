import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 
/**
 * Sets the size of the world and creates the students
 * 
 * @Oleg Bychenkov 
 * @1.0 
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   
     private void prepare()
    {
        
        OlegBychenkov olegbychenkov = new OlegBychenkov("Oleg", "Bychenkov", 2, 3);
        addObject(olegbychenkov, 2, 3);
        olegbychenkov.sitDown();

    }  
}
