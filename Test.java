

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import ch.aplu.jgamegrid.*;
import java.awt.*;

/**
 * The test class. For testing of the second PakMan project.
 * @version (9.01.2015)
 */public class Test
{
    /**
     * First of all we need to prepare our project for the testing.
     * It would be to painful to change something in existing code and we kind 
     * of not allowed to do so for the Level class. So we won't change it, we will add
     * code instead and make an @overload for some methods.
     * You are free to change all you think need to be change.
     * Just not forget to shere it with us ;)
     */
    
    /* 
     * Copy and paste the folowing commented code in the Level class. Uncomment it there.
    
     //-----------------------------------------------------------------------------
    //---------------------------------for the TEST sake----------------------------------
    
      private String mazespec;
    public void setMaze(String mazespec){
    
        this.mazespec = mazespec;
    
    }
    
    

    public void setupDefaultTest()
    {
       
       

        // Copy structure into maze
        for (int i = 0; i < nbVertCells; i++)
        {
            for (int k = 0; k < nbHorzCells / 2; k++)
                maze[i][k] = charToTile(mazespec.charAt(15 * i + k));
            // Mirror at vertical axis at nbHorzCells / 2
            for (int k = nbHorzCells / 2; k < nbHorzCells; k++)
                maze[i][k] = charToTile(mazespec.charAt(15 * i + (29 - k)));
        }
    }
 //----------------------------------------------------------------------
 //---------------------------------end of the TEST----------------------------------
    
    */
    
    
   
    /**
     * Test for testing Tracy. I wonder if she(he?) moves only
     * 4 steps randomly and then hunt but only with 1 random step possible.
     * 
     * Nothing compile here yet. Don't panic.
     */
    
    //@Test
    public void tracyTest() {
    
       PaKman testGuy = new PaKman();
     
       testGuy.getLevel().setMaze(      //here we put our new maze.
            "xx.xxxxxxxxxxxx" + // 0
            "xx.xxxxxxxxxxxx" + // 1
            "..............x" + // 2
            "xx.xxxx.xxxxx.x" + // 3
            "xx.xxxx.xxxxx.x" + // 4
            "xx.xxxx.xxxxx.x" + // 5
            "xx............." + // 6
            "xx.xxxx.xx.xxxx" + // 7
            "xx.xxxx.xx.xxxx" + // 8
            "xx......xx....x" + // 9
            "xxxxxxx.xxxxx x" + // 10
            "xxxxxxx.xxxxx x" + // 11
            "xxxxxxx.xx     " + // 12
            "xxxxxxx.xx xxx " + // 13
            "xxxxxxx.xx xxx " + // 14
            "xx     .   xx  " + // 15
            "xxxxxxx.xx xxxx" + // 16
            "xxxxxxx.xx xxxx" + // 17
            "xxxxxxx.xx     " + // 18
            "xxxxxxx.xx xxxx" + // 19
            "xxxxxxx.xx xxxx" + // 20
            "..............x" + // 21
            "xx.xxxx.xxxxx.x" + // 22
            "xx.xxxx.xxxxx.x" + // 23
            "xx...xx........" + // 24
            "xxxx.xx.xx.xxxx" + // 25
            "xxxx.xx.xx.xxxx" + // 26
            "xx......xx....x" + // 27
            "xx.xxxxxxxxxx.x" + // 28
            "xx.xxxxxxxxxx.x" + // 29
            "..............." + // 30
            ".xxxxxxxxxxxxxx" + // 31
            ".xxxxxxxxxxxxxx"   // 32 
            );
        
    }
}
