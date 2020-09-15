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
        
        JoshuaChon joshuachon = new JoshuaChon("Joshua", "Chon", 1, 6);
        addObject(joshuachon, 1, 6);
        joshuachon.sitDown();

        DerekXu derekxu = new DerekXu("Derek", "Xu", 2, 4);
        addObject(derekxu, 2, 4);
        derekxu.sitDown();
        
        NibodhVallapureddy nibodhvallapureddy = new NibodhVallapureddy("Nibodh", "Vallapureddy", 1, 1);
        addObject(nibodhvallapureddy, 1, 1);
        nibodhvallapureddy.sitDown();

        KaifJeelani kaifjeelani = new KaifJeelani("Kaif", "Jeelani", 5,2);
        addObject(kaifjeelani, 5, 2);
        kaifjeelani.sitDown();

         
        EricZheng ericzheng = new EricZheng("Eric", "Zheng", 6, 1);
        addObject(ericzheng, 6, 1);
        ericzheng.sitDown();

        ArvindKumar arvindkumar = new ArvindKumar("Arvind", "Kumar", 3, 3);
        addObject(arvindkumar, 3, 3);
        arvindkumar.sitDown();
         
        RidhiTamirasa rtk = new RidhiTamirasa("Ridhi", "Tamirasa", 2, 3);
        addObject(rtk, 2, 3);
        rtk.sitDown();

        AkashDarbha akashdarbha = new AkashDarbha("Akash", "Darbha", 3, 4);
        addObject(akashdarbha, 3, 4);
        akashdarbha.sitDown();  

       	SharvinM SharvinManjrekar = new SharvinM("Sharvin", "Manjrekar", 4, 4);
        addObject(SharvinManjrekar, 4, 4);
        SharvinManjrekar.sitDown();
  
        KeenanKalra keenankalra = new KeenanKalra("Keenan", "Kalra", 2, 2);
        addObject(keenankalra, 2, 2);
        keenankalra.sitDown();

        AnirudhNagasamudra anirudhnagasamudra = new AnirudhNagasamudra("Anirudh", "Nagasamudra", 5, 4);
        addObject(anirudhnagasamudra, 5, 4);
        anirudhnagasamudra.sitDown();
        
        TinhphongN tinhphongnguyen = new TinhphongN("Tinhphong", "Nguyen", 1, 2);
        addObject(tinhphongnguyen, 1, 2);
        tinhphongnguyen.sitDown();
       
        ChelseaLee chelsealee = new ChelseaLee("Chelsea", "Lee", 4, 2);
        addObject(chelsealee, 4, 2);
        chelsealee.sitDown();
        
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 4, 1);
        addObject(tanishbaranwal, 4, 1);
        tanishbaranwal.sitDown();  
        
        JoeyHuang joeyhuang = new JoeyHuang("Joey", "Huang", 2, 1);
        addObject(joeyhuang, 2, 1);
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
        
        AnishShivamurthy anishshivamurthy = new AnishShivamurthy("Anish", "Shivamurthy", 4, 3);
        addObject(anishshivamurthy, 4, 3);
        anishshivamurthy.sitDown();
        
        JuliaZhao juliazhao = new JuliaZhao("Julia", "Zhao", 1, 3);
        addObject(juliazhao, 1, 3);
        juliazhao.sitDown();
        
        KellieTai kellietai = new KellieTai("Kellie", "Tai", 1, 4);
        addObject(kellietai, 1, 4);
        kellietai.sitDown();
        
        AyushBandopadhyay ayushbandopadhyay = new AyushBandopadhyay("Ayush", "Bandopadhyay", 5, 3);
        addObject(ayushbandopadhyay, 5, 3);
        ayushbandopadhyay.sitDown();
        
        NiruSuravarjjala nirusuravarjjala = new NiruSuravarjjala("Niru", "Suravarjjala", 1, 5);
        addObject(nirusuravarjjala, 1, 5);
        nirusuravarjjala.sitDown();
        

    }  

}
