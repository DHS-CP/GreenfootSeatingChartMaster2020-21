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
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 4, 4);
        addObject(ericzheng, 1, 1);

        DerekXu derekxu = new DerekXu("Derek", "Xu", 2, 4);
        addObject(derekxu, 2, 4);
        derekxu.sitDown();

        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();
        
        KaifJeelani kaifjeelani = new KaifJeelani("Kaif", "Jeelani", 2,2);
        addObject(kaifjeelani, 2, 2);
        kaifjeelani.sitDown();
         
        
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 6, 6);
        addObject(ericzheng, 6, 6);
        ericzheng.sitDown();

        ArvindKumar arvindkumar = new ArvindKumar("Arvind", "Kumar", 3, 3);
        addObject(arvindkumar, 3, 3);
        arvindkumar.sitDown();
         
        RidhiTamirasa rtk = new RidhiTamirasa("Ridhi", "Tamirasa", 2, 3);
        addObject(rtk, 2, 3);
        rtk.sitDown();

        AkashDarbha akashdarbha = new AkashDarbha("Akash", "Darbha", 3, 7);
        addObject(akashdarbha, 3, 7);
        akashdarbha.sitDown();  

	SharvinM SharvinManjrekar = new SharvinM("Sharvin", "Manjrekar", 4, 4);
        addObject(SharvinManjrekar, 4, 4);
        SharvinManjrekar.sitDown();
  
        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();

        AnirudhNagasamudra anirudhnagasamudra = new AnirudhNagasamudra("Anirudh", "Nagasamudra", 9, 5);
        addObject(anirudhnagasamudra, 9, 5);
        anirudhnagasamudra.sitDown();
        
        TinhphongN tinhphongnguyen = new TinhphongN("Tinhphong", "Nguyen", 1, 2);
        addObject(tinhphongnguyen, 1, 2);
        tinhphongnguyen.sitDown();
       
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 4, 6);
        addObject(chelsealee, 4, 6);
        chelsealee.sitDown();
        
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 1, 3);
        addObject(tanishbaranwal, 1, 3);
        tanishbaranwal.sitDown();  
        
        JoeyHuang joeyhuang = new JoeyHuang("Joey", "Huang", 5, 5);
        addObject(joeyhuang, 5, 5);
        joeyhuang.sitDown(); 
        
        YashBansal yashbansal = new YashBansal("Yash", "Bansal", 3, 1);
        addObject(yashbansal, 3, 1);
        yashbansal.sitDown();
        
        TrishaMoorkoth trishamoorkoth = new TrishaMoorkoth("Trisha", "Moorkoth", 6, 2);
        addObject(trishamoorkoth, 6, 2);
        trishamoorkoth.sitDown();

        ShahilPatel shahilpatel = new ShahilPatel("Shahil", "Patel", 2, 4);
        addObject(shahilpatel, 2, 4);
        shahilpatel.sitDown();
        
        SaiBalakumar saibalakumar = new SaiBalakumar("Sai", "Balakumar", 3, 2);
        addObject(saibalakumar, 3, 2);
        saibalakumar.sitDown();
        
        AnishShivamurthy anishshivamurthy = new AnishShivamurthy("Anish", "Shivamurthy", 5, 6);
        addObject(anishshivamurthy, 5, 6);
        anishshivamurthy.sitDown();
        
        JuliaZhao juliazhao = new JuliaZhao("Julia", "Zhao", 1, 6);
        addObject(juliazhao, 1, 6);
        juliazhao.sitDown();
        
        KellieTai kellietai = new KellieTai("Kellie", "Tai", 3, 3);
        addObject(kellietai, 3, 3);
        kellietai.sitDown();
    }  

}
