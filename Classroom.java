import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();
         
        RidhiTamirasa rtk = new RidhiTamirasa("Ridhi", "Tamirasa", 2, 3);
        addObject(rtk, 1, 1);
        rtk.sitDown();

        AkashDarbha akashdarbha = new AkashDarbha("Akash", "Darbha", 3, 7);
        addObject(akashdarbha, 3, 7);
        akashdarbha.sitDown();  
        

        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();

        AnirudhNagasamudra anirudhnagasamudra = new AnirudhNagasamudra("Anirudh", "Nagasamudra", 9, 5);
        addObject(anirudhnagasamudra, 9, 5);
        anirudhnagasamudra.sitDown();
        
        TinhphongN tinhphongnguyen = new TinhphongN("Tinhphong", "Nguyen", 1, 2);
        addObject(tinhphongnguyen, 1, 2);
        tinhphongnguyen.sitDown();

        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 1, 3);
        addObject(tanishbaranwal, 1, 3);
        tanishbaranwal.sitDown();  
        
        JoeyHuang joeyhuang = new JoeyHuang("Joey", "Huang", 5, 5);
        addObject(joeyhuang, 5, 5);
        joeyhuang.sitDown(); 

        YashBansal yashbansal = new YashBansal("Yash", "Bansal", 1, 4);
        addObject(yashbansal, 3, 1);
        yashbansal.sitDown();

    }  

}
